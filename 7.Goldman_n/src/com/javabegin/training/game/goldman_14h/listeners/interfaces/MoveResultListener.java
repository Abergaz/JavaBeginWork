package com.javabegin.training.game.goldman_14h.listeners.interfaces;


import com.javabegin.training.game.goldman_14h.enums.ActionResult;
import com.javabegin.training.game.goldman_14h.gameobjects.abstracts.AbstractGameObject;

public interface MoveResultListener {
    
     public void notifyActionResult(ActionResult actionResult, AbstractGameObject sourceObject, AbstractGameObject targetObject);

}
