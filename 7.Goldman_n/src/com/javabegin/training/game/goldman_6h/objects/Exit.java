package com.javabegin.training.game.goldman_6h.objects;


import com.javabegin.training.game.goldman_6h.abstracts.AbstractGameObject;
import com.javabegin.training.game.goldman_6h.enums.GameObjectType;

/**
 * объект EXIT
 */
public class Exit extends AbstractGameObject {

    public Exit(Coordinate coordinate) {
        super.setType(GameObjectType.EXIT);
        super.setCoordinate(coordinate);
        super.setIcon(getImageIcon("/com/javabegin/training/game/goldman_6h/images/exit.gif"));
    }
}
