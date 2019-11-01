package com.javabegin.training.game.goldman_12h.gamemap.interfaces;

import java.awt.Component;

public interface DrawableMap extends MainMap{
    
    Component getMapComponent();
    
    boolean drawMap();    

}
