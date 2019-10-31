package com.javabegin.training.game.goldman_11.gameobjects.interfaces;


import com.javabegin.training.game.goldman_11.enums.ActionResult;
import com.javabegin.training.game.goldman_11.enums.MovingDirection;
import com.javabegin.training.game.goldman_11.gameobjects.abstracts.AbstractGameObject;

/**
 *
 * поведение для всех движущихся объектов: 
 */
public interface MovingObject extends StaticObject{
    
    ActionResult moveToObject(MovingDirection direction, AbstractGameObject gameObject);
    
    int getStep();
       
}
