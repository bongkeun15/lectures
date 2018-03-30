package com.lgcns.chapter06;

public class Chocolate {



    private String name;
    private String type;
    private int price;

    

    
    public int calculateTotalPrice( int count ) {
        return count * price;
    }
    
    public int calculateTotalPrice( int count, int discount ) {
        return count * price * ( 100 - discount ) / 100;
    }
    
    public void changeChocolateInfo( String newName, int newPrice ) {
        name = newName;
        price = newPrice;
        printChocolateInfo();
    }
    
    public void changeChocolateInfo( String newName, int newPrice, String newType ) {
        name = newName;
        type = newType;
        price = newPrice;
        printChocolateInfo();
    }
    
    public void printChocolateInfo() {
        System.out.println( "이름 : " + name + ", 종류 : " + type + ", 가격 : " + price );
    }
    
    

    public void setName( String name ) {
        this.name = name;
    }

    public void setType( String type ) {
        this.type = type;
    }

    public void setPrice( int price ) {
        this.price = price;
    }
    
    public String getName() {
        return name;
    }
    
    public String getType() {
        return type;
    }
    
    public int getPrice() {
        return price;
    }
}
