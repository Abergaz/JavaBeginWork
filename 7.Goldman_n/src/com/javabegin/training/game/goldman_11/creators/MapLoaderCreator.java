package com.javabegin.training.game.goldman_11.creators;


import com.javabegin.training.game.goldman_11.enums.LocationType;
import com.javabegin.training.game.goldman_11.gamemap.abstracts.AbstractGameMap;
import com.javabegin.training.game.goldman_11.gamemap.loader.impl.DBMapLoader;
import com.javabegin.training.game.goldman_11.gamemap.loader.impl.FSMapLoader;
import com.javabegin.training.game.goldman_11.gamemap.loader.interfaces.MapLoader;

public class MapLoaderCreator {

    private static MapLoaderCreator instance;

    public static MapLoaderCreator getInstance() {
        if (instance == null) {
            instance = new MapLoaderCreator();
        }
        return instance;
    }

    public MapLoader createMapLoader(LocationType type, AbstractGameMap gameMap) {
        MapLoader obj = null;

        switch (type) {
            case FS: {
                obj = new FSMapLoader(gameMap);
                break;
            }
            case DB: {
                obj = new DBMapLoader(gameMap);
                break;
            }
            default:
                throw new IllegalArgumentException("Can't create map type: " + type);

        }

        return obj;
    }
}
