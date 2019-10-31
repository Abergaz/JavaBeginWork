package com.javabegin.training.game.goldman_11.gameobjects.impl;


import com.javabegin.training.game.goldman_11.enums.GameObjectType;
import com.javabegin.training.game.goldman_11.gameobjects.abstracts.AbstractGameObject;

/**
 * класс отвечает за работу объекта TREASURE
 */
public class Treasure extends AbstractGameObject {

    public Treasure(Coordinate coordinate) {
        super.setType(GameObjectType.TREASURE);
        super.setCoordinate(coordinate);
        super.setIcon(getImageIcon("/com/javabegin/training/game/goldman_11/images/gold.png"));
    }
    
    
    private int score = 5;// каждое сокровище будет давать 5 очков игроку

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
