package ru.javabegin.training.fastjava2.shop_32.goods;


import ru.javabegin.training.fastjava2.shop_32.department.AbstractDepartment;
import ru.javabegin.training.fastjava2.shop_32.interfaces.GoodsInterface;

public abstract class AbstractGoods implements GoodsInterface {

    public static final int DEFAULT_GUARANTEE = 2;

    public AbstractGoods() {
    }

    public AbstractGoods(String name) {
        this.name = name;
    }

    // свойства, которые будут иметь все товары
    private double price;

    private boolean hasGuarantee;

    private String name;

    private AbstractDepartment department;

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
    public AbstractDepartment getDepartment() {
        return department;
    }

    public void setDepartment(AbstractDepartment department) {
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
