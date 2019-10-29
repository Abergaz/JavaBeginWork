/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javabegin.training.game.goldman_6.interfaces.gameobjects;


import com.javabegin.training.game.goldman_6.abstracts.AbstractGameMap;
import com.javabegin.training.game.goldman_6.enums.MovingDirection;

/**
 *
 * поведение для всех движущихся объектов: 
 */
public interface MovingObject extends StaticObject{
    
    void move(MovingDirection direction, AbstractGameMap abstractGameMap);
   
}
