package com.javabegin.training.game.goldman_9h.objects.listeners;


import com.javabegin.training.game.goldman_9h.abstracts.AbstractMovingObject;
import com.javabegin.training.game.goldman_9h.enums.ActionResult;

public interface MoveResultListener {
    
     public void notifyActionResult(ActionResult actionResult, AbstractMovingObject abstractMovingObject);

}
