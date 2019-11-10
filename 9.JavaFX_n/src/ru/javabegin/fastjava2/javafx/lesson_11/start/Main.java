package ru.javabegin.fastjava2.javafx.lesson_11.start;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import ru.javabegin.fastjava2.javafx.lesson_11.controllers.MainController;


import java.util.Locale;
import java.util.ResourceBundle;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("../fxml/main.fxml"));
        fxmlLoader.setResources(ResourceBundle.getBundle("ru.javabegin.fastjava2.javafx.lesson_11.bundles.Locale", new Locale("ru")));

        Parent fxmlMain = fxmlLoader.load();
        MainController mainController = fxmlLoader.getController();
        mainController.setMainStage(primaryStage);

        primaryStage.setTitle(fxmlLoader.getResources().getString("address_book"));
        primaryStage.setMinHeight(600);
        primaryStage.setMinWidth(400);
        primaryStage.setScene(new Scene(fxmlMain, 300, 275));
        primaryStage.show();

        testData();
    }

    private void testData() {
//        CollectionAddressBook addressBook = new CollectionAddressBook();
//        addressBook.fillTestData();
//        addressBook.print();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
