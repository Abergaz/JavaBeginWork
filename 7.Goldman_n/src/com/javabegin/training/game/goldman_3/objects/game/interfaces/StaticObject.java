/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javabegin.training.game.goldman_3.objects.game.interfaces;


import com.javabegin.training.game.goldman_3.enums.GameObjectType;
import com.javabegin.training.game.goldman_3.objects.common.Coordinate;

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
