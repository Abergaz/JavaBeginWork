package com.javabegin.training.game.goldman_13h.gamemap.interfaces;


import com.javabegin.training.game.goldman_13h.collections.interfaces.GameCollection;
import com.javabegin.training.game.goldman_13h.objects.MapInfo;

public interface MainMap {

    MapInfo getMapInfo();
    
    GameCollection getGameCollection();// все карты должн хранить коллекцию объектов
   
}
