package com.javabegin.training.game.goldman_7h.interfaces.collections;

import com.javabegin.training.game.goldman_7h.abstracts.AbstractGameObject;
import com.javabegin.training.game.goldman_7h.enums.ActionResult;
import com.javabegin.training.game.goldman_7h.enums.GameObjectType;
import com.javabegin.training.game.goldman_7h.enums.MovingDirection;
import com.javabegin.training.game.goldman_7h.objects.Coordinate;

import java.util.List;

public interface GameCollection{
    
    AbstractGameObject getObjectByCoordinate(Coordinate coordinate);
    
    AbstractGameObject getObjectByCoordinate(int x, int y);
    
    void addGameObject(AbstractGameObject gameObject);
    
    List<AbstractGameObject> getAllGameObjects();
    
    List<AbstractGameObject> getGameObjects(GameObjectType type);
    
    ActionResult moveObject(MovingDirection direction, GameObjectType gameObjectType);

}
