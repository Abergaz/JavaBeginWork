package ru.javabegin.training.fastjava2.Shop_26;


import ru.javabegin.training.fastjava2.Shop_26.interfaces.DepartmentInterface;
import ru.javabegin.training.fastjava2.Shop_26.interfaces.VisitorInterface;
import ru.javabegin.training.fastjava2.Shop_26.service.Administrator;

import java.util.ArrayList;

public class SalesRoom {

    private ArrayList<DepartmentInterface> departmentList;// в каждом департаменте имеются свои сотрудники

    private String name;

    private ArrayList<VisitorInterface> visitorList;

    private Administrator administrator;

}
