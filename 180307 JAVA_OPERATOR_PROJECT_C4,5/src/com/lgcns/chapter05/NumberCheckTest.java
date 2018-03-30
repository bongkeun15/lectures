package com.lgcns.chapter05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberCheckTest {

    public static void main( String[] args ) {
        
        int a = 0;
        int b = 0;
        
        System.out.println( "a는 몇입니까" );
        a = getUserInput();
        System.out.println( "b는 몇입니까" );
        b = getUserInput();
        
        int c = a*b;
        
        if(10>c){
            System.out.println( a + " * " + b + "의 결과는 한 자리 수 입니다." );
        } else if (100>c && c>9) {
            System.out.println( a + " * " + b + "의 결과는 두 자리 수 입니다."  );
        } else if (100<=c){
            System.out.println( a + " * " + b + "의 결과는 세 자리 수 이상입니다."  );
        } else if (0>c) {
            System.out.println( a + " * " + b + "결과가 음수입니다."  );
        };

//        System.out.println( a );
//        System.out.println( b );
//        System.out.println( c );
        
        
        
        
        
        
        
        
        
        
        
    }
    
    public static int getUserInput() {
        
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
        String inputString = null;
        
        try {
            inputString = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return Integer.parseInt( inputString );
    }
}
