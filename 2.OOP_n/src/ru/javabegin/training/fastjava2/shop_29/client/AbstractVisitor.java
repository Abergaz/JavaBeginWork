package ru.javabegin.training.fastjava2.shop_29.client;


import ru.javabegin.training.fastjava2.shop_29.interfaces.GoodsInterface;
import ru.javabegin.training.fastjava2.shop_29.interfaces.VisitorInterface;

public abstract class AbstractVisitor implements VisitorInterface {

    private String name;

    @Override
    public void buy(GoodsInterface goods){
        System.out.println(goods.getName());
    }



    @Override
    public void returnGoods(GoodsInterface goods){

    }

    @Override
    public String getName() {
        return name;
    }


}
