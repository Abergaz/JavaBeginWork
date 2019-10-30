package com.javabegin.training.game.goldman_9h.interfaces.gamemap;


import com.javabegin.training.game.goldman_9h.abstracts.AbstractGameMap;

import java.awt.*;

public interface DrawableMap {
    
    Component getMapComponent();
    
    AbstractGameMap getGameMap();
    
    boolean drawMap();    

}
