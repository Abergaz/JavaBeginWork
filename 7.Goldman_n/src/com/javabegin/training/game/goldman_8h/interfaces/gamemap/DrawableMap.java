package com.javabegin.training.game.goldman_8h.interfaces.gamemap;

import com.javabegin.training.game.goldman_8h.abstracts.AbstractGameMap;

import java.awt.*;

public interface DrawableMap {
    
    Component getMapComponent();
    
    AbstractGameMap getGameMap();
    
    boolean drawMap();    

}
