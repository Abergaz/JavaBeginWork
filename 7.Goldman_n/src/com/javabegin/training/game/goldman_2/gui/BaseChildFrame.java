package com.javabegin.training.game.goldman_2.gui;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
/**
 * от него наследуются все дочернии фреймы/окна
 * @author ZagrebaSR
 */
public abstract class BaseChildFrame extends JFrame {
    
    public BaseChildFrame() {
        //при создании устанавливем поведение при закрытии окна
        setCloseOperation();
    }
    
    private JFrame parentFrame;
    /**      
     * @return - возвращаем родительское окно
     */
    public JFrame getParentFrame() {
        return parentFrame;
    }
    /**
     * открытиее дочернего окна
     * @param parent - родитльмкое окно
     */
    protected void showFrame(JFrame parent) {
        //устанавливаем родительсоке окно 
        this.parentFrame = parent;
        //прячем родительское окно
        parent.setVisible(false);
        //показываем родительсоке окно
        super.setVisible(true);
    }
    
    /**
     * закрытие дочернего окна
     */
    protected void closeFrame() {
        if (parentFrame==null) {
            throw new IllegalArgumentException("parent frame must not be null!");
        }
        //текщее дочерние окно прячем
        super.setVisible(false);
        //родительксое окно показываем
        parentFrame.setVisible(true);
        
    }

    protected void setCloseOperation() {
        //при закрытии окна ничего не происходит
        super.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        //добавляем слушателя на закрытие, адптер и переопределяем метод 
        super.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {              
                closeFrame();
            }
        });

    }
    
}
