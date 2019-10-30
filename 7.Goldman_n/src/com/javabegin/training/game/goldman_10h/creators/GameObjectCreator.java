package com.javabegin.training.game.goldman_10h.creators;


import com.javabegin.training.game.goldman_10h.enums.GameObjectType;
import com.javabegin.training.game.goldman_10h.gameobjects.abstracts.AbstractGameObject;
import com.javabegin.training.game.goldman_10h.gameobjects.impl.*;

public class GameObjectCreator {

    private static GameObjectCreator instance;

    public static GameObjectCreator getInstance() {
        if (instance == null) {
            instance = new GameObjectCreator();
        }
        return instance;
    }

    private GameObjectCreator() {
    }

    public AbstractGameObject createObject(GameObjectType type, Coordinate coordinate) {
        AbstractGameObject obj = null;

        switch (type) {
            case NOTHING: {
                obj = new Nothing(coordinate);
                break;
            }
            case WALL: {
                obj = new Wall(coordinate);
                break;
            }
            case MONSTER: {
                obj = new Monster(coordinate);
                break;
            }
            case TREASURE: {
                obj = new Treasure(coordinate);
                break;
            }
            case EXIT: {
                obj = new Exit(coordinate);
                break;
            }

            case GOLDMAN: {
                obj = new GoldMan(coordinate);
                break;
            }

            default:
                throw new IllegalArgumentException("Can't create object type: " + type);

        }

        return obj;
    }
}
