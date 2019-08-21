package ru.javabegin.training.fastjava2.shop_27.bank;


import ru.javabegin.training.fastjava2.shop_27.interfaces.BankInterface;

public abstract class BaseBank implements BankInterface {

    public BaseBank(String name, String creditDescription) {
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
