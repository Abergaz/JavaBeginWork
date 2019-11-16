package ru.javabegin.fastjava2.javafx.lesson_24.db;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SQLiteConnection {



    public static Connection getConnection() {
        try {

//            Class.forName("org.sqlite.JDBC").newInstance(); // в последних версиях драйверов - необязательно, т.к. экземпляр находоится автоматически (по url соединения)

            // путь к БД желательно выносить в отдельный файл настроек
            String url = "jdbc:sqlite:D:\\JavaBeginWork\\1.JavaBeginWork_Basic\\9.JavaFX_n\\src\\ru\\javabegin\\fastjava2\\javafx\\lesson_24\\db\\addressbook.db";// указываем относительный путь к файлу БД

            return DriverManager.getConnection(url);

        } catch (SQLException ex) {
            Logger.getLogger(SQLiteConnection.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

}
