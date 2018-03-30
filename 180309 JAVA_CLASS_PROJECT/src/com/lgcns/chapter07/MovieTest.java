package com.lgcns.chapter07;

public class MovieTest {

    public static void main( String[] args ) {

        Movie movie1 = new Movie();
        
        movie1.title = "코코";
        movie1.genre = "가족 애니메이션";
        
        System.out.println( movie1 );
        
        Movie movie2 = new Movie( "트랜스포머4", "마이클 베이" );
        Movie movie3 = new Movie( "아바타", "제임스카메론", "SF" );
        
    }

}
