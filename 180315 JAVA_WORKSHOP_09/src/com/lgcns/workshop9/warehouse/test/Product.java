package com.lgcns.workshop9.warehouse.test;

public class Product {

    private int price;
    private String model;
    
    public Product(){
        
    }
    
    public Product(int price, String model) {
        this.price = price;
        this. model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice( int price ) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel( String model ) {
        this.model = model;
    }
    
    public String toString() {
        return null;
    }
    
    public void menu() {
        System.out.println( "===== 창고 재고 ===== " );
        System.out.println( "1. TV 목록" );
        System.out.println( "2. TV 정보 수정" );
        System.out.println( "3. TV 추가" );
        System.out.println( "4. 컴퓨터 목록" );
        System.out.println( "5. 컴퓨터 정보 수정" );
        System.out.println( "6. 창고 재고 목록" );
        System.out.println( "0. 종료" );
        System.out.println( "===================" );
        System.out.print( "메뉴를 입력하세요 >> " );
        
    }
    
}
