package com.javabegin.training.game.goldman_12h.movestrategies.interfaces;


import com.javabegin.training.game.goldman_12h.collections.interfaces.GameCollection;
import com.javabegin.training.game.goldman_12h.enums.MovingDirection;
import com.javabegin.training.game.goldman_12h.gameobjects.abstracts.AbstractGameObject;
import com.javabegin.training.game.goldman_12h.gameobjects.abstracts.AbstractMovingObject;

public interface MoveStrategy {
    
    MovingDirection getDirection(AbstractMovingObject movingObject, AbstractGameObject targetObject, GameCollection gameCollection);
    
}
