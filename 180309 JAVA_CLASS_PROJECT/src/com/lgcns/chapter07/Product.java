package com.lgcns.chapter07;

public class Product {

    String name;
    int price;
    int discount;
    
    public Product(){
        
    }
    
    public Product(String name, int price){
        this.name = name;
        this.price = price;
    }
    
//    public Product(String name, int discount){
//        
//    }  역시 안됨, 이름이 달라도 int 차례대로 입력하면 불가능
    
    
    public Product(String name, int price, int discount){
        
        this.name = name;
        this.price = price;
        this.discount = discount;
        
    }
    
    
    
    
}
