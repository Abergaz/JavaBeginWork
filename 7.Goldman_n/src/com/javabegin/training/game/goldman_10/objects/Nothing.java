package com.javabegin.training.game.goldman_10.objects;


import com.javabegin.training.game.goldman_10.abstracts.AbstractGameObject;
import com.javabegin.training.game.goldman_10.enums.GameObjectType;

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