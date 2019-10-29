package com.javabegin.training.game.goldman_7h.interfaces.gamemap;


import com.javabegin.training.game.goldman_7h.abstracts.AbstractGameMap;

import java.awt.*;

public interface DrawableMap {
    
    Component getMapComponent();
    
    AbstractGameMap getGameMap();
    
    boolean drawMap();    

}
