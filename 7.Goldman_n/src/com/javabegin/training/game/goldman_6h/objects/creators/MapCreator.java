package com.javabegin.training.game.goldman_6h.objects.creators;


import com.javabegin.training.game.goldman_6h.objects.maps.FSGameMap;
import com.javabegin.training.game.goldman_6h.abstracts.AbstractGameMap;
import com.javabegin.training.game.goldman_6h.enums.LocationType;
import com.javabegin.training.game.goldman_6h.interfaces.collections.GameCollection;

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