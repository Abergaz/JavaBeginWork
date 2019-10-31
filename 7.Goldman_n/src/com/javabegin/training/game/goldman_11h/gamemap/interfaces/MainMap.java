package com.javabegin.training.game.goldman_11h.gamemap.interfaces;


import com.javabegin.training.game.goldman_11h.collections.interfaces.GameCollection;
import com.javabegin.training.game.goldman_11h.objects.MapInfo;

public interface MainMap {

    MapInfo getMapInfo();
    
    GameCollection getGameCollection();// все карты должн хранить коллекцию объектов
   
}
