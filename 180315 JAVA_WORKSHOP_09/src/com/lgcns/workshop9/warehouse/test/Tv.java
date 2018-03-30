package com.lgcns.workshop9.warehouse.test;


public class Tv extends Product {

    private int count;

    public int getCount() {
        return count;
    }

    public void setCount( int count ) {
        this.count = count;
    }

    public Tv() {

    }

    public Tv( int price, String model, int count ) {
        super( price, model );
        this.count = count;
    }
    
    public Tv[] tv;
    
    public void insertBook( Tv[] tv ) {
        this.tv = tv;
    }
    
//    public void printTvInfo() {
//        for(int i=0; i<tv.length; i++){
//            System.out.println( tv[i] );
//        }
//    }

    public String toString() {

        return "모델명 :" + getModel() + "\t가격 : " + getPrice() + "\t재고량 : " + getCount() + "개\t 재고 총가치 : "
                + ( getCount() * getPrice() ) + "원";
    }

}
