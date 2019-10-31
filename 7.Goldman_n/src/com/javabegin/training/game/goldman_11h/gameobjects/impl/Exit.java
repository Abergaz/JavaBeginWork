package com.javabegin.training.game.goldman_11h.gameobjects.impl;

import com.javabegin.training.game.goldman_11h.enums.GameObjectType;
import com.javabegin.training.game.goldman_11h.gameobjects.abstracts.AbstractGameObject;

/**
 * объект EXIT
 */
public class Exit extends AbstractGameObject {

    public Exit(Coordinate coordinate) {
        super.setType(GameObjectType.EXIT);
        super.setCoordinate(coordinate);
        super.setIcon(getImageIcon("/com/javabegin/training/game/goldman_11h/images/exit.gif"));
    }
}
