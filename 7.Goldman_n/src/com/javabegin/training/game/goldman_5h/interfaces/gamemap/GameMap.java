package com.javabegin.training.game.goldman_5h.interfaces.gamemap;

/**
 * интерфейс для игровой карты
 */
public interface GameMap {

    int getHeight();

    int getWidth();

    int getTimeLimit();

    boolean loadMap(Object source);

    boolean saveMap(Object source);
}
