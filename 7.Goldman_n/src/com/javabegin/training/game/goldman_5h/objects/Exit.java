package com.javabegin.training.game.goldman_5h.objects;


import com.javabegin.training.game.goldman_5h.abstracts.AbstractGameObject;
import com.javabegin.training.game.goldman_5h.enums.GameObjectType;

/**
 * объект EXIT
 */
public class Exit extends AbstractGameObject {

    public Exit(Coordinate coordinate) {
        super.setType(GameObjectType.EXIT);
        super.setCoordinate(coordinate);
        super.setIcon(getImageIcon("/com/javabegin/training/game/goldman_5h/images/exit.gif"));
    }
}
