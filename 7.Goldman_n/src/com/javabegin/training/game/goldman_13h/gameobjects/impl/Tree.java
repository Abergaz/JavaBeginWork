package com.javabegin.training.game.goldman_13h.gameobjects.impl;


import com.javabegin.training.game.goldman_13h.enums.GameObjectType;
import com.javabegin.training.game.goldman_13h.gameobjects.abstracts.AbstractGameObject;



public class Tree extends AbstractGameObject{
    public Tree(Coordinate coordinate) {
        super.setType(GameObjectType.TREE);
        super.setCoordinate(coordinate);
        super.setIcon(getImageIcon("/com/javabegin/training/game/goldman_13h/images/tree.jpg"));
    }
}
