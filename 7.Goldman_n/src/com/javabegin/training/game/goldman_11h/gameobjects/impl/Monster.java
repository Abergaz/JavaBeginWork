package com.javabegin.training.game.goldman_11h.gameobjects.impl;


import com.javabegin.training.game.goldman_11h.enums.ActionResult;
import com.javabegin.training.game.goldman_11h.enums.GameObjectType;
import com.javabegin.training.game.goldman_11h.enums.MovingDirection;
import com.javabegin.training.game.goldman_11h.gameobjects.abstracts.AbstractGameObject;
import com.javabegin.training.game.goldman_11h.gameobjects.abstracts.AbstractSoundObject;

import javax.sound.sampled.Clip;

/**
 * класс отвечает за работу объекта MONSTER
 */
public class Monster extends AbstractSoundObject {

    private transient Clip clip;

    public Monster(Coordinate coordinate) {
        super.setType(GameObjectType.MONSTER);
        super.setCoordinate(coordinate);
        super.setIcon(getImageIcon("/com/javabegin/training/game/goldman_11h/images/monster_up.jpg"));// иконку по-умолчанию (можно сделать реализацию случайного выбора иконки)

    }

    @Override
    public void changeIcon(MovingDirection direction) {
        switch (direction) {
            case DOWN:
                super.setIcon(getImageIcon("/com/javabegin/training/game/goldman_11h/images/monster_down.jpg"));
                break;
            case LEFT:
                super.setIcon(getImageIcon("/com/javabegin/training/game/goldman_11h/images/monster_right.jpg"));
                break;
            case RIGHT:
                super.setIcon(getImageIcon("/com/javabegin/training/game/goldman_11h/images/monster_right.jpg"));
                break;
            case UP:
                super.setIcon(getImageIcon("/com/javabegin/training/game/goldman_11h/images/monster_up.jpg"));
                break;
        }
    }

    @Override
    public ActionResult doAction(AbstractGameObject gameObject) {

        switch (gameObject.getType()) {


            case TREASURE:
            case MONSTER: { // монстр не может наступать на сокровище и на других монстров
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