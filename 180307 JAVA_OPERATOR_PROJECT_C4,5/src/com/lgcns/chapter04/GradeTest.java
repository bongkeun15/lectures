package com.lgcns.chapter04;

public class GradeTest {

    public static void main( String[] args ) {
        
           int a = 75;
        
           System.out.println( "A학점 : " + ((100>=a) && (a>=90)));
           System.out.println( "B학점 : " + ((89 >=a) && (a>=80)));
           System.out.println( "C학점 : " + ((79 >=a) && (a>=70)));
           System.out.println( "D학점 : " + ((69 >=a) && (a>=60)));

           int sum = 0;
        for (a=1; a<=100; a++) {
            
            sum += a; 
            
        }
        System.out.println( sum );
        
    }

}
