package ru.javabegin.training.fastjava2.shop_31.interfaces;

public interface VisitorInterface {

    void buy(GoodsInterface goods);

    void returnGoods(GoodsInterface goods);

    String getName();
}
