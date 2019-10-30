package com.javabegin.training.game.goldman_10.interfaces.gameobjects;


import com.javabegin.training.game.goldman_10.abstracts.AbstractGameObject;
import com.javabegin.training.game.goldman_10.enums.ActionResult;
import com.javabegin.training.game.goldman_10.enums.MovingDirection;

/**
 *
 * поведение для всех движущихся объектов: 
 */
public interface MovingObject extends StaticObject{
    
    ActionResult moveToObject(MovingDirection direction, AbstractGameObject gameObject);
    
    int getStep();
       
}
