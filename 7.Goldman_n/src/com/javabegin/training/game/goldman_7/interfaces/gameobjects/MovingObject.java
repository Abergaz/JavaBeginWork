package com.javabegin.training.game.goldman_7.interfaces.gameobjects;

import com.javabegin.training.game.goldman_7.abstracts.AbstractGameObject;
import com.javabegin.training.game.goldman_7.enums.ActionResult;
import com.javabegin.training.game.goldman_7.enums.MovingDirection;

/**
 *
 * поведение для всех движущихся объектов: 
 */
public interface MovingObject extends StaticObject{
    
    ActionResult moveToObject(MovingDirection direction, AbstractGameObject gameObject);
    
    int getStep();
       
}
