package com.javabegin.training.game.goldman_14h.gamemap.interfaces;


import com.javabegin.training.game.goldman_14h.collections.interfaces.GameCollection;
import com.javabegin.training.game.goldman_14h.objects.MapInfo;

public interface MainMap {

    MapInfo getMapInfo();
    
    GameCollection getGameCollection();// все карты должн хранить коллекцию объектов
   
}
