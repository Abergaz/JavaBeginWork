package ru.javabegin.training.fastjava2.shop_31;


import ru.javabegin.training.fastjava2.shop_31.interfaces.DepartmentInterface;
import ru.javabegin.training.fastjava2.shop_31.interfaces.VisitorInterface;
import ru.javabegin.training.fastjava2.shop_31.service.Administrator;

import java.util.ArrayList;

public class SalesRoom {

    public static final String SHOP_NAME = "technodom";

    private ArrayList<DepartmentInterface> departmentList;// в каждом департаменте имеются свои сотрудники

    private ArrayList<VisitorInterface> visitorList;

    private Administrator administrator;



}
