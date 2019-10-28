package com.javabegin.training.game.goldman_5h.objects.creators;


import com.javabegin.training.game.goldman_5h.abstracts.AbstractGameMap;
import com.javabegin.training.game.goldman_5h.enums.LocationType;
import com.javabegin.training.game.goldman_5h.objects.maps.FSGameMap;

public class MapCreator {

    private static MapCreator instance;

    public static MapCreator getInstance() {
        if (instance == null) {
            instance = new MapCreator();
        }
        return instance;
    }

    public AbstractGameMap createMap(LocationType type) {
        AbstractGameMap obj = null;

        switch (type) {
            case FS: {
                obj = new FSGameMap();
                break;
            }
            case DB: {
                
                break;
            }
            default:
                throw new IllegalArgumentException("Can't create map type: " + type);

        }

        return obj;
    }
}
