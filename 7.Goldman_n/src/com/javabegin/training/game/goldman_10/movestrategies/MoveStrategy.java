package com.javabegin.training.game.goldman_10.movestrategies;


import com.javabegin.training.game.goldman_10.abstracts.AbstractGameObject;
import com.javabegin.training.game.goldman_10.abstracts.AbstractMovingObject;
import com.javabegin.training.game.goldman_10.enums.MovingDirection;
import com.javabegin.training.game.goldman_10.interfaces.gamemap.collections.GameCollection;

public interface MoveStrategy {
    
    MovingDirection getDirection(AbstractMovingObject movingObject, AbstractGameObject targetObject, GameCollection gameCollection);
    
}
