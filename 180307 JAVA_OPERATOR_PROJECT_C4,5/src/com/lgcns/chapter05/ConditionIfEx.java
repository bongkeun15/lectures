package com.lgcns.chapter05;

public class ConditionIfEx {
    public static void main( String[] args ) {
        
        int age = 12;
        
        if (age >= 19) {
            System.out.println( "성인입니다." );
            System.out.println( "입장하세요." );
        } else if (age >= 13) {
            System.out.println( "19세 이상만 입장 가능합니다." );
            System.out.println( "죄송합니다." );
        } else {
            System.out.println( "어린이는 집에 가세요 !!" );
            
        } 
    }
}

