package com.javabegin.training.game.goldman_11h.listeners.interfaces;


import com.javabegin.training.game.goldman_11h.enums.ActionResult;
import com.javabegin.training.game.goldman_11h.gameobjects.abstracts.AbstractMovingObject;

public interface MoveResultListener {
    
     public void notifyActionResult(ActionResult actionResult, AbstractMovingObject abstractMovingObject);

}
