package com.javabegin.training.game.goldman_12.gameobjects.interfaces;


import com.javabegin.training.game.goldman_12.enums.ActionResult;
import com.javabegin.training.game.goldman_12.enums.MovingDirection;
import com.javabegin.training.game.goldman_12.gameobjects.abstracts.AbstractGameObject;

/**
 *
 * поведение для всех движущихся объектов: 
 */
public interface MovingObject extends StaticObject{
    
    ActionResult moveToObject(MovingDirection direction, AbstractGameObject gameObject);
    
    int getStep();
       
}
