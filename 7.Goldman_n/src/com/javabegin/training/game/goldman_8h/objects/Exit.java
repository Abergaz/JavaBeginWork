package com.javabegin.training.game.goldman_8h.objects;


import com.javabegin.training.game.goldman_8h.abstracts.AbstractGameObject;
import com.javabegin.training.game.goldman_8h.enums.GameObjectType;

/**
 * объект EXIT
 */
public class Exit extends AbstractGameObject {

    public Exit(Coordinate coordinate) {
        super.setType(GameObjectType.EXIT);
        super.setCoordinate(coordinate);
        super.setIcon(getImageIcon("/com/javabegin/training/game/goldman_8h/images/exit.gif"));
    }
}
