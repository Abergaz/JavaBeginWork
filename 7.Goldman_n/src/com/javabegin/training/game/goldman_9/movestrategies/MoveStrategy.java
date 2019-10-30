package com.javabegin.training.game.goldman_9.movestrategies;


import com.javabegin.training.game.goldman_9.abstracts.AbstractGameObject;
import com.javabegin.training.game.goldman_9.abstracts.AbstractMovingObject;
import com.javabegin.training.game.goldman_9.enums.MovingDirection;
import com.javabegin.training.game.goldman_9.interfaces.gamemap.collections.GameCollection;

public interface MoveStrategy {
    
    MovingDirection getDirection(AbstractMovingObject movingObject, AbstractGameObject targetObject, GameCollection gameCollection);
    
}
