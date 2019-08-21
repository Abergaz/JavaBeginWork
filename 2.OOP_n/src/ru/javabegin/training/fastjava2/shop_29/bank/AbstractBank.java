package ru.javabegin.training.fastjava2.shop_29.bank;


import ru.javabegin.training.fastjava2.shop_29.interfaces.BankInterface;

public abstract class AbstractBank implements BankInterface {

    public AbstractBank(String name, String creditDescription) {
        this.name = name;
        this.creditDescription = creditDescription;
    }

    private String name;
    private String creditDescription;


    @Override
    public void checkInfo() {

    }

    @Override
    public void giveCredit() {

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getCreditDescription() {
        return creditDescription;
    }
}
