package com.javabegin.training.game.goldman_8h.interfaces.gamemap.collections;

import com.javabegin.training.game.goldman_8h.abstracts.AbstractGameObject;
import com.javabegin.training.game.goldman_8h.abstracts.AbstractMovingObject;
import com.javabegin.training.game.goldman_8h.enums.ActionResult;
import com.javabegin.training.game.goldman_8h.enums.GameObjectType;
import com.javabegin.training.game.goldman_8h.enums.MovingDirection;
import com.javabegin.training.game.goldman_8h.movestrategies.MoveStrategy;
import com.javabegin.training.game.goldman_8h.objects.Coordinate;
import com.javabegin.training.game.goldman_8h.objects.GoldMan;
import com.javabegin.training.game.goldman_8h.objects.Nothing;
import com.javabegin.training.game.goldman_8h.objects.Wall;
import com.javabegin.training.game.goldman_8h.objects.listeners.MapListenersRegistrator;
import com.javabegin.training.game.goldman_8h.objects.listeners.MoveResultListener;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;

public class MapCollection extends MapListenersRegistrator {// объекты для карты, которые умеют уведомлять всех слушателей о своих ходах

    private HashMap<Coordinate, AbstractGameObject> gameObjects = new HashMap<>();// хранит все объекты с доступом по координатам
    private EnumMap<GameObjectType, ArrayList<AbstractGameObject>> typeObjects = new EnumMap<>(GameObjectType.class); // хранит список объектов для каждого типа

    @Override
    public List<AbstractGameObject> getAllGameObjects() {
        return new ArrayList(gameObjects.values());// ! узкое место - каждый раз создается новая коллекция
    }

    @Override
    public List<AbstractGameObject> getGameObjects(GameObjectType type) {
        return typeObjects.get(type);
    }

    @Override
    public AbstractGameObject getObjectByCoordinate(Coordinate coordinate) {
        AbstractGameObject gameObject = gameObjects.get(coordinate);
        if (gameObject == null){// край карты
            gameObject = new Wall(coordinate);
        }
        return gameObject;
    }

    @Override
    public AbstractGameObject getObjectByCoordinate(int x, int y) {
        return gameObjects.get(new Coordinate(x, y));
    }

    @Override
    public void addGameObject(AbstractGameObject gameObject) {

        ArrayList<AbstractGameObject> tmpList = typeObjects.get(gameObject.getType());

        if (tmpList == null) {
            tmpList = new ArrayList<>();
        }

        tmpList.add(gameObject);

        gameObjects.put(gameObject.getCoordinate(), gameObject);
        typeObjects.put(gameObject.getType(), tmpList);

    }

    @Override
    public void moveObject(MovingDirection direction, GameObjectType gameObjectType) {
        doMoveAction(direction, gameObjectType, null);// движение по направлению (без стратегии)
    }
    
    
    @Override
    public void moveObject(MoveStrategy moveStrategy, GameObjectType gameObjectType) {
        doMoveAction(null, gameObjectType, moveStrategy);// движение по стратегии
    }
    
    private void doMoveAction(MovingDirection direction, GameObjectType gameObjectType, MoveStrategy moveStrategy){
          GoldMan goldMan = (GoldMan) getGameObjects(GameObjectType.GOLDMAN).get(0);

        ActionResult actionResult = null;

        for (AbstractGameObject gameObject : this.getGameObjects(gameObjectType)) {
            if (gameObject instanceof AbstractMovingObject) {// дорогостоящая операция - instanceof
                AbstractMovingObject movingObject = (AbstractMovingObject) gameObject;
                        
                if (moveStrategy!=null){// если указана стратегия движения - то берем наравления оттуда
                    direction = moveStrategy.getDirection(movingObject, goldMan, this);
                }

                Coordinate newCoordinate = movingObject.getDirectionCoordinate(direction);

                AbstractGameObject objectInNewCoordinate = getObjectByCoordinate(newCoordinate);
                
                actionResult = movingObject.moveToObject(direction, objectInNewCoordinate);

                switch (actionResult) {
                    case MOVE: {
                        swapObjects(movingObject, objectInNewCoordinate);
                        break;
                    }
                    case COLLECT_TREASURE: {
                        swapObjects(movingObject, new Nothing(newCoordinate));
                        break;
                    }

                    case WIN:
                    case DIE: {
                        break;
                    }

                }

            }

            notifyMoveListeners(actionResult, goldMan);
        }
    }

    private void swapObjects(AbstractGameObject obj1, AbstractGameObject obj2) {

        swapCoordinates(obj1, obj2);

        gameObjects.put(obj1.getCoordinate(), obj1);
        gameObjects.put(obj2.getCoordinate(), obj2);

    }

    private void swapCoordinates(AbstractGameObject obj1, AbstractGameObject obj2) {
        Coordinate tmpCoordinate = obj1.getCoordinate();
        obj1.setCoordinate(obj2.getCoordinate());
        obj2.setCoordinate(tmpCoordinate);
    }

  
    

    

    @Override
    public void notifyMoveListeners(ActionResult actionResult, GoldMan goldMan) {
        for (MoveResultListener listener : getMoveListeners()) {
            listener.notifyActionResult(actionResult, goldMan);
        }
    }
    

    
}