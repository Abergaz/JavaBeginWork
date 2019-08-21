package ru.javabegin.training.fastjava2.Shop_26.goods;

import ru.javabegin.training.fastjava2.Shop_26.department.BaseDepartment;
import ru.javabegin.training.fastjava2.Shop_26.interfaces.DepartmentInterface;
import ru.javabegin.training.fastjava2.Shop_26.interfaces.GoodsInterface;

public class BaseGoods implements GoodsInterface {
    // свойства, которые будут иметь все товары
    private double price;

    private boolean hasGuarantee;

    private String name;

    private DepartmentInterface department;

    private String company;


    @Override
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean hasGuarantee() {
        return hasGuarantee;
    }

    public void setHasGuarantee(boolean hasGuarantee) {
        this.hasGuarantee = hasGuarantee;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public DepartmentInterface getDepartment() {
        return department;
    }

    public void setDepartment(DepartmentInterface department) {
        this.department = department;
    }

    @Override
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
