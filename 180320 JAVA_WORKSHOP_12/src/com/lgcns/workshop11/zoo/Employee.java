package com.lgcns.workshop11.zoo;

public class Employee {

    private String employeeId;
    private String employeeName;
    private String employeePhone;
    
    public Employee() {
        
    }
    
    
    public Employee(String employeeId, String employeeName, String employeePhone){
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeePhone = employeePhone; 
    }

    
    public String toString() {
        return getEmployeeId()  + "\t " + getEmployeeName()  + "\t " + getEmployeePhone();
    }

    public String getEmployeeId() {
        return employeeId;
    }


    public String getEmployeeName() {
        return employeeName;
    }


    public String getEmployeePhone() {
        return employeePhone;
    }
    
    
    
}
