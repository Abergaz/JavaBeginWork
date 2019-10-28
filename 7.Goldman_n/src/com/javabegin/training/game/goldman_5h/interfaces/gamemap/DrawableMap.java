package com.javabegin.training.game.goldman_5h.interfaces.gamemap;

import com.javabegin.training.game.goldman_5h.abstracts.AbstractGameMap;

import java.awt.Component;


public interface DrawableMap {
    
    Component getMapComponent();
    
    AbstractGameMap getGameMap();
    
    boolean drawMap();    

}
