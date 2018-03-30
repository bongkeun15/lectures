package com.lgcns.chapter05;

public class ForEx {

    public static void main( String[] args ) {

        /*
         * for (int inx = 1; inx <= 100; inx++){ System.out.println( inx ); }
         * 
         * for (int i = 1; i<=50; i++){ System.out.println( i+i-1 ); }
         */
        int sum = 0;

        for ( int a = 0; a <= 100; a++ ) {
            sum += a;
        }
        System.out.println( sum );

        for ( int i = 1; i <= 5; i++ ) { // 5줄의
            for ( int j = 1; j <= 10; j++ ) { // 10까지의 숫자가 뜬다.
                System.out.print( j + " " );
            }
            System.out.println( " " );
        }

        for ( int k = 0; k <= 7; k++ ) {
            System.out.print( "*" );
        } 

    }

}
