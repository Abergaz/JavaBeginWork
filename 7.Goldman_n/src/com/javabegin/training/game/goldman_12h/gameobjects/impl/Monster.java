package com.javabegin.training.game.goldman_12h.gameobjects.impl;


import com.javabegin.training.game.goldman_12h.enums.ActionResult;
import com.javabegin.training.game.goldman_12h.enums.GameObjectType;
import com.javabegin.training.game.goldman_12h.enums.MovingDirection;
import com.javabegin.training.game.goldman_12h.gameobjects.abstracts.AbstractGameObject;
import com.javabegin.training.game.goldman_12h.gameobjects.abstracts.AbstractSoundObject;

import javax.sound.sampled.Clip;

/**
 * класс отвечает за работу объекта MONSTER
 */
public class Monster extends AbstractSoundObject {

    private transient Clip clip;

    public Monster(Coordinate coordinate) {
        super.setType(GameObjectType.MONSTER);
        super.setCoordinate(coordinate);
        super.setIcon(getImageIcon("/com/javabegin/training/game/goldman_12h/images/monster_up.jpg"));// иконку по-умолчанию (можно сделать реализацию случайного выбора иконки)

        movingImages.put(MovingDirection.UP, getImageIcon("/com/javabegin/training/game/goldman_12h/images/monster_up.jpg"));
        movingImages.put(MovingDirection.DOWN, getImageIcon("/com/javabegin/training/game/goldman_12h/images/monster_down.jpg"));
        movingImages.put(MovingDirection.LEFT, getImageIcon("/com/javabegin/training/game/goldman_12h/images/monster_left.jpg"));
        movingImages.put(MovingDirection.RIGHT, getImageIcon("/com/javabegin/training/game/goldman_12h/images/monster_right.jpg"));

    }

    @Override
    public ActionResult doAction(AbstractGameObject gameObject) {

        switch (gameObject.getType()) {

            case TREASURE:
            case MONSTER:
            case TREE: { // монстр не может наступать на сокровище, дерево и на других монстров
                return ActionResult.NO_ACTION;
            }

            case GOLDMAN: {
                return ActionResult.DIE;
            }

        }

        return super.doAction(gameObject);
    }

    @Override
    public Clip getSoundClip(ActionResult actionResult) {
        switch (actionResult) {
            case DIE:
                return super.getDieClip();

        }

        return null;
    }
}