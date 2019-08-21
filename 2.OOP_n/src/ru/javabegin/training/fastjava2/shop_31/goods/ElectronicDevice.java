package ru.javabegin.training.fastjava2.shop_31.goods;


import ru.javabegin.training.fastjava2.shop_31.interfaces.ElectronicDeviceInterface;

public class ElectronicDevice extends AbstractGoods implements ElectronicDeviceInterface {


    public ElectronicDevice() {
    }

    public ElectronicDevice(String name) {
        super(name);
    }

    @Override
    public void on() {
        // общая реализация
    }

    @Override
    public void off() {
        // общая реализация
    }
}
