package com.javabegin.training.game.goldman_7.objects;


import com.javabegin.training.game.goldman_7.abstracts.AbstractGameObject;
import com.javabegin.training.game.goldman_7.enums.GameObjectType;

/**
 * класс отвечает за работу объекта TREASURE
 */
public class Treasure extends AbstractGameObject {

    public Treasure(Coordinate coordinate) {
        super.setType(GameObjectType.TREASURE);
        super.setCoordinate(coordinate);
        super.setIcon(getImageIcon("/com/javabegin/training/game/goldman_7/images/gold.png"));
    }
    
    
    private int score = 5;// каждое сокровище будет давать 5 очков игроку

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
