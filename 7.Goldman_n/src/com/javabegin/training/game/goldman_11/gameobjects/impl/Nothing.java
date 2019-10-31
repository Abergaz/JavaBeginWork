package com.javabegin.training.game.goldman_11.gameobjects.impl;


import com.javabegin.training.game.goldman_11.enums.GameObjectType;
import com.javabegin.training.game.goldman_11.gameobjects.abstracts.AbstractGameObject;

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
