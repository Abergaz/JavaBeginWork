package ru.javabegin.training.fastjava2.l5_layout_managers;

import java.awt.Component;
import java.awt.LayoutManager;
import javax.swing.BorderFactory;
import javax.swing.JPanel;


public class MyJPanel extends JPanel{

    
    public MyJPanel(String name, int width, int height) {
        //устанавливаем размер панели
        super.setSize(width, height);
        //устанавливаем имя панели
        super.setName(name);
        //устанавливем рамки для панали
        super.setBorder(BorderFactory.createEtchedBorder());   
    }
    
    public MyJPanel(String name, int width, int height, Component comp) {
        this(name, width, height);
        super.add(comp);
    }

    public MyJPanel(String name, int width, int height, LayoutManager layout) {
        this(name, width, height);       
        super.setLayout(layout);
    }
    
    public MyJPanel(String name, int width, int height, LayoutManager layout, Component comp) {
        this(name, width, height);
        super.setLayout(layout);
        super.add(comp);      
    }


}
