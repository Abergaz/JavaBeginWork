package com.javabegin.training.game.goldman_11h.gameobjects.interfaces;


import com.javabegin.training.game.goldman_11h.enums.ActionResult;
import com.javabegin.training.game.goldman_11h.enums.MovingDirection;
import com.javabegin.training.game.goldman_11h.gameobjects.abstracts.AbstractGameObject;

/**
 *
 * поведение для всех движущихся объектов: 
 */
public interface MovingObject extends StaticObject{
    
    ActionResult moveToObject(MovingDirection direction, AbstractGameObject gameObject);
    
    int getStep();
       
}
