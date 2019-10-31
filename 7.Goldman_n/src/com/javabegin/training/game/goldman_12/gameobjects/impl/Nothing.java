package com.javabegin.training.game.goldman_12.gameobjects.impl;


import com.javabegin.training.game.goldman_12.enums.GameObjectType;
import com.javabegin.training.game.goldman_12.gameobjects.abstracts.AbstractGameObject;

/**
 * класс отвечает за работу объекта NOTHING (т.е. пустоту на карте)
 */
public class Nothing extends AbstractGameObject {

    public Nothing(Coordinate coordinate) {
        super.setType(GameObjectType.NOTHING);
        super.setCoordinate(coordinate);
        super.setIcon(null);

    }
}
