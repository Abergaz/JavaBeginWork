package com.javabegin.training.game.goldman_3h.objects;


import com.javabegin.training.game.goldman_3h.abstracts.AbstractGameObject;
import com.javabegin.training.game.goldman_3h.enums.GameObjectType;

/**
 * объект EXIT
 */
public class Exit extends AbstractGameObject {

    public Exit(Coordinate coordinate) {
        super.setType(GameObjectType.EXIT);
        super.setCoordinate(coordinate);
        super.setIcon(getImageIcon("/ru/javabegin/training/goldman/images/exit.gif"));
    }
}
