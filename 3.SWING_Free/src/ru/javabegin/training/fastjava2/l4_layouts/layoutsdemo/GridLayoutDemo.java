package ru.javabegin.training.fastjava2.l4_layouts.layoutsdemo;

import java.awt.GridLayout;
import javax.swing.JPanel;


public class GridLayoutDemo extends LayoutDefaultButtons{


    @Override
    public void useLayout(JPanel panel) {
        panel.setLayout(new GridLayout(2,3,4,4));
    }

    
    
}
