package com.javabegin.training.game.goldman_8.objects.listeners;


import com.javabegin.training.game.goldman_8.enums.ActionResult;
import com.javabegin.training.game.goldman_8.objects.GoldMan;

public interface MoveResultListener {
    
     public void notifyActionResult(ActionResult actionResult, GoldMan goldMan);

}
