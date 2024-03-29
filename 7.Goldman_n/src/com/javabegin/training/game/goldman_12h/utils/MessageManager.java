package com.javabegin.training.game.goldman_12h.utils;

import java.awt.Component;
import javax.swing.JOptionPane;

public class MessageManager {

    public static void showInformMessage(Component comp, String message) {
        JOptionPane.showMessageDialog(comp, message, "Сообщение", JOptionPane.PLAIN_MESSAGE);
    }

    public static int showYesNoMessage(Component comp, String message) {
        return JOptionPane.showConfirmDialog(comp, message, "Подтверждение", JOptionPane.YES_NO_OPTION);
    }

    public static int showYesNoCancelMessage(Component comp, String message) {
        return JOptionPane.showConfirmDialog(comp, message, "Подтверждение", JOptionPane.YES_NO_CANCEL_OPTION);
    }

    public static void showErrorMessage(Component comp, String message) {
        JOptionPane.showMessageDialog(comp, message, "Ошибка", JOptionPane.ERROR_MESSAGE);
    }
}
