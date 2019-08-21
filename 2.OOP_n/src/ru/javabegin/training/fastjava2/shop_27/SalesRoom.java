package ru.javabegin.training.fastjava2.shop_27;


import ru.javabegin.training.fastjava2.shop_27.interfaces.DepartmentInterface;
import ru.javabegin.training.fastjava2.shop_27.interfaces.VisitorInterface;
import ru.javabegin.training.fastjava2.shop_27.service.Administrator;

import java.util.ArrayList;

public class SalesRoom {

    private ArrayList<DepartmentInterface> departmentList;// в каждом департаменте имеются свои сотрудники

    private String name;

    private ArrayList<VisitorInterface> visitorList;

    private Administrator administrator;

}
