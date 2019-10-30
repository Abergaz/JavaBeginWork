package com.javabegin.training.game.goldman_10.interfaces.gamemap;


import com.javabegin.training.game.goldman_10.abstracts.AbstractGameMap;

import java.awt.*;

public interface DrawableMap {
    
    Component getMapComponent();
    
    AbstractGameMap getGameMap();
    
    boolean drawMap();    

}
