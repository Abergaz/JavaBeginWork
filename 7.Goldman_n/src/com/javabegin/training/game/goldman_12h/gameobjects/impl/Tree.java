package com.javabegin.training.game.goldman_12h.gameobjects.impl;


import com.javabegin.training.game.goldman_12h.enums.GameObjectType;
import com.javabegin.training.game.goldman_12h.gameobjects.abstracts.AbstractGameObject;

public class Tree extends AbstractGameObject {
    public Tree(Coordinate coordinate) {
        super.setType(GameObjectType.TREE);
        super.setCoordinate(coordinate);
        super.setIcon(getImageIcon("/com/javabegin/training/game/goldman_12h/images/tree.jpg"));
    }
}
