package com.javabegin.training.game.goldman_6h.abstracts;


import com.javabegin.training.game.goldman_6h.enums.GameObjectType;
import com.javabegin.training.game.goldman_6h.interfaces.gameobjects.StaticObject;
import com.javabegin.training.game.goldman_6h.objects.Coordinate;

import java.util.Objects;
import javax.swing.ImageIcon;


/**
 * класс, который отвечает за любой объект, созданный в игре. задает все общие
 * характеристики объектов в игре
 */
public abstract class AbstractGameObject implements StaticObject {
    
    private GameObjectType type;// все объекты будут иметь тип
    private Coordinate coordinate;// все объекты будут иметь координаты положения
    
    private ImageIcon icon = getImageIcon("/com/javabegin/training/game/goldman_6h/images/noicon.png");// изображение по-умолчанию

    protected AbstractGameObject() {// частый вопрос - нужен ли public конструктор в абстрактном классе
    }

    public void setIcon(ImageIcon currentIcon) {
        this.icon = currentIcon;
    }

    @Override
    public ImageIcon getIcon() {
        return icon;
    }

    
    protected ImageIcon getImageIcon(String path){
        return new ImageIcon(getClass().getResource(path));
    }
    
    @Override
    public GameObjectType getType() {
        return type;
    }

    public void setType(GameObjectType type) {
        this.type = type;
    }

    @Override
    public Coordinate getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + (this.type != null ? this.type.hashCode() : 0);
        hash = 37 * hash + Objects.hashCode(this.coordinate);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AbstractGameObject other = (AbstractGameObject) obj;
        return true;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    

   
}
