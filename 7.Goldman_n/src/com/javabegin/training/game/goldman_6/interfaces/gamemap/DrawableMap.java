package com.javabegin.training.game.goldman_6.interfaces.gamemap;

import com.javabegin.training.game.goldman_6.abstracts.AbstractGameMap;

import java.awt.Component;


public interface DrawableMap {
    
    Component getMapComponent();
    
    AbstractGameMap getGameMap();
    
    boolean drawMap();    

}
