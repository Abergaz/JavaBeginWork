package com.javabegin.training.game.goldman_9h.movestrategies;


import com.javabegin.training.game.goldman_9h.abstracts.AbstractGameObject;
import com.javabegin.training.game.goldman_9h.abstracts.AbstractMovingObject;
import com.javabegin.training.game.goldman_9h.enums.MovingDirection;
import com.javabegin.training.game.goldman_9h.interfaces.gamemap.collections.GameCollection;

public interface MoveStrategy {
    
    MovingDirection getDirection(AbstractMovingObject movingObject, AbstractGameObject targetObject, GameCollection gameCollection);
    
}
