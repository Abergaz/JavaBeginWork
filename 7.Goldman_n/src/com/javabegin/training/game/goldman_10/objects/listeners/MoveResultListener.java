package com.javabegin.training.game.goldman_10.objects.listeners;


import com.javabegin.training.game.goldman_10.abstracts.AbstractMovingObject;
import com.javabegin.training.game.goldman_10.enums.ActionResult;

public interface MoveResultListener {
    
     public void notifyActionResult(ActionResult actionResult, AbstractMovingObject abstractMovingObject);

}
