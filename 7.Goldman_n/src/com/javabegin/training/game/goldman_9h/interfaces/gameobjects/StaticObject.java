/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javabegin.training.game.goldman_9h.interfaces.gameobjects;


import com.javabegin.training.game.goldman_9h.objects.Coordinate;
import com.javabegin.training.game.goldman_9h.enums.GameObjectType;

import javax.swing.*;

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
