package com.javabegin.training.game.goldman_8h.movestrategies;

import com.javabegin.training.game.goldman_8h.abstracts.AbstractGameObject;
import com.javabegin.training.game.goldman_8h.abstracts.AbstractMovingObject;
import com.javabegin.training.game.goldman_8h.enums.MovingDirection;
import com.javabegin.training.game.goldman_8h.interfaces.gamemap.collections.GameCollection;

public interface MoveStrategy {
    
    MovingDirection getDirection(AbstractMovingObject movingObject, AbstractGameObject targetObject, GameCollection gameCollection);
    
}
