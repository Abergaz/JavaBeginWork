package ru.javabegin.training.fastjava2.l6_listner_events.gui;

import javax.swing.JButton;


public class MyJButton extends JButton{
   
    public MyJButton(String title){
        super.setText(title);
    }

    public MyJButton(String title, int width, int height){
        this(title);
        super.setSize(width, height);
    }
    
    
}
