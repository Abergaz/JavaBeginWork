package ru.javabegin.fastjava2.javafx.lesson_14.utils;

import javafx.scene.control.Alert;

public class DialogManager {

    public static void showInfoDialog(String title, String text){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setContentText(text);
        alert.setHeaderText("");
        alert.showAndWait();
    }

    public static void showErrorDialog(String title, String text){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setContentText(text);
        alert.setHeaderText("");
        alert.showAndWait();
    }


}
