package ru.javabegin.training.fastjava2.l7_jarfiles.listners;


import ru.javabegin.training.fastjava2.l7_jarfiles.calc.CalcOperations;
import ru.javabegin.training.fastjava2.l7_jarfiles.gui.MyJTextField;

import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;

public class CalcButtonActionListener implements ActionListener {

    private MyJTextField jtxtChislo1;
    private MyJTextField jtxtChislo2;
    private MyJTextField jtxtResult;

    public CalcButtonActionListener(MyJTextField jtxtChislo1, MyJTextField jtxtChislo2, MyJTextField jtxtResult) {
        this.jtxtChislo1 = jtxtChislo1;
        this.jtxtChislo2 = jtxtChislo2;
        this.jtxtResult = jtxtResult;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (!(e.getSource() instanceof JButton)) {
            return;
        }
        
        JButton btn = (JButton) e.getSource();

        final double a = Double.parseDouble(jtxtChislo1.getText());
        final double b = Double.parseDouble(jtxtChislo2.getText());

        if (btn.getActionCommand().equals("Сложение")) {
            jtxtResult.setText(String.valueOf(CalcOperations.add(a, b)));
        } else if (btn.getActionCommand().equals("Деление")) {
            jtxtResult.setText(String.valueOf(CalcOperations.divide(a, b)));
        } else if (btn.getActionCommand().equals("Вычитание")) {
            jtxtResult.setText(String.valueOf(CalcOperations.subtract(a, b)));
        } else if (btn.getActionCommand().equals("Умножение")) {
            jtxtResult.setText(String.valueOf(CalcOperations.multiply(a, b)));
        }
    }
}
