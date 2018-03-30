package com.lgcns.workshop11.customer;

public class Customer {

    private String name;
    private int age;
    private String phone;
    
    public Customer(String name, int age, String phone){
        this.name = name;
        this.age = age;
        this.phone = phone;
    }
    
    
    public String toString() {
        return "[이름] " + getName() + "\t[나이] " + getAge() + "\t[전화번호] " + getPhone();
    }
    
    public String getName() {
        return name;
    }
    public void setName( String name ) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge( int age ) {
        this.age = age;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone( String phone ) {
        this.phone = phone;
    }
    
    
    
    
}
