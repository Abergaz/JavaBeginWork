package com.javabegin.training.game.goldman_3h.objects;


import com.javabegin.training.game.goldman_3h.abstracts.AbstractGameObject;
import com.javabegin.training.game.goldman_3h.abstracts.AbstractMovingObject;
import com.javabegin.training.game.goldman_3h.enums.GameObjectType;
import com.javabegin.training.game.goldman_3h.enums.MovingDirection;

/**
 * класс отвечает за работу объекта MONSTER
 */
public class Monster extends AbstractMovingObject {

    public Monster(Coordinate coordinate) {
        super.setType(GameObjectType.MONSTER);
        super.setCoordinate(coordinate);

        super.setIconRight(getImageIcon("/ru/javabegin/training/goldman/images/monster_right.jpg"));
        super.setIconLeft(getImageIcon("/ru/javabegin/training/goldman/images/monster_left.jpg"));
        super.setIconUp(getImageIcon("/ru/javabegin/training/goldman/images/monster_up.jpg"));
        super.setIconDown(getImageIcon("/ru/javabegin/training/goldman/images/monster_down.jpg"));

        super.setIcon(getIconLeft());// по-умолчанию будет использоваться эта иконка
    }

    @Override
    public void move(MovingDirection direction) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void getMoveResult(AbstractGameObject objectInNewCoordinate) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
