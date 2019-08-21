package ru.javabegin.training.fastjava2.shop_32.client;


import ru.javabegin.training.fastjava2.shop_32.interfaces.GoodsInterface;

public class VipVisitor extends AbstractVisitor {

    // private String name; не нужно дублировать переменную, она уже есть в родительском классе Visitor
    private float discount;

    @Override
    public void buy(GoodsInterface goods) {
        if (!checkDiscount()) {
            super.buy(goods);
        }else{
            // купить со скидкой
        }
    }

    private boolean checkDiscount(){
        return discount>0;
    }
}
