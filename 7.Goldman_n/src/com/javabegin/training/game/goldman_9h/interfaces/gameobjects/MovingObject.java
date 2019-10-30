package com.javabegin.training.game.goldman_9h.interfaces.gameobjects;


import com.javabegin.training.game.goldman_9h.abstracts.AbstractGameObject;
import com.javabegin.training.game.goldman_9h.enums.ActionResult;
import com.javabegin.training.game.goldman_9h.enums.MovingDirection;

/**
 *
 * поведение для всех движущихся объектов: 
 */
public interface MovingObject extends StaticObject{
    
    ActionResult moveToObject(MovingDirection direction, AbstractGameObject gameObject);
    
    int getStep();
       
}
