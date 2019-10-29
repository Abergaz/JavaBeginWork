package com.javabegin.training.game.goldman_6h.interfaces.gamemap;

import com.javabegin.training.game.goldman_6h.abstracts.AbstractGameMap;

import java.awt.Component;


public interface DrawableMap {
    
    Component getMapComponent();
    
    AbstractGameMap getGameMap();
    
    boolean drawMap();    

}
