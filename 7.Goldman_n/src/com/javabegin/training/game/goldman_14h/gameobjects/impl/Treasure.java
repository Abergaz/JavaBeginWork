package com.javabegin.training.game.goldman_14h.gameobjects.impl;


import com.javabegin.training.game.goldman_14h.enums.GameObjectType;
import com.javabegin.training.game.goldman_14h.gameobjects.abstracts.AbstractGameObject;


/**
 * класс отвечает за работу объекта TREASURE
 */
public class Treasure extends AbstractGameObject {

    public Treasure(Coordinate coordinate) {
        super.setType(GameObjectType.TREASURE);
        super.setCoordinate(coordinate);
        super.saveIcon("/com/javabegin/training/game/goldman_14h/images/gold.png");
    }
    
    
    private int score = 5;// каждое сокровище будет давать 5 очков игроку

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
