package com.javabegin.training.game.goldman_10h.listeners.interfaces;

import com.javabegin.training.game.goldman_10h.enums.ActionResult;
import com.javabegin.training.game.goldman_10h.gameobjects.abstracts.AbstractMovingObject;

public interface MoveResultListener {
    
     public void notifyActionResult(ActionResult actionResult, AbstractMovingObject abstractMovingObject);

}
