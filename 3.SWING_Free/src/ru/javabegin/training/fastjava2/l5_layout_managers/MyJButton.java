package ru.javabegin.training.fastjava2.l5_layout_managers;

import javax.swing.JButton;


public class MyJButton extends JButton{
   
    public MyJButton(String title){
        //дефолтный констурктор с именем на кнопке
        super.setText(title);
    }

    public MyJButton(String title, int width, int height){
        this(title);
        //устанавливаем размер кнопки
        super.setSize(width, height);
    }
    
    
}
