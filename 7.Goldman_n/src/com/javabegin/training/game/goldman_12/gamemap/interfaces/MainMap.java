package com.javabegin.training.game.goldman_12.gamemap.interfaces;


import com.javabegin.training.game.goldman_12.collections.interfaces.GameCollection;
import com.javabegin.training.game.goldman_12.objects.MapInfo;

public interface MainMap {

    MapInfo getMapInfo();
    
    GameCollection getGameCollection();// все карты должн хранить коллекцию объектов
   
}
