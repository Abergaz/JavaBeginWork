package ru.javabegin.fastjava2.javafx.lesson_12.interfaces;


import ru.javabegin.fastjava2.javafx.lesson_12.objects.Person;

public interface AddressBook {

    // добавить запись
    void add(Person person);

    // внести измененные значения (подтвердить измененные данные)
    void update(Person person);

    // удалить запись
    void delete(Person person);

}
