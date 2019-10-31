package com.javabegin.training.game.goldman_11.gamemap.interfaces;


import com.javabegin.training.game.goldman_11.collections.interfaces.GameCollection;
import com.javabegin.training.game.goldman_11.objects.MapInfo;

public interface MainMap {

    MapInfo getMapInfo();
    
    GameCollection getGameCollection();// все карты должн хранить коллекцию объектов
   
}
