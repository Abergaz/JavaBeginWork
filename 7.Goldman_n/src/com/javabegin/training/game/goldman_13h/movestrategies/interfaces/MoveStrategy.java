package com.javabegin.training.game.goldman_13h.movestrategies.interfaces;


import com.javabegin.training.game.goldman_13h.collections.interfaces.GameCollection;
import com.javabegin.training.game.goldman_13h.enums.MovingDirection;
import com.javabegin.training.game.goldman_13h.gameobjects.abstracts.AbstractGameObject;
import com.javabegin.training.game.goldman_13h.gameobjects.abstracts.AbstractMovingObject;

public interface MoveStrategy {
    
    MovingDirection getDirection(AbstractMovingObject movingObject, AbstractGameObject targetObject, GameCollection gameCollection);
    
}
