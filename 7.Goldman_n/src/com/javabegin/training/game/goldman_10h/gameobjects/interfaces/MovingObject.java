package com.javabegin.training.game.goldman_10h.gameobjects.interfaces;


import com.javabegin.training.game.goldman_10h.enums.ActionResult;
import com.javabegin.training.game.goldman_10h.enums.MovingDirection;
import com.javabegin.training.game.goldman_10h.gameobjects.abstracts.AbstractGameObject;

/**
 *
 * поведение для всех движущихся объектов: 
 */
public interface MovingObject extends StaticObject{
    
    ActionResult moveToObject(MovingDirection direction, AbstractGameObject gameObject);
    
    int getStep();
       
}
