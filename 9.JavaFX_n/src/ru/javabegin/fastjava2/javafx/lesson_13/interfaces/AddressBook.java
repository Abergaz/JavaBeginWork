package ru.javabegin.fastjava2.javafx.lesson_13.interfaces;


import ru.javabegin.fastjava2.javafx.lesson_13.objects.Person;

public interface AddressBook {

    // добавить запись
    void add(Person person);

    // внести измененные значения (подтвердить измененные данные)
    void update(Person person);

    // удалить запись
    void delete(Person person);

}
