package com.javabegin.training.game.goldman_8h.objects;


import com.javabegin.training.game.goldman_8h.abstracts.AbstractGameObject;
import com.javabegin.training.game.goldman_8h.enums.GameObjectType;

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
