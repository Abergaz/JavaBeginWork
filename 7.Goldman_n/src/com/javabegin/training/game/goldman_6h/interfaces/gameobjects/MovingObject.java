/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javabegin.training.game.goldman_6h.interfaces.gameobjects;
import com.javabegin.training.game.goldman_6h.abstracts.AbstractGameMap;
import com.javabegin.training.game.goldman_6h.enums.MovingDirection;

/**
 *
 * поведение для всех движущихся объектов: 
 */
public interface MovingObject extends StaticObject{
    
    void move(MovingDirection direction, AbstractGameMap abstractGameMap);
    
    int getStep();
   
}
