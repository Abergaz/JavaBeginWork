package ru.javabegin.training.fastjava2.shop_24_h;



import ru.javabegin.training.fastjava2.shop_24_h.client.BaseVisitor;
import ru.javabegin.training.fastjava2.shop_24_h.department.BaseDepartment;
import ru.javabegin.training.fastjava2.shop_24_h.service.Administrator;

import java.util.ArrayList;

public class SalesRoom {

    private ArrayList<BaseDepartment> departmentList;// в каждом департаменте имеются свои сотрудники

    private String name;

    private ArrayList<BaseVisitor> visitorList;

    private Administrator administrator;

}
