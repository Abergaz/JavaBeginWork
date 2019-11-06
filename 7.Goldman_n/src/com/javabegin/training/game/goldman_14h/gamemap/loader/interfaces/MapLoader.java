package com.javabegin.training.game.goldman_14h.gamemap.loader.interfaces;


import com.javabegin.training.game.goldman_14h.objects.MapInfo;
import com.javabegin.training.game.goldman_14h.objects.SavedMapInfo;
import com.javabegin.training.game.goldman_14h.objects.User;

import java.util.ArrayList;

public interface MapLoader{
    
    boolean saveMap(SavedMapInfo mapInfo);
    
    boolean loadMap(MapInfo mapInfo);

    ArrayList<SavedMapInfo> getSavedMapList(User user);
    
    boolean deleteSavedMap(MapInfo mapInfo);

}