package com.javabegin.training.game.goldman_9.interfaces.gamemap.collections;


import com.javabegin.training.game.goldman_9.abstracts.AbstractGameObject;
import com.javabegin.training.game.goldman_9.enums.GameObjectType;
import com.javabegin.training.game.goldman_9.enums.MovingDirection;
import com.javabegin.training.game.goldman_9.movestrategies.MoveStrategy;
import com.javabegin.training.game.goldman_9.objects.Coordinate;
import com.javabegin.training.game.goldman_9.objects.listeners.MoveResultNotifier;

import java.util.List;

public interface GameCollection extends MoveResultNotifier {
    
    AbstractGameObject getObjectByCoordinate(Coordinate coordinate);
    
    AbstractGameObject getObjectByCoordinate(int x, int y);
    
    void addGameObject(AbstractGameObject gameObject);
    
    List<AbstractGameObject> getAllGameObjects();
    
    List<AbstractGameObject> getGameObjects(GameObjectType type);
    
    void moveObject(MovingDirection direction, GameObjectType gameObjectType);
    
    void moveObject(MoveStrategy moveStrategy, GameObjectType gameObjectType);

}
