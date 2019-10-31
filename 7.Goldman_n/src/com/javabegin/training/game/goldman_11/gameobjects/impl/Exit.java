package com.javabegin.training.game.goldman_11.gameobjects.impl;


import com.javabegin.training.game.goldman_11.enums.GameObjectType;
import com.javabegin.training.game.goldman_11.gameobjects.abstracts.AbstractGameObject;

/**
 * объект EXIT
 */
public class Exit extends AbstractGameObject {

    public Exit(Coordinate coordinate) {
        super.setType(GameObjectType.EXIT);
        super.setCoordinate(coordinate);
        super.setIcon(getImageIcon("/com/javabegin/training/game/goldman_11/images/exit.gif"));
    }
}
