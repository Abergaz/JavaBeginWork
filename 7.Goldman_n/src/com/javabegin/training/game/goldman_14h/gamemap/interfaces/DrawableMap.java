package com.javabegin.training.game.goldman_14h.gamemap.interfaces;

import com.javabegin.training.game.goldman_14h.gameobjects.abstracts.AbstractGameObject;

import java.awt.Component;


public interface DrawableMap extends MainMap{
    
    Component getMapComponent();
    
    boolean updateMap();
    
    void updateMapObjects(AbstractGameObject obj1, AbstractGameObject obj2);

}
