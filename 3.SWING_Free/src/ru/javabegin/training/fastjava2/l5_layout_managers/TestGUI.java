package ru.javabegin.training.fastjava2.l5_layout_managers;

import com.jtattoo.plaf.smart.SmartLookAndFeel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
Калькулятор
 */
public class TestGUI {

    private MyJButton btnAdd;
    private MyJButton btnSubtract;
    private MyJButton btnDivide;
    private MyJButton btnMultiply;

    private JLabel labelChislo1;
    private JLabel labelChislo2;
    private JLabel labelResult;

    private MyJTextField jtxtChislo1;
    private MyJTextField jtxtChislo2;
    private MyJTextField jtxtResult;

    private MyJPanel panel1;
    private MyJPanel panel2;
    private MyJPanel panel3;

    private MyJFrame frame;

    public static void main(String[] args) {
        try {
            /**
             * устанавливаем скин из пакета jtattoo
             */
            UIManager.setLookAndFeel(new SmartLookAndFeel());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(TestGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        //устанавливаем скин для главного окна, иначе он будет только для содержимого применен.
        JFrame.setDefaultLookAndFeelDecorated(true);

        TestGUI testGUI = new TestGUI();

        testGUI.createLabels();
        testGUI.createTextFields();
        testGUI.createButtons();
        testGUI.createPanels();
        testGUI.createFrame();

    }

    //<editor-fold defaultstate="collapsed" desc="create GUI components">
    private void createLabels() {
        labelChislo1 = new JLabel("Число 1");
        labelChislo2 = new JLabel("Число 2");
        labelResult = new JLabel("Результат");
    }

    private void createTextFields() {
        jtxtChislo1 = new MyJTextField(10);
        jtxtChislo2 = new MyJTextField(10);

        jtxtResult = new MyJTextField(15, Color.RED);
        //поле не редактируемое
        jtxtResult.setEditable(false);
        //в поле не могут перейти
        jtxtResult.setFocusable(false);

    }

    private void createButtons() {
        btnAdd = new MyJButton("Сложение");
        btnSubtract = new MyJButton("Вычитание");
        btnDivide = new MyJButton("Деление");
        btnMultiply = new MyJButton("Умножение");
    }

    private void createPanels() {
        panel1 = new MyJPanel("panel1", 100, 100);
        //устанавливаем предпочитаемый размер панели при изменении окна
        panel1.setPreferredSize(new Dimension(200, 50));
        //устанавливем менеджер расположения для панели
        panel1.setLayout(new FlowLayout(FlowLayout.LEFT));

        panel2 = new MyJPanel("panel2", 100, 100);
        panel2.setPreferredSize(new Dimension(200, 50));
        panel2.setLayout(new FlowLayout(FlowLayout.LEFT));

        panel3 = new MyJPanel("panel3", 100, 100);
        panel3.setPreferredSize(new Dimension(200, 50));
        panel3.setLayout(new FlowLayout(FlowLayout.LEFT));


        panel1.add(labelChislo1);
        panel1.add(jtxtChislo1);
        panel1.add(labelChislo2);
        panel1.add(jtxtChislo2);

        panel2.add(btnAdd);
        panel2.add(btnSubtract);
        panel2.add(btnMultiply);
        panel2.add(btnDivide);

        panel3.add(labelResult);
        panel3.add(jtxtResult);

    }

    private void createFrame() {
        frame = new MyJFrame("Калькулятор", 430, 200, new BorderLayout(2, 2));
        //устанавливаем мин размер окна
        frame.setMinimumSize(new Dimension(430, 200));
        //запретить изменять размер окна
        frame.setResizable(false);  

        frame.getContentPane().add(panel1, BorderLayout.NORTH);
        frame.getContentPane().add(panel2, BorderLayout.CENTER);
        frame.getContentPane().add(panel3, BorderLayout.SOUTH);

        //делаем окно видимым
        frame.setVisible(true);

    }
    //</editor-fold>
}
