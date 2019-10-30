package com.javabegin.training.game.goldman_8h.objects.listeners;


import com.javabegin.training.game.goldman_8h.enums.ActionResult;
import com.javabegin.training.game.goldman_8h.objects.GoldMan;

public interface MoveResultListener {
    
     public void notifyActionResult(ActionResult actionResult, GoldMan goldMan);

}
