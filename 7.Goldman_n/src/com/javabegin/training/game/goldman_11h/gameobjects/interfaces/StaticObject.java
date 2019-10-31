/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javabegin.training.game.goldman_11h.gameobjects.interfaces;

import com.javabegin.training.game.goldman_11h.enums.GameObjectType;
import com.javabegin.training.game.goldman_11h.gameobjects.impl.Coordinate;

import javax.swing.ImageIcon;


public interface StaticObject {
 
    // объект должен иметь иконку
    ImageIcon getIcon();

    // координаты
    Coordinate getCoordinate();

    // тип объекта
    GameObjectType getType();
    
            
}
