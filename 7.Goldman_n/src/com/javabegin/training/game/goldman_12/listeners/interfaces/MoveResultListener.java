package com.javabegin.training.game.goldman_12.listeners.interfaces;


import com.javabegin.training.game.goldman_12.enums.ActionResult;
import com.javabegin.training.game.goldman_12.gameobjects.abstracts.AbstractMovingObject;

public interface MoveResultListener {
    
     public void notifyActionResult(ActionResult actionResult, AbstractMovingObject abstractMovingObject);

}
