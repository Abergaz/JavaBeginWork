package com.javabegin.training.game.goldman_13h.gameobjects.interfaces;


import com.javabegin.training.game.goldman_13h.enums.ActionResult;
import com.javabegin.training.game.goldman_13h.enums.MovingDirection;
import com.javabegin.training.game.goldman_13h.gameobjects.abstracts.AbstractGameObject;

/**
 *
 * поведение для всех движущихся объектов: 
 */
public interface MovingObject extends StaticObject{
    
    ActionResult moveToObject(MovingDirection direction, AbstractGameObject gameObject);
    
    int getStep();
       
}
