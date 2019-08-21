package ru.javabegin.training.fastjava2.Shop_26.interfaces;


public interface GoodsInterface {

    double getPrice();

    boolean hasGuarantee();

    String getName();

    DepartmentInterface getDepartment();

    String getCompany();

}
