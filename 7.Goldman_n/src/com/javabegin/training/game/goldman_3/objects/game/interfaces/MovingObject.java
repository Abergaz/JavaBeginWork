/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javabegin.training.game.goldman_3.objects.game.interfaces;

import com.javabegin.training.game.goldman_3.enums.MovingDirection;
import com.javabegin.training.game.goldman_3.objects.common.AbstractGameObject;

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
