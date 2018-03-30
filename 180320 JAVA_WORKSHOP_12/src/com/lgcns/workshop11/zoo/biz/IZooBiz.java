package com.lgcns.workshop11.zoo.biz;

import com.lgcns.workshop11.zoo.Employee;

public interface IZooBiz {

    public void initializeData();
    public void animalList();
    public void addAnimal(String employeeId, String employeeName, String employeePhone,
                          String animalId,   String animalName,   int animalCount);
    
    public Employee searchEmployeeById(String employeeId);
    public void changeAnimal(String employeeId, int animalCount);
    public void employeeList();
}
