package com.javabegin.training.game.goldman_7h.objects;


import com.javabegin.training.game.goldman_7h.abstracts.AbstractMovingObject;
import com.javabegin.training.game.goldman_7h.enums.GameObjectType;
import com.javabegin.training.game.goldman_7h.enums.MovingDirection;

/**
 * класс отвечает за работу объекта MONSTER
 */
public class Monster extends AbstractMovingObject {

    public Monster(Coordinate coordinate) {
        super.setType(GameObjectType.MONSTER);
        super.setCoordinate(coordinate);

        super.setIcon(getImageIcon("/com/javabegin/training/game/goldman_7h/images/monster_up.jpg"));// иконку по-умолчанию (можно сделать реализацию случайного выбора иконки)

    }

    @Override
    public void changeIcon(MovingDirection direction) {
        switch (direction) {
            case DOWN:
                super.setIcon(getImageIcon("/com/javabegin/training/game/goldman_7h/images/monster_down.jpg"));
                break;
            case LEFT:
                super.setIcon(getImageIcon("/com/javabegin/training/game/goldman_7h/images/monster_right.jpg"));
                break;
            case RIGHT:
                super.setIcon(getImageIcon("/com/javabegin/training/game/goldman_7h/images/monster_right.jpg"));
                break;
            case UP:
                super.setIcon(getImageIcon("/com/javabegin/training/game/goldman_7h/images/monster_up.jpg"));
                break;
        }
    }

 


}
