package com.javabegin.training.game.goldman_12h.gamemap.interfaces;


import com.javabegin.training.game.goldman_12h.collections.interfaces.GameCollection;
import com.javabegin.training.game.goldman_12h.objects.MapInfo;

public interface MainMap {

    MapInfo getMapInfo();
    
    GameCollection getGameCollection();// все карты должн хранить коллекцию объектов
   
}
