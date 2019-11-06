package com.javabegin.training.game.goldman_13h.gamemap.adapters;

import java.util.ArrayList;

import com.javabegin.training.game.goldman_13h.enums.LocationType;
import com.javabegin.training.game.goldman_13h.gamemap.abstracts.AbstractGameMap;
import com.javabegin.training.game.goldman_13h.gamemap.loader.impl.DBMapLoader;
import com.javabegin.training.game.goldman_13h.gamemap.loader.impl.FSMapLoader;
import com.javabegin.training.game.goldman_13h.objects.MapInfo;
import com.javabegin.training.game.goldman_13h.objects.SavedMapInfo;
import com.javabegin.training.game.goldman_13h.objects.User;

public class HybridMapLoader {
    
    private DBMapLoader dBMapLoader;
    private FSMapLoader fSMapLoader;

    private AbstractGameMap gameMap;
    
    public HybridMapLoader(AbstractGameMap gameMap) {
        dBMapLoader = new DBMapLoader(gameMap);
        fSMapLoader = new FSMapLoader(gameMap);
        this.gameMap = gameMap;
    }
    
    
    
    public boolean saveMap(SavedMapInfo mapInfo, LocationType locationType){
        switch (locationType){
            case DB:{
                return dBMapLoader.saveMap(mapInfo);
            }
                
            case FS:{
                return fSMapLoader.saveMap(mapInfo);
            }
        }
        
        return false;
    }
    
    public boolean loadMap(MapInfo mapInfo, LocationType locationType){
        switch (locationType){
            case DB:{
                gameMap = dBMapLoader.getGameMap();
                return dBMapLoader.loadMap(mapInfo);
            }
                
            case FS:{
                gameMap = fSMapLoader.getGameMap();
                return fSMapLoader.loadMap(mapInfo);
            }
        }
        
        
        
        return false;
    }

    public ArrayList<SavedMapInfo> getSavedMapList(User user, LocationType locationType){
        switch (locationType){
            case DB:{
                return dBMapLoader.getSavedMapList(user);
            }
                
            case FS:{
                return fSMapLoader.getSavedMapList(user);
            }
        }
        
        return null;
    }
    
    public boolean deleteSavedMap(MapInfo mapInfo, LocationType locationType){
        switch (locationType){
            case DB:{
                return dBMapLoader.deleteSavedMap(mapInfo);
            }
                
            case FS:{
                return fSMapLoader.deleteSavedMap(mapInfo);
            }
        }
        
        return false;
    }

    public AbstractGameMap getGameMap() {
        return gameMap;
    }

    
    public int getPlayerId(String username){
        return dBMapLoader.getPlayerId(username);        
    }

}
