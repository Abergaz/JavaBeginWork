package com.javabegin.training.game.goldman_8.objects;


import com.javabegin.training.game.goldman_8.abstracts.AbstractGameObject;
import com.javabegin.training.game.goldman_8.abstracts.AbstractMovingObject;
import com.javabegin.training.game.goldman_8.enums.ActionResult;
import com.javabegin.training.game.goldman_8.enums.GameObjectType;
import com.javabegin.training.game.goldman_8.enums.MovingDirection;


/**
 * класс отвечает за работу объекта GOLDMAN - главный персонаж игры
 */
public class GoldMan extends AbstractMovingObject {

    private int totalScore = 0;// кол-во очков, собранных игроком
    private int turnsNumber = 0;// кол-во сделанных ходов

    public GoldMan(Coordinate coordinate) {
        super.setType(GameObjectType.GOLDMAN);
        super.setCoordinate(coordinate);
        super.setIcon(getImageIcon("/com/javabegin/training/game/goldman_8/images/goldman_up.png"));
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
                super.setIcon(getImageIcon("/com/javabegin/training/game/goldman_8/images/goldman_down.png"));
                break;
            case LEFT:
                super.setIcon(getImageIcon("/com/javabegin/training/game/goldman_8/images/goldman_left.png"));
                break;
            case RIGHT:
                super.setIcon(getImageIcon("/com/javabegin/training/game/goldman_8/images/goldman_right.png"));
                break;
            case UP:
                super.setIcon(getImageIcon("/com/javabegin/training/game/goldman_8/images/goldman_up.png"));
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

            case MONSTER:  {
                return ActionResult.DIE;
            }
                
        }

        return super.doAction(gameObject);
    }
}