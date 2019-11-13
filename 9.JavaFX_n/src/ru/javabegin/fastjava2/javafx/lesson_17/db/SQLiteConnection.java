package ru.javabegin.fastjava2.javafx.lesson_17.db;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class SQLiteConnection {
    
    private static Connection con;
    
    public static Connection getConnection(){
        try {
              Driver driver = (Driver) Class.forName("org.sqlite.JDBC").newInstance();



              String url = "jdbc:sqlite://D://JavaBeginWork//1.JavaBeginWork_Basic//9.JavaFX_n//src//ru//javabegin//fastjava2//javafx//lesson_17//db//addressbook.db";
              
              if (con==null) {
                  con = DriverManager.getConnection(url);
              }
              
              return con;
              
        } catch (SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(SQLiteConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }

}
