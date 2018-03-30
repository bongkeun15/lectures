package com.lgcns.chapter04;

public class SeperateNumberTest {

    public static void main( String[] args ) {

        int ffx = 456;
        
        System.out.println( "   숫  자    : " + ffx );
        System.out.println( "백의 자리 수 : " + ffx/100 );
        System.out.println( "십의 자리 수 : " + ffx%100/10 );
        System.out.println( "일의 자리 수 : " + ffx%10 );

    }

}
