/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javabegin.training.game.goldman_4h.interfaces;

import com.javabegin.training.game.goldman_4h.enums.GameObjectType;
import com.javabegin.training.game.goldman_4h.objects.Coordinate;

import javax.swing.ImageIcon;


/**
 *
 * @author Tim
 */
public interface StaticObject {
 
    // объект должен иметь иконку
    ImageIcon getIcon();

    // координаты
    Coordinate getCoordinate();

    // тип объекта
    GameObjectType getType();
    
            
}
