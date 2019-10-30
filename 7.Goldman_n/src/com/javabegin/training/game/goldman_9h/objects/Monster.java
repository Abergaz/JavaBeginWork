package com.javabegin.training.game.goldman_9h.objects;


import com.javabegin.training.game.goldman_9h.abstracts.AbstractGameObject;
import com.javabegin.training.game.goldman_9h.abstracts.AbstractMovingObject;
import com.javabegin.training.game.goldman_9h.enums.ActionResult;
import com.javabegin.training.game.goldman_9h.enums.GameObjectType;
import com.javabegin.training.game.goldman_9h.enums.MovingDirection;
import com.javabegin.training.game.goldman_9h.objects.sound.SoundObject;

/**
 * класс отвечает за работу объекта MONSTER
 */
public class Monster extends AbstractMovingObject implements SoundObject {

    public Monster(Coordinate coordinate) {
        super.setType(GameObjectType.MONSTER);
        super.setCoordinate(coordinate);

        super.setIcon(getImageIcon("/com/javabegin/training/game/goldman_9h/images/monster_up.jpg"));// иконку по-умолчанию (можно сделать реализацию случайного выбора иконки)

    }

    @Override
    public void changeIcon(MovingDirection direction) {
        switch (direction) {
            case DOWN:
                super.setIcon(getImageIcon("/com/javabegin/training/game/goldman_9h/images/monster_down.jpg"));
                break;
            case LEFT:
                super.setIcon(getImageIcon("/com/javabegin/training/game/goldman_9h/images/monster_right.jpg"));
                break;
            case RIGHT:
                super.setIcon(getImageIcon("/com/javabegin/training/game/goldman_9h/images/monster_right.jpg"));
                break;
            case UP:
                super.setIcon(getImageIcon("/com/javabegin/training/game/goldman_9h/images/monster_up.jpg"));
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
    public String getSoundPath(ActionResult actionResult) {
        switch (actionResult) {
            case DIE: return "die.wav";
        }

        return null;
    }
}
