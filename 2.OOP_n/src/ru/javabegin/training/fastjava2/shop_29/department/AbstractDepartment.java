package ru.javabegin.training.fastjava2.shop_29.department;



import ru.javabegin.training.fastjava2.shop_29.interfaces.DepartmentInterface;
import ru.javabegin.training.fastjava2.shop_29.interfaces.EmployeeInterface;
import ru.javabegin.training.fastjava2.shop_29.interfaces.GoodsInterface;

import java.util.ArrayList;

public abstract class AbstractDepartment implements DepartmentInterface {

    private String name;
    private ArrayList<EmployeeInterface> employeeList;
    private ArrayList<GoodsInterface> goodsList;

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public ArrayList<EmployeeInterface> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(ArrayList<EmployeeInterface> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public ArrayList<GoodsInterface> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(ArrayList<GoodsInterface> goodsList) {
        this.goodsList = goodsList;
    }
}
