package com.javabegin.training.game.goldman_10h.gameobjects.impl;


import com.javabegin.training.game.goldman_10h.enums.GameObjectType;
import com.javabegin.training.game.goldman_10h.gameobjects.abstracts.AbstractGameObject;

/**
 * класс отвечает за работу объекта WALL
 */
public class Wall extends AbstractGameObject {

    public Wall(Coordinate coordinate) {
        super.setType(GameObjectType.WALL);
        super.setCoordinate(coordinate);
        
        super.setIcon(getImageIcon("/com/javabegin/training/game/goldman_10h/images/wall.png"));

    }
}
