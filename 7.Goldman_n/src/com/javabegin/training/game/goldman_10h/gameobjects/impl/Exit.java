package com.javabegin.training.game.goldman_10h.gameobjects.impl;


import com.javabegin.training.game.goldman_10h.enums.GameObjectType;
import com.javabegin.training.game.goldman_10h.gameobjects.abstracts.AbstractGameObject;

/**
 * объект EXIT
 */
public class Exit extends AbstractGameObject {

    public Exit(Coordinate coordinate) {
        super.setType(GameObjectType.EXIT);
        super.setCoordinate(coordinate);
        super.setIcon(getImageIcon("/com/javabegin/training/game/goldman_10h/images/exit.gif"));
    }
}
