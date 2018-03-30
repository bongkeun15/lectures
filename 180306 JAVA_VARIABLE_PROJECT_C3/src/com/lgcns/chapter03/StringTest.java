package com.lgcns.chapter03;

public class StringTest {

    public static void main( String[] args ) {

        String kingSejong = "10000";
        int parseKingSejong = Integer.parseInt( kingSejong );
        int thisYear = 2018;
        
        System.out.println( "세종대왕 : " + kingSejong );
        System.out.println( thisYear + "년" );
        System.out.println( kingSejong + thisYear );
        System.out.println( parseKingSejong + thisYear );

    }

}
