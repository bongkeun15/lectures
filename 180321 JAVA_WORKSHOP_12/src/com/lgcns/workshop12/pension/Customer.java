package com.lgcns.workshop12.pension;

public class Customer {

    private String name;
    private String phone;
    
    public static int index = 0;
    
    public Customer() {
        index = 200;
    }
    
    public Customer(String name, String phone){
        this.name = name;
        this.phone = phone;
        if(index ==0 ){
            index = 201;
        }else{
            index = index + 1;
        }
        
    }
    
    public String toString() {
        return " 현재 투숙객 - [이름] " + getName() + " [전화번호] " + getPhone();
    }

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone( String phone ) {
        this.phone = phone;
    }
    
    
    
}

