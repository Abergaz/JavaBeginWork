package com.javabegin.training.game.goldman_9.objects.listeners;


import com.javabegin.training.game.goldman_9.abstracts.AbstractMovingObject;
import com.javabegin.training.game.goldman_9.enums.ActionResult;

public interface MoveResultListener {
    
     public void notifyActionResult(ActionResult actionResult, AbstractMovingObject abstractMovingObject);

}