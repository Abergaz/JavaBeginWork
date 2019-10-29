package com.javabegin.training.game.goldman_7h.objects.creators;

import com.javabegin.training.game.goldman_7h.abstracts.AbstractGameMap;
import com.javabegin.training.game.goldman_7h.enums.LocationType;
import com.javabegin.training.game.goldman_7h.interfaces.collections.GameCollection;
import com.javabegin.training.game.goldman_7h.objects.maps.FSGameMap;

public class MapCreator {

    private static MapCreator instance;

    public static MapCreator getInstance() {
        if (instance == null) {
            instance = new MapCreator();
        }
        return instance;
    }

    public AbstractGameMap createMap(LocationType type, GameCollection collection) {
        AbstractGameMap obj = null;

        switch (type) {
            case FS: {
                obj = new FSGameMap(collection);
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
