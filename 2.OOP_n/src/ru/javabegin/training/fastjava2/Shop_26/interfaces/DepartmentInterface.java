package ru.javabegin.training.fastjava2.Shop_26.interfaces;

import java.util.ArrayList;

public interface DepartmentInterface {

    String getName();

    ArrayList<EmployeeInterface> getEmployeeList();

    ArrayList<GoodsInterface> getGoodsList();

}
