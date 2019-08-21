package ru.javabegin.training.fastjava2.shop_29;


import ru.javabegin.training.fastjava2.shop_29.interfaces.DepartmentInterface;
import ru.javabegin.training.fastjava2.shop_29.interfaces.VisitorInterface;
import ru.javabegin.training.fastjava2.shop_29.service.Administrator;

import java.io.File;
import java.util.ArrayList;

public class SalesRoom {

    private ArrayList<DepartmentInterface> departmentList;// в каждом департаменте имеются свои сотрудники

    private String name;

    private ArrayList<VisitorInterface> visitorList;

    private Administrator administrator;

    File file;

}
