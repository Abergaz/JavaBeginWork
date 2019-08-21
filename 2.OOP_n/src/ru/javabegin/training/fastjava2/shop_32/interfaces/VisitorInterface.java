package ru.javabegin.training.fastjava2.shop_32.interfaces;

public interface VisitorInterface {

    void buy(GoodsInterface goods);

    void returnGoods(GoodsInterface goods);

    String getName();
}
