package ru.javabegin.training.fastjava2.l6_listner_events.listners;

import ru.javabegin.training.fastjava2.l6_listner_events.gui.MyJTextField;
import ru.javabegin.training.fastjava2.l6_listner_events.gui.TestGUI;

import java.awt.event.FocusEvent;
import java.awt.Color;
import java.awt.event.FocusListener;

/**
 * слушатель для текстовых полей
 */
public class CalcTextFieldFocusListener implements FocusListener {

    private MyJTextField field;

    public CalcTextFieldFocusListener(MyJTextField field) {
        //иниициализируем поле для прослушки
        this.field = field;
    }

    @Override
    public void focusGained(FocusEvent e) {
        //если поле в фокусе и там сейчас подсказка, то очищаем поле и устанавливаем цвет шрифта черный
        if (field.getText().trim().equals(TestGUI.INPUT_CHISLO)) {
            field.setText("");
            field.setForeground(Color.BLACK);
        }
    }

    @Override
    public void focusLost(FocusEvent e) {
        //если поле потеряло фокус и там пусто, то записываем посказку в поле  и устанавливаем цвет шрифта серый
        if (field.getText().trim().equals("")) {
            field.setText(TestGUI.INPUT_CHISLO);
            field.setForeground(Color.GRAY);
        }
    }
}
