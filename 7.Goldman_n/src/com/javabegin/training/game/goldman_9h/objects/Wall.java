package com.javabegin.training.game.goldman_9h.objects;


import com.javabegin.training.game.goldman_9h.abstracts.AbstractGameObject;
import com.javabegin.training.game.goldman_9h.enums.GameObjectType;

/**
 * класс отвечает за работу объекта WALL
 */
public class Wall extends AbstractGameObject {

    public Wall(Coordinate coordinate) {
        super.setType(GameObjectType.WALL);
        super.setCoordinate(coordinate);
        
        super.setIcon(getImageIcon("/com/javabegin/training/game/goldman_9/images/wall.png"));

    }
}
