package ru.javabegin.training.fastjava2.shop_27.interfaces;

import java.util.ArrayList;

public interface DepartmentInterface {

    String getName();

    ArrayList<EmployeeInterface> getEmployeeList();

    ArrayList<GoodsInterface> getGoodsList();

}
