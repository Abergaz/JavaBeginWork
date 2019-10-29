package com.javabegin.training.game.goldman_8.objects;


import com.javabegin.training.game.goldman_8.abstracts.AbstractGameObject;
import com.javabegin.training.game.goldman_8.enums.GameObjectType;

/**
 * класс отвечает за работу объекта WALL
 */
public class Wall extends AbstractGameObject {

    public Wall(Coordinate coordinate) {
        super.setType(GameObjectType.WALL);
        super.setCoordinate(coordinate);
        
        super.setIcon(getImageIcon("/com/javabegin/training/game/goldman_8/images/wall.png"));

    }
}
