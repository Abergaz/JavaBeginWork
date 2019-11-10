package ru.javabegin.fastjava2.javafx.lesson_7h.start;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import ru.javabegin.fastjava2.javafx.lesson_7h.interfaces.impls.CollectionAddressBook;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../fxml/main.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setMinHeight(600);
        primaryStage.setMinWidth(400);
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();

        testData();
    }

    private void testData() {
        CollectionAddressBook addressBook = new CollectionAddressBook();
        addressBook.fillTestData();
        addressBook.print();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
