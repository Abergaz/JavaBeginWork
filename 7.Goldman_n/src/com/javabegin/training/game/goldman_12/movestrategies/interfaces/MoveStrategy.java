package com.javabegin.training.game.goldman_12.movestrategies.interfaces;


import com.javabegin.training.game.goldman_12.collections.interfaces.GameCollection;
import com.javabegin.training.game.goldman_12.enums.MovingDirection;
import com.javabegin.training.game.goldman_12.gameobjects.abstracts.AbstractGameObject;
import com.javabegin.training.game.goldman_12.gameobjects.abstracts.AbstractMovingObject;

public interface MoveStrategy {
    
    MovingDirection getDirection(AbstractMovingObject movingObject, AbstractGameObject targetObject, GameCollection gameCollection);
    
}
