package com.javabegin.training.game.goldman_9.interfaces.gamemap;


import com.javabegin.training.game.goldman_9.abstracts.AbstractGameMap;

import java.awt.*;

public interface DrawableMap {
    
    Component getMapComponent();
    
    AbstractGameMap getGameMap();
    
    boolean drawMap();    

}
