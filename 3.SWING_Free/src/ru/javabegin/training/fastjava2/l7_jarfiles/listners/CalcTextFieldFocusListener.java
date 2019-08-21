package ru.javabegin.training.fastjava2.l7_jarfiles.listners;

import ru.javabegin.training.fastjava2.l7_jarfiles.gui.MyJTextField;
import ru.javabegin.training.fastjava2.l7_jarfiles.gui.TestGUI;

import java.awt.event.FocusEvent;
import java.awt.Color;
import java.awt.event.FocusListener;

public class CalcTextFieldFocusListener implements FocusListener {

    private MyJTextField field;

    public CalcTextFieldFocusListener(MyJTextField field) {
        this.field = field;
    }

    @Override
    public void focusGained(FocusEvent e) {
        if (field.getText().trim().equals(TestGUI.INPUT_CHISLO)) {
            field.setText("");
            field.setForeground(Color.BLACK);
        }
    }

    @Override
    public void focusLost(FocusEvent e) {
        if (field.getText().trim().equals("")) {
            field.setText(TestGUI.INPUT_CHISLO);
            field.setForeground(Color.GRAY);
        }
    }
}
