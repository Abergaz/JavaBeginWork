package ru.javabegin.fastjava2.javafx.lesson_17h.interfaces.impls;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import ru.javabegin.fastjava2.javafx.lesson_17h.db.SQLiteConnection;
import ru.javabegin.fastjava2.javafx.lesson_17h.interfaces.AddressBook;
import ru.javabegin.fastjava2.javafx.lesson_17h.objects.Person;


import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBAddressBook implements AddressBook {

    private ObservableList<Person> personList = FXCollections.observableArrayList();

    @Override
    public boolean add(Person person) {
        try (Connection con = SQLiteConnection.getConnection(); PreparedStatement statement = con.prepareStatement("insert into person(fio, phone) values (?, ?)", Statement.RETURN_GENERATED_KEYS)) {
            statement.setString(1,person.getFio());
            statement.setString(2,person.getPhone());

            int result = statement.executeUpdate();
            if (result>0) {
                int id = statement.getGeneratedKeys().getInt(1);// получить сгенерированный id вставленной записи
                person.setId(id);
                personList.add(person);
                return true;
            }
        }catch (SQLException ex){
            Logger.getLogger(DBAddressBook.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

    @Override
    public boolean delete(Person person) {

        try (Connection con = SQLiteConnection.getConnection();  Statement statement = con.createStatement();) {
            int result = statement.executeUpdate("delete from person where id="+person.getId());

            if (result>0) {
                personList.remove(person);
                return true;
            }

        }catch (SQLException ex){
            Logger.getLogger(DBAddressBook.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

    @Override
    public ObservableList<Person> findAll() {

        try (Connection con = SQLiteConnection.getConnection(); Statement statement = con.createStatement(); ResultSet rs = statement.executeQuery("select * from person");) {
            while (rs.next()) {
                Person person  = new Person();
                person.setId(rs.getInt("id"));
                person.setFio(rs.getString("fio"));
                person.setPhone(rs.getString("phone"));
                personList.add(person);
            }
        }catch (SQLException ex){
            Logger.getLogger(DBAddressBook.class.getName()).log(Level.SEVERE, null, ex);
        }

        return personList;
    }

    @Override
    public boolean update(Person person) {
        try (Connection con = SQLiteConnection.getConnection(); PreparedStatement statement = con.prepareStatement("update person set fio=?, phone=? where id=?")) {
            statement.setString(1,person.getFio());
            statement.setString(2,person.getPhone());
            statement.setInt(3,person.getId());

            int result = statement.executeUpdate();
            if (result>0) {
                // обновление в коллекции происходит автоматически, после нажатия ОК в окне редактирования
                return true;
            }
        }catch (SQLException ex){
            Logger.getLogger(DBAddressBook.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

    @Override
    public ObservableList<Person> find(String text) {
        throw new UnsupportedOperationException("Not implemented, yet");
    }

    public ObservableList<Person> getPersonList() {
        return personList;
    }
}