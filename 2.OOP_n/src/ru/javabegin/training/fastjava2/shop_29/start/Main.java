package ru.javabegin.training.fastjava2.shop_29.start;


import ru.javabegin.training.fastjava2.shop_29.client.CommonVisitor;
import ru.javabegin.training.fastjava2.shop_29.goods.Computer;
import ru.javabegin.training.fastjava2.shop_29.goods.Subwoofer;
import ru.javabegin.training.fastjava2.shop_29.goods.Televisor;

public class Main {

    public static void main(String[] args) {
        Televisor televisor = new Televisor("Samsung");

        Subwoofer subwoofer = new Subwoofer("Microlab");

        Computer computer = new Computer("MacBook");
        Computer computer2 = new Computer("Asus");

        CommonVisitor commonVisitor = new CommonVisitor();

        commonVisitor.buy(televisor);
        commonVisitor.buy(computer);
        commonVisitor.buy(computer2);
        commonVisitor.buy(computer2);
        commonVisitor.buy(subwoofer);

    }
}
