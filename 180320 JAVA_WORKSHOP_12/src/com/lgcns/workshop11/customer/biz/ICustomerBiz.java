package com.lgcns.workshop11.customer.biz;

public interface ICustomerBiz {
    
    public void initializeCustomer(); //초기화?
    public void printAllCustomer(); 
    public void insertCustomer(String name, int age, String phone);
    public void changeAge(int number, int age);
    public void changePhone(int number, String phone);
    public void deleteCustomer(int number);
    public int getCustomerNumber();
}
