package ru.javabegin.training.fastjava2.Shop_26.client;


import ru.javabegin.training.fastjava2.Shop_26.interfaces.VisitorInterface;

public class BaseVisitor implements VisitorInterface {

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
