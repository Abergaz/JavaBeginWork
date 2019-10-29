package com.javabegin.training.game.goldman_7.interfaces.collections;


import com.javabegin.training.game.goldman_7.abstracts.AbstractGameObject;
import com.javabegin.training.game.goldman_7.enums.GameObjectType;
import com.javabegin.training.game.goldman_7.enums.MovingDirection;
import com.javabegin.training.game.goldman_7.objects.Coordinate;

import java.util.List;

public interface GameCollection{
    
    AbstractGameObject getObjectByCoordinate(Coordinate coordinate);
    
    AbstractGameObject getObjectByCoordinate(int x, int y);
    
    void addGameObject(AbstractGameObject gameObject);
    
    List<AbstractGameObject> getAllGameObjects();
    
    List<AbstractGameObject> getGameObjects(GameObjectType type);
    
    void moveObject(MovingDirection direction, GameObjectType gameObjectType);

}
