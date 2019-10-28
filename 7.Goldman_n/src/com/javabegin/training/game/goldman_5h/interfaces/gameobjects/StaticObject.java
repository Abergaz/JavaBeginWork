/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javabegin.training.game.goldman_5h.interfaces.gameobjects;


import com.javabegin.training.game.goldman_5h.enums.GameObjectType;
import com.javabegin.training.game.goldman_5h.objects.Coordinate;

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
