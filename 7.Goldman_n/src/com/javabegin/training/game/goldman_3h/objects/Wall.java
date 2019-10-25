package com.javabegin.training.game.goldman_3h.objects;


import com.javabegin.training.game.goldman_3h.abstracts.AbstractGameObject;
import com.javabegin.training.game.goldman_3h.enums.GameObjectType;

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
