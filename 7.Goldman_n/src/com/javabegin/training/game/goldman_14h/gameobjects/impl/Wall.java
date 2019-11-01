package com.javabegin.training.game.goldman_14h.gameobjects.impl;


import com.javabegin.training.game.goldman_14h.enums.GameObjectType;
import com.javabegin.training.game.goldman_14h.gameobjects.abstracts.AbstractGameObject;


/**
 * класс отвечает за работу объекта WALL
 */
public class Wall extends AbstractGameObject{

    public Wall(Coordinate coordinate) {
        super.setType(GameObjectType.WALL);
        super.setCoordinate(coordinate);        
        super.saveIcon("/com/javabegin/training/game/goldman_14h/images/wall.png");
    }
}
