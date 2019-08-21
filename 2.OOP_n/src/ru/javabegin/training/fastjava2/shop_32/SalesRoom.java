package ru.javabegin.training.fastjava2.shop_32;



import ru.javabegin.training.fastjava2.shop_32.interfaces.DepartmentInterface;
import ru.javabegin.training.fastjava2.shop_32.interfaces.VisitorInterface;
import ru.javabegin.training.fastjava2.shop_32.service.Administrator;

import java.util.ArrayList;

public class SalesRoom {

    public static final String SHOP_NAME = "technodom";

    private ArrayList<DepartmentInterface> departmentList;// в каждом департаменте имеются свои сотрудники

    private ArrayList<VisitorInterface> visitorList;

    private Administrator administrator;

}
