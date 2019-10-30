package com.javabegin.training.game.goldman_9h.objects;


import com.javabegin.training.game.goldman_9h.abstracts.AbstractGameObject;
import com.javabegin.training.game.goldman_9h.abstracts.AbstractMovingObject;
import com.javabegin.training.game.goldman_9h.enums.ActionResult;
import com.javabegin.training.game.goldman_9h.enums.GameObjectType;
import com.javabegin.training.game.goldman_9h.enums.MovingDirection;
import com.javabegin.training.game.goldman_9h.objects.sound.SoundObject;

import static com.javabegin.training.game.goldman_9h.enums.GameObjectType.*;

/**
 * класс отвечает за работу объекта GOLDMAN - главный персонаж игры
 */
public class GoldMan extends AbstractMovingObject implements SoundObject {

    private int totalScore = 0;// кол-во очков, собранных игроком
    private int turnsNumber = 0;// кол-во сделанных ходов

    public GoldMan(Coordinate coordinate) {
        super.setType(GOLDMAN);
        super.setCoordinate(coordinate);
        super.setIcon(getImageIcon("/com/javabegin/training/game/goldman_9h/images/goldman_up.png"));
    }

    public void addSTotalcore(int score) {
        this.totalScore += score;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public int getTurnsNumber() {
        return turnsNumber;
    }

    public void setTurnsNumber(int turnsNumber) {
        this.turnsNumber = turnsNumber;
    }

    @Override
    public void changeIcon(MovingDirection direction) {
        switch (direction) {
            case DOWN:
                super.setIcon(getImageIcon("/com/javabegin/training/game/goldman_9h/images/goldman_down.png"));
                break;
            case LEFT:
                super.setIcon(getImageIcon("/com/javabegin/training/game/goldman_9h/images/goldman_left.png"));
                break;
            case RIGHT:
                super.setIcon(getImageIcon("/com/javabegin/training/game/goldman_9h/images/goldman_right.png"));
                break;
            case UP:
                super.setIcon(getImageIcon("/com/javabegin/training/game/goldman_9h/images/goldman_up.png"));
                break;
        }
    }

    @Override
    public ActionResult doAction(AbstractGameObject gameObject) {

        turnsNumber++;

        switch (gameObject.getType()) {

            case TREASURE: {
                totalScore += ((Treasure) gameObject).getScore();
                return ActionResult.COLLECT_TREASURE;
            }

            case MONSTER: {
                return ActionResult.DIE;
            }

            case EXIT: {
                totalScore *= 2;
                return ActionResult.WIN;
            }

        }

        return super.doAction(gameObject);
    }

    @Override
    public String getSoundPath(ActionResult actionResult) {
        switch (actionResult) {
            case COLLECT_TREASURE: return "treasure.wav";
            case DIE: return "die.wav";
            case WIN: return "win.wav";
        }

        return null;
    }
}
