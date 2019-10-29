/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javabegin.training.game.goldman_7h.interfaces.gameobjects;


import com.javabegin.training.game.goldman_7h.enums.GameObjectType;
import com.javabegin.training.game.goldman_7h.objects.Coordinate;

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
