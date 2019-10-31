/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javabegin.training.game.goldman_12.gameobjects.interfaces;


import com.javabegin.training.game.goldman_12.enums.GameObjectType;
import com.javabegin.training.game.goldman_12.gameobjects.impl.Coordinate;

import javax.swing.*;

public interface StaticObject {
 
    // объект должен иметь иконку
    ImageIcon getIcon();

    // координаты
    Coordinate getCoordinate();

    // тип объекта
    GameObjectType getType();
    
            
}
