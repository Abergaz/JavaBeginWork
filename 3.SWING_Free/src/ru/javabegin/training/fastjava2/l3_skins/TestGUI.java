package ru.javabegin.training.fastjava2.l3_skins;


import com.jtattoo.plaf.aero.AeroLookAndFeel;


import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class TestGUI{

    public static void main(String[] args) {
        
        try {
            //устанавливаем скин для коонтейнера
            UIManager.setLookAndFeel(new AeroLookAndFeel());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(TestGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        //указываем что скин применяется и к самому верхему элементу - окну
        JFrame.setDefaultLookAndFeelDecorated(true);
        
        
        MyJButton button1 = new MyJButton("Button");
    
        MyJPanel panel = new MyJPanel("Panel", 100, 100, button1);
        
        MyJFrame frame = new MyJFrame("Frame", 200, 200, panel);
  
                                
    }
   
}
