package ru.javabegin.training.fastjava2.OOP_15;

import ru.javabegin.training.fastjava2.OOP_15.objects.Phone;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone(1024, "Sony","GSM");
        System.out.println(phone.getName()+" "+phone.getType());
        phone.setName("iPhone");
        System.out.println(phone.getName()+" "+phone.getType());
    }
}
