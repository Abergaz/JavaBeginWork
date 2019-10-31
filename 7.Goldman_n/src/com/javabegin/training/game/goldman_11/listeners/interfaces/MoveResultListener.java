package com.javabegin.training.game.goldman_11.listeners.interfaces;


import com.javabegin.training.game.goldman_11.enums.ActionResult;
import com.javabegin.training.game.goldman_11.gameobjects.abstracts.AbstractMovingObject;

public interface MoveResultListener {
    
     public void notifyActionResult(ActionResult actionResult, AbstractMovingObject abstractMovingObject);

}
