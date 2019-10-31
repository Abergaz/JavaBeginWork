package com.javabegin.training.game.goldman_12.gameobjects.impl;


import com.javabegin.training.game.goldman_12.enums.GameObjectType;
import com.javabegin.training.game.goldman_12.gameobjects.abstracts.AbstractGameObject;

public class Tree extends AbstractGameObject {
    public Tree(Coordinate coordinate) {
        super.setType(GameObjectType.TREE);
        super.setCoordinate(coordinate);
        super.setIcon(getImageIcon("/com/javabegin/training/game/goldman_12/images/tree.jpg"));
    }
}
