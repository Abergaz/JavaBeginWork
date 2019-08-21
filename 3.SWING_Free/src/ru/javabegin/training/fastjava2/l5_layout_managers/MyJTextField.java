package ru.javabegin.training.fastjava2.l5_layout_managers;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;

public class MyJTextField extends JTextField {

    public MyJTextField(String text, int columns) {
        //дефолтный конструктор с разьером
        this(columns);
        super.setText(text);
    }

    public MyJTextField(int columns) {
        super.setColumns(columns);
        //устанавливаем шрифт
        Font font = new Font("Courier", Font.ITALIC, 12);
        super.setFont(font);
        //устанавливаем цвет
        super.setForeground(Color.GRAY);
    }

    public MyJTextField(int columns, Color textColor) {
        super.setColumns(columns);
        Font font = new Font("Courier", Font.ITALIC, 12);
        super.setFont(font);
        super.setForeground(textColor);
    }
    
}
