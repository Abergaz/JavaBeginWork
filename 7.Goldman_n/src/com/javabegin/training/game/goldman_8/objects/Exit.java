package com.javabegin.training.game.goldman_8.objects;


import com.javabegin.training.game.goldman_8.abstracts.AbstractGameObject;
import com.javabegin.training.game.goldman_8.enums.GameObjectType;

/**
 * объект EXIT
 */
public class Exit extends AbstractGameObject {

    public Exit(Coordinate coordinate) {
        super.setType(GameObjectType.EXIT);
        super.setCoordinate(coordinate);
        super.setIcon(getImageIcon("/com/javabegin/training/game/goldman_8/images/exit.gif"));
    }
}