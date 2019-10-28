package com.javabegin.training.game.goldman_5h.objects;


import com.javabegin.training.game.goldman_5h.abstracts.AbstractGameObject;
import com.javabegin.training.game.goldman_5h.abstracts.AbstractMovingObject;
import com.javabegin.training.game.goldman_5h.enums.GameObjectType;
import com.javabegin.training.game.goldman_5h.enums.MovingDirection;

/**
 * класс отвечает за работу объекта MONSTER
 */
public class Monster extends AbstractMovingObject {

    public Monster(Coordinate coordinate) {
        super.setType(GameObjectType.MONSTER);
        super.setCoordinate(coordinate);

        super.setIconRight(getImageIcon("/com/javabegin/training/game/goldman_5h/images/monster_right.jpg"));
        super.setIconLeft(getImageIcon("/com/javabegin/training/game/goldman_5h/images/monster_left.jpg"));
        super.setIconUp(getImageIcon("/com/javabegin/training/game/goldman_5h/images/monster_up.jpg"));
        super.setIconDown(getImageIcon("/com/javabegin/training/game/goldman_5h/images/monster_down.jpg"));

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
