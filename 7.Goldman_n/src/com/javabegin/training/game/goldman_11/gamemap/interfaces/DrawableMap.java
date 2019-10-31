package com.javabegin.training.game.goldman_11.gamemap.interfaces;

import java.awt.Component;

public interface DrawableMap extends MainMap{
    
    Component getMapComponent();
    
    boolean drawMap();    

}
