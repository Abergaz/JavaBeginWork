package ru.javabegin.training.fastjava2.l6_listner_events.gui;

import com.jtattoo.plaf.smart.SmartLookAndFeel;
import ru.javabegin.training.fastjava2.l6_listner_events.listners.CalcButtonActionListener;
import ru.javabegin.training.fastjava2.l6_listner_events.listners.CalcTextFieldFocusListener;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class TestGUI {

    public static final String INPUT_CHISLO = "введите число";
    
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
            //устанавливаем скин из библиотеки jtattoo
            UIManager.setLookAndFeel(new SmartLookAndFeel());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(TestGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        // устанавливаем признак использования скина главным окном
        JFrame.setDefaultLookAndFeelDecorated(true);

        TestGUI testGUI = new TestGUI();
        //создаем лейблы
        testGUI.createLabels();
        //создаем текстовые поля
        testGUI.createTextFields();
        //создаем кнопки
        testGUI.createButtons();
        //создаем панели
        testGUI.createPanels();
        //создаем фрейм
        testGUI.createFrame();

    }

    //<editor-fold defaultstate="collapsed" desc="create GUI components">

    /**
     * создаем лейблы
     */
    private void createLabels() {
        labelChislo1 = new JLabel("Число 1");
        labelChislo2 = new JLabel("Число 2");
        labelResult = new JLabel("Результат");
    }
    /**
     * создаем текстовые поля
     */
    private void createTextFields() {
        jtxtChislo1 = new MyJTextField(INPUT_CHISLO, 10);
        jtxtChislo2 = new MyJTextField(INPUT_CHISLO, 10);

        //поле для результата
        jtxtResult = new MyJTextField(15, Color.RED);
        //делаем поле не редактируемым
        jtxtResult.setEditable(false);
        //поле недоступно ддля выбора
        jtxtResult.setFocusable(false);

        //добавляем слушателей для полей
        addTextFieldListeners();

    }

    /**
     * создаем кнопки
     */

    private void createButtons() {
        btnAdd = new MyJButton("Сложение");
        btnSubtract = new MyJButton("Вычитание");
        btnDivide = new MyJButton("Деление");
        btnMultiply = new MyJButton("Умножение");
        //добавляем слушателей для кнопок
        addButtonListeners();
    }

    /**
     * создаем панели
     */
    private void createPanels() {
        panel1 = new MyJPanel("panel1", 100, 100);
        //предпочитаемый размер при изменении окна
        panel1.setPreferredSize(new Dimension(200, 50));
        //диспетчер расположения для панели
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

    /**
     * создаем фрейм(главное окно)
     */
    private void createFrame() {
        frame = new MyJFrame("Калькулятор", 430, 200, new BorderLayout(2, 2));
        //минимально допустивый размер окна
        frame.setMinimumSize(new Dimension(430, 200));
        //запрещаем изменять размеры окна
        frame.setResizable(false);
        //добавляем панели
        frame.getContentPane().add(panel1, BorderLayout.NORTH);
        frame.getContentPane().add(panel2, BorderLayout.CENTER);
        frame.getContentPane().add(panel3, BorderLayout.SOUTH);
        //делаем окно видимым
        frame.setVisible(true);

    }
    //</editor-fold>
    
    
    //<editor-fold defaultstate="collapsed" desc="create listeners">

    /**
     * добавляем слушателя для кнопок
     */
    private void addButtonListeners() {
        CalcButtonActionListener bl = new CalcButtonActionListener(jtxtChislo1, jtxtChislo2, jtxtResult);

        btnAdd.addActionListener(bl);
        btnSubtract.addActionListener(bl);
        btnMultiply.addActionListener(bl);
        btnDivide.addActionListener(bl);        
    }

    /**
     * добавляем слушателя для полей
     */

    private void addTextFieldListeners() {
        jtxtChislo1.addFocusListener(new CalcTextFieldFocusListener(jtxtChislo1));
        jtxtChislo2.addFocusListener(new CalcTextFieldFocusListener(jtxtChislo2));
    }
    
    //</editor-fold>
}
