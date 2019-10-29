package com.javabegin.training.game.goldman_8.objects;


import com.javabegin.training.game.goldman_8.abstracts.AbstractGameObject;
import com.javabegin.training.game.goldman_8.abstracts.AbstractMovingObject;
import com.javabegin.training.game.goldman_8.enums.ActionResult;
import com.javabegin.training.game.goldman_8.enums.GameObjectType;
import com.javabegin.training.game.goldman_8.enums.MovingDirection;

/**
 * класс отвечает за работу объекта MONSTER
 */
public class Monster extends AbstractMovingObject {

    public Monster(Coordinate coordinate) {
        super.setType(GameObjectType.MONSTER);
        super.setCoordinate(coordinate);

        super.setIcon(getImageIcon("/com/javabegin/training/game/goldman_8/images/monster_up.jpg"));// иконку по-умолчанию (можно сделать реализацию случайного выбора иконки)

    }

    @Override
    public void changeIcon(MovingDirection direction) {
        switch (direction) {
            case DOWN:
                super.setIcon(getImageIcon("/com/javabegin/training/game/goldman_8/images/monster_down.jpg"));
                break;
            case LEFT:
                super.setIcon(getImageIcon("/com/javabegin/training/game/goldman_8/images/monster_right.jpg"));
                break;
            case RIGHT:
                super.setIcon(getImageIcon("/com/javabegin/training/game/goldman_8/images/monster_right.jpg"));
                break;
            case UP:
                super.setIcon(getImageIcon("/com/javabegin/training/game/goldman_8/images/monster_up.jpg"));
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
}
