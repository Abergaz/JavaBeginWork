package com.javabegin.training.game.goldman_3h.objects;


import com.javabegin.training.game.goldman_3h.abstracts.AbstractGameObject;
import com.javabegin.training.game.goldman_3h.abstracts.AbstractMovingObject;
import com.javabegin.training.game.goldman_3h.enums.GameObjectType;
import com.javabegin.training.game.goldman_3h.enums.MovingDirection;

/**
 * класс отвечает за работу объекта GOLDMAN - главный персонаж игры
 */
public class GoldMan extends AbstractMovingObject {

    private int totalScore = 0;// кол-во очков, собранных игроком
    private int turnsNumber = 0;// кол-во сделанных ходов

    public GoldMan(Coordinate coordinate) {
        super.setType(GameObjectType.GOLDMAN);
        super.setCoordinate(coordinate);

        super.setIconDown(getImageIcon("/ru/javabegin/training/goldman/images/goldman_down.png"));
        super.setIconUp(getImageIcon("/ru/javabegin/training/goldman/images/goldman_up.png"));
        super.setIconLeft(getImageIcon("/ru/javabegin/training/goldman/images/goldman_left.png"));
        super.setIconRight(getImageIcon("/ru/javabegin/training/goldman/images/goldman_right.png"));

        super.setIcon(super.getIconUp());
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
    public void move(MovingDirection direction) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void getMoveResult(AbstractGameObject objectInNewCoordinate) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

 
}