package com.javabegin.training.game.goldman_11h.movestrategies.interfaces;


import com.javabegin.training.game.goldman_11h.enums.MovingDirection;
import com.javabegin.training.game.goldman_11h.collections.interfaces.GameCollection;
import com.javabegin.training.game.goldman_11h.gameobjects.abstracts.AbstractGameObject;
import com.javabegin.training.game.goldman_11h.gameobjects.abstracts.AbstractMovingObject;

public interface MoveStrategy {
    
    MovingDirection getDirection(AbstractMovingObject movingObject, AbstractGameObject targetObject, GameCollection gameCollection);
    
}
