package com.javabegin.training.game.goldman_14h.gameobjects.impl;


import com.javabegin.training.game.goldman_14h.enums.GameObjectType;
import com.javabegin.training.game.goldman_14h.gameobjects.abstracts.AbstractGameObject;



public class Tree extends AbstractGameObject{
    public Tree(Coordinate coordinate) {
        super.setType(GameObjectType.TREE);
        super.setCoordinate(coordinate);
        super.saveIcon("/com/javabegin/training/game/goldman_14h/images/tree.jpg");
    }
}

