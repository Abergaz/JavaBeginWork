package com.javabegin.training.game.goldman_6.objects;


import com.javabegin.training.game.goldman_6.abstracts.AbstractGameObject;
import com.javabegin.training.game.goldman_6.enums.GameObjectType;

/**
 * класс отвечает за работу объекта WALL
 */
public class Wall extends AbstractGameObject {

    public Wall(Coordinate coordinate) {
        super.setType(GameObjectType.WALL);
        super.setCoordinate(coordinate);
        
        super.setIcon(getImageIcon("/com/javabegin/training/game/goldman_6/images/wall.png"));

    }
}
