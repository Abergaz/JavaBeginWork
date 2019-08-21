package ru.javabegin.training.fastjava2.shop_33.service;


import ru.javabegin.training.fastjava2.shop_33.SalesRoom;
import ru.javabegin.training.fastjava2.shop_33.interfaces.DepartmentInterface;
import ru.javabegin.training.fastjava2.shop_33.interfaces.EmployeeInterface;

public class Administrator {

    private SalesRoom salesRoom;

    public Administrator(SalesRoom salesRoom) {
        this.salesRoom = salesRoom;
    }

    public Consultant getFreeConsultant(DepartmentInterface departmentInterface){
        for (EmployeeInterface employee : departmentInterface.getEmployeeList()){
            if (employee instanceof Consultant){
                if (employee.isFree()){
                    return (Consultant)employee;
                }
            }
        }

        return null;
    }


}
