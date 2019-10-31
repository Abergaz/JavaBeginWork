package com.javabegin.training.game.goldman_12.collections.interfaces;


import com.javabegin.training.game.goldman_12.enums.GameObjectType;
import com.javabegin.training.game.goldman_12.enums.MovingDirection;
import com.javabegin.training.game.goldman_12.gameobjects.abstracts.AbstractGameObject;
import com.javabegin.training.game.goldman_12.gameobjects.impl.Coordinate;
import com.javabegin.training.game.goldman_12.listeners.interfaces.MoveResultNotifier;
import com.javabegin.training.game.goldman_12.movestrategies.interfaces.MoveStrategy;

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
