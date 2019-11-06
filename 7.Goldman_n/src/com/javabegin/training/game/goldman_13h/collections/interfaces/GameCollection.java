package com.javabegin.training.game.goldman_13h.collections.interfaces;

import com.javabegin.training.game.goldman_13h.enums.GameObjectType;
import com.javabegin.training.game.goldman_13h.enums.MovingDirection;
import com.javabegin.training.game.goldman_13h.gameobjects.abstracts.AbstractGameObject;
import com.javabegin.training.game.goldman_13h.gameobjects.impl.Coordinate;
import com.javabegin.training.game.goldman_13h.listeners.interfaces.MoveResultNotifier;
import com.javabegin.training.game.goldman_13h.movestrategies.interfaces.MoveStrategy;

import java.util.List;


public interface GameCollection extends MoveResultNotifier {
    
    AbstractGameObject getObjectByCoordinate(Coordinate coordinate);
    
    AbstractGameObject getObjectByCoordinate(int x, int y);
    
    void addGameObject(AbstractGameObject gameObject);
    
    List<AbstractGameObject> getAllGameObjects();
    
    List<AbstractGameObject> getGameObjects(GameObjectType type);
    
    void moveObject(MovingDirection direction, GameObjectType gameObjectType);
    
    void moveObject(MoveStrategy moveStrategy, GameObjectType gameObjectType);
    
    void clear();

}
