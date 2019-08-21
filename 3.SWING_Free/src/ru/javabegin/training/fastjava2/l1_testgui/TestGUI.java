package ru.javabegin.training.fastjava2.l1_testgui;


import javax.swing.*;
import java.awt.*;

public class TestGUI {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Test frame");
        jFrame.setSize(400,400);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout flowLayout = new FlowLayout();
        jFrame.setLayout(flowLayout);
        jFrame.setVisible(true);
        JButton jButton = new JButton("Text button");

        jFrame.add(jButton);
    }
}
