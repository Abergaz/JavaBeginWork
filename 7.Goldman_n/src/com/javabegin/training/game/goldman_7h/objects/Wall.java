package com.javabegin.training.game.goldman_7h.objects;


import com.javabegin.training.game.goldman_7h.abstracts.AbstractGameObject;
import com.javabegin.training.game.goldman_7h.enums.GameObjectType;

/**
 * класс отвечает за работу объекта WALL
 */
public class Wall extends AbstractGameObject {

    public Wall(Coordinate coordinate) {
        super.setType(GameObjectType.WALL);
        super.setCoordinate(coordinate);
        
        super.setIcon(getImageIcon("/com/javabegin/training/game/goldman_7h/images/wall.png"));

    }
}
