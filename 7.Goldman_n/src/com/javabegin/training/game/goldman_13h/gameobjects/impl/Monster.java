package com.javabegin.training.game.goldman_13h.gameobjects.impl;

import java.util.EnumMap;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;

import com.javabegin.training.game.goldman_13h.enums.ActionResult;
import com.javabegin.training.game.goldman_13h.enums.GameObjectType;
import com.javabegin.training.game.goldman_13h.enums.MovingDirection;
import com.javabegin.training.game.goldman_13h.gameobjects.abstracts.AbstractGameObject;
import com.javabegin.training.game.goldman_13h.gameobjects.abstracts.AbstractSoundObject;

/**
 * класс отвечает за работу объекта MONSTER
 */
public class Monster extends AbstractSoundObject {

    protected static EnumMap<MovingDirection, ImageIcon> monsterImages = new EnumMap<>(MovingDirection.class);// карта иконок для всех направлений монстра

    public Monster(Coordinate coordinate) {
        super.setType(GameObjectType.MONSTER);
        super.setCoordinate(coordinate);
        super.setIcon(getImageIcon("/com/javabegin/training/game/goldman_13h/images/monster_up.jpg"));// иконку по-умолчанию (можно сделать реализацию случайного выбора иконки)

        if (monsterImages.isEmpty()) {// для всех монстров будут одинаковые картики, поэтому нет смысла создавать для каждого объекта отдельный map
            monsterImages.put(MovingDirection.UP, getImageIcon("/com/javabegin/training/game/goldman_13h/images/monster_up.jpg"));
            monsterImages.put(MovingDirection.DOWN, getImageIcon("/com/javabegin/training/game/goldman_13h/images/monster_down.jpg"));
            monsterImages.put(MovingDirection.LEFT, getImageIcon("/com/javabegin/training/game/goldman_13h/images/monster_left.jpg"));
            monsterImages.put(MovingDirection.RIGHT, getImageIcon("/com/javabegin/training/game/goldman_13h/images/monster_right.jpg"));
        }

    }

    @Override
    public ActionResult doAction(AbstractGameObject gameObject) {
        
        if (gameObject == null){
            return ActionResult.NO_ACTION;
        }

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

    @Override
    public void changeIcon(MovingDirection direction) {
        super.setIcon(monsterImages.get(direction));
    }
}