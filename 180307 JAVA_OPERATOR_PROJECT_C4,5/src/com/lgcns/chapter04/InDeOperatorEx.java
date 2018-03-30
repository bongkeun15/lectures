package com.lgcns.chapter04;

public class InDeOperatorEx {

    public static void main( String[] args ) {
        
        int number1 = 10;
        int number2 = 3;
        
        System.out.println( ++number1 ); // 11
        System.out.println( number2++ ); // 3 나중에 증가 됨 4로 내려줌, 
        
        int result = --number1 + number2--; // 10 + 4 = 14
        
        System.out.println( result );
        System.out.println( number2 );
        
     
    }

}
