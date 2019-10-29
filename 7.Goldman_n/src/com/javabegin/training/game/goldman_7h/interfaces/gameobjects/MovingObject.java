package com.javabegin.training.game.goldman_7h.interfaces.gameobjects;


import com.javabegin.training.game.goldman_7h.abstracts.AbstractGameObject;
import com.javabegin.training.game.goldman_7h.enums.ActionResult;
import com.javabegin.training.game.goldman_7h.enums.MovingDirection;

/**
 *
 * поведение для всех движущихся объектов: 
 */
public interface MovingObject extends StaticObject{
    
    ActionResult moveToObject(MovingDirection direction, AbstractGameObject gameObject);
    
    int getStep();
       
}
