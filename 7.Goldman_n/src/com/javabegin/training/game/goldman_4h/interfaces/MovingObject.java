/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javabegin.training.game.goldman_4h.interfaces;

import com.javabegin.training.game.goldman_4h.abstracts.AbstractGameObject;
import com.javabegin.training.game.goldman_4h.enums.MovingDirection;

import javax.swing.ImageIcon;


/**
 *
 * поведение для всех движущихся объектов: 
 */
public interface MovingObject extends StaticObject{
    
    void move(MovingDirection direction);
    
    void getMoveResult(AbstractGameObject objectInNewCoordinate);
    
    // иконки при движении в разные стороны
    ImageIcon getIconLeft();

    ImageIcon getIconUp();

    ImageIcon getIconDown();

    ImageIcon getIconRight();

   
   
}
