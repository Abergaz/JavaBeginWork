package com.javabegin.training.game.goldman_4h.objects.creators;


import com.javabegin.training.game.goldman_4h.abstracts.AbstractGameObject;
import com.javabegin.training.game.goldman_4h.enums.GameObjectType;
import com.javabegin.training.game.goldman_4h.objects.Coordinate;
import com.javabegin.training.game.goldman_4h.objects.Exit;
import com.javabegin.training.game.goldman_4h.objects.GoldMan;
import com.javabegin.training.game.goldman_4h.objects.Monster;
import com.javabegin.training.game.goldman_4h.objects.Nothing;
import com.javabegin.training.game.goldman_4h.objects.Treasure;
import com.javabegin.training.game.goldman_4h.objects.Wall;

public class GameObjectCreator {

    private static GameObjectCreator instance;

    public static GameObjectCreator getInstance() {
        if (instance == null) {
            instance = new GameObjectCreator();
        }
        return instance;
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
