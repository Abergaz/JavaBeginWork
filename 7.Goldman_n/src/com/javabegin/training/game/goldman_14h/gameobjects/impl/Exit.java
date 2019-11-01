package com.javabegin.training.game.goldman_14h.gameobjects.impl;


import com.javabegin.training.game.goldman_14h.enums.GameObjectType;
import com.javabegin.training.game.goldman_14h.gameobjects.abstracts.AbstractGameObject;


/**
 * объект EXIT
 */
public class Exit extends AbstractGameObject {

    public Exit(Coordinate coordinate) {
        super.setType(GameObjectType.EXIT);
        super.setCoordinate(coordinate);
        super.saveIcon("/ru/javabegin/training/goldman/images/exit.gif");
    }
}
