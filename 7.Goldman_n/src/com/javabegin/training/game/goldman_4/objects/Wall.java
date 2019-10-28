package com.javabegin.training.game.goldman_4.objects;


import com.javabegin.training.game.goldman_4.abstracts.AbstractGameObject;
import com.javabegin.training.game.goldman_4.enums.GameObjectType;

/**
 * класс отвечает за работу объекта WALL
 */
public class Wall extends AbstractGameObject {

    public Wall(Coordinate coordinate) {
        super.setType(GameObjectType.WALL);
        super.setCoordinate(coordinate);
        
        super.setIcon(getImageIcon("/ru/javabegin/training/goldman/images/wall.png"));

    }
}
