package com.javabegin.training.game.goldman_14h.movestrategies.interfaces;


import com.javabegin.training.game.goldman_14h.collections.interfaces.GameCollection;
import com.javabegin.training.game.goldman_14h.enums.MovingDirection;
import com.javabegin.training.game.goldman_14h.gameobjects.abstracts.AbstractGameObject;
import com.javabegin.training.game.goldman_14h.gameobjects.abstracts.AbstractMovingObject;

public interface MoveStrategy {
    
    MovingDirection getDirection(AbstractMovingObject movingObject, AbstractGameObject targetObject, GameCollection gameCollection);
    
}
