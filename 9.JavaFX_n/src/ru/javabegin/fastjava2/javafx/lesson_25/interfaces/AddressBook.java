package ru.javabegin.fastjava2.javafx.lesson_25.interfaces;

import javafx.collections.ObservableList;
import ru.javabegin.fastjava2.javafx.lesson_25.objects.Person;


public interface AddressBook {

    boolean add(Person person);

    boolean update(Person person);

    boolean delete(Person person);

    ObservableList<Person> findAll();

    ObservableList<Person> find(String text);

}
