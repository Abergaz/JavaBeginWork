package com.javabegin.training.game.goldman_4.objects;


import com.javabegin.training.game.goldman_4.abstracts.AbstractGameObject;
import com.javabegin.training.game.goldman_4.enums.GameObjectType;

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
