package ru.javabegin.fastjava2.javafx.lesson_10.interfaces;


import ru.javabegin.fastjava2.javafx.lesson_10.objects.Person;

public interface AddressBook {

    // добавить запись
    void add(Person person);

    // внести измененные значения (подтвердить измененные данные)
    void update(Person person);

    // удалить запись
    void delete(Person person);

}