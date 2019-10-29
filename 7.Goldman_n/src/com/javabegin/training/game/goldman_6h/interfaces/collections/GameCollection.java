package com.javabegin.training.game.goldman_6h.interfaces.collections;

import com.javabegin.training.game.goldman_6h.abstracts.AbstractGameObject;
import com.javabegin.training.game.goldman_6h.enums.GameObjectType;
import com.javabegin.training.game.goldman_6h.objects.Coordinate;

import java.util.List;

public interface GameCollection{
    
    AbstractGameObject getObjectByCoordinate(Coordinate coordinate);
    
    AbstractGameObject getObjectByCoordinate(int x, int y);
    
    void addGameObject(AbstractGameObject gameObject);
    
    List<AbstractGameObject> getAllGameObjects();
    
    List<AbstractGameObject> getGameObjects(GameObjectType type);

}
