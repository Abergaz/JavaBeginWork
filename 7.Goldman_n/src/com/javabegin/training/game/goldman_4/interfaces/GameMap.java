package com.javabegin.training.game.goldman_4.interfaces;

/**
 * интерфейс для игровой карты
 */
public interface GameMap {
    
    int getHeight();
    
    int getWidth();
    
    boolean loadMap();
    
    boolean saveMap();

    boolean drawMap();
    
    int getTimeLimit();
    
}
