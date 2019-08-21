package ru.javabegin.training.fastjava2.shop_31.interfaces;

public interface GoodsInterface {

    double getPrice();

    boolean hasGuarantee();

    String getName();

    DepartmentInterface getDepartment();

    String getCompany();

}
