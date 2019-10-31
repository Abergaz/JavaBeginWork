package com.javabegin.training.game.goldman_11.movestrategies.interfaces;


import com.javabegin.training.game.goldman_11.collections.interfaces.GameCollection;
import com.javabegin.training.game.goldman_11.enums.MovingDirection;
import com.javabegin.training.game.goldman_11.gameobjects.abstracts.AbstractGameObject;
import com.javabegin.training.game.goldman_11.gameobjects.abstracts.AbstractMovingObject;

public interface MoveStrategy {
    
    MovingDirection getDirection(AbstractMovingObject movingObject, AbstractGameObject targetObject, GameCollection gameCollection);
    
}
