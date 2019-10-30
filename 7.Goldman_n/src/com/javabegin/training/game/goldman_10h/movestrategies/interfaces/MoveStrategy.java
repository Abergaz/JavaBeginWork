package com.javabegin.training.game.goldman_10h.movestrategies.interfaces;


import com.javabegin.training.game.goldman_10h.collections.interfaces.GameCollection;
import com.javabegin.training.game.goldman_10h.enums.MovingDirection;
import com.javabegin.training.game.goldman_10h.gameobjects.abstracts.AbstractGameObject;
import com.javabegin.training.game.goldman_10h.gameobjects.abstracts.AbstractMovingObject;

public interface MoveStrategy {
    
    MovingDirection getDirection(AbstractMovingObject movingObject, AbstractGameObject targetObject, GameCollection gameCollection);
    
}
