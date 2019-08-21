package ru.javabegin.training.fastjava2.shop_33.service;


import ru.javabegin.training.fastjava2.shop_33.enums.ConsultResult;
import ru.javabegin.training.fastjava2.shop_33.interfaces.VisitorInterface;

public class Consultant extends AbstractEmployee {


    public Consultant() {
    }


    public Consultant(String name) {
        super(name);
    }

    public ConsultResult consult(VisitorInterface visitor){
        super.setFree(false);

        // здесь должна быть логика, купит или пойдет домой

        return ConsultResult.BUY;

    }


    public void send(){

    }


}
