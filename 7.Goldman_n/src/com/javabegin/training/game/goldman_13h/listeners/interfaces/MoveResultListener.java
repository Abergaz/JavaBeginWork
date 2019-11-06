package com.javabegin.training.game.goldman_13h.listeners.interfaces;


import com.javabegin.training.game.goldman_13h.enums.ActionResult;
import com.javabegin.training.game.goldman_13h.gameobjects.abstracts.AbstractMovingObject;

public interface MoveResultListener {
    
     public void notifyActionResult(ActionResult actionResult, AbstractMovingObject abstractMovingObject);

}
