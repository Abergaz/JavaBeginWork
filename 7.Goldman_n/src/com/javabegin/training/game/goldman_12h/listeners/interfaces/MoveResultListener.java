package com.javabegin.training.game.goldman_12h.listeners.interfaces;


import com.javabegin.training.game.goldman_12h.enums.ActionResult;
import com.javabegin.training.game.goldman_12h.gameobjects.abstracts.AbstractMovingObject;

public interface MoveResultListener {
    
     public void notifyActionResult(ActionResult actionResult, AbstractMovingObject abstractMovingObject);

}
