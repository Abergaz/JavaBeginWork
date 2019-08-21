package ru.javabegin.training.fastjava2.shop_27.client;


import ru.javabegin.training.fastjava2.shop_27.interfaces.VisitorInterface;

public abstract class BaseVisitor implements VisitorInterface {

    private String name;

    @Override
    public void buy(){

    }

    @Override
    public void returnGoods(){

    }

    @Override
    public String getName() {
        return name;
    }


}
