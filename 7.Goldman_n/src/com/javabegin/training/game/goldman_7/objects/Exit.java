package com.javabegin.training.game.goldman_7.objects;


import com.javabegin.training.game.goldman_7.abstracts.AbstractGameObject;
import com.javabegin.training.game.goldman_7.enums.GameObjectType;

/**
 * объект EXIT
 */
public class Exit extends AbstractGameObject {

    public Exit(Coordinate coordinate) {
        super.setType(GameObjectType.EXIT);
        super.setCoordinate(coordinate);
        super.setIcon(getImageIcon("/com/javabegin/training/game/goldman_7/images/exit.gif"));
    }
}
