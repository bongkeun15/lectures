package com.lgcns.chapter05;

public class GradeIfTest {

    public static void main( String[] args ) {

        int gildongScore = 2;

        if ( gildongScore >= 90 ) {
            System.out.println( "길동이는 A 학점입니다." );
        } else if ( gildongScore >= 80 ) {
            System.out.println( "길동이는 B 학점입니다." );
        } else if ( gildongScore >= 70 ) {
            System.out.println( "길동이는 C 학점입니다." );
        } else if ( gildongScore >= 60 ) {
            System.out.println( "길동이는 D 학점입니다." );
        } else {
            System.out.println( "길동이는 F 학점입니다." );
        }

    }

}
