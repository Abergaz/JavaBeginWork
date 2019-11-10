package ru.javabegin.fastjava2.javafx.lesson_7.interfaces.impls;

import ru.javabegin.fastjava2.javafx.lesson_7.interfaces.AddressBook;
import ru.javabegin.fastjava2.javafx.lesson_7.objects.Person;


import java.util.ArrayList;

// класс реализовывает интерфейс с помощью коллекции
public class CollectionAddressBook implements AddressBook {

    private ArrayList<Person> personList = new ArrayList<Person>();

    @Override
    public void add(Person person) {personList.add(person);}

    @Override
    // для коллекции не используется, но пригодится для случая, когда данные хранятся в БД и пр.
    public void update(Person person) {
        // т.к. коллекция и является хранилищем - то ничего обновлять не нужно
        // если бы данные хранились в БД или файле - в этом методе нужно было бы обновить соотв. запись
    }

    @Override
    public void delete(Person person) {
        personList.remove(person);
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }

}
