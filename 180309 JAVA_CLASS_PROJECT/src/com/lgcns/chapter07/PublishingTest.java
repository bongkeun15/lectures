package com.lgcns.chapter07;

public class PublishingTest {

    public static void main( String[] args ) {

        Publication publication = new Publication();
        
        System.out.println( "==== 출판물 정보를 세팅 합니다 ====" );
        
        publication.setTitle( "하악하악" ); //set ~~~ 를 통해서 담음
        publication.setPrice(  -20000 );
        publication.setPrice(  20000 );
        publication.setPage ( -300 );
        publication.setPage ( 300 );
        
        Publication.printHeader(); //static
        publication.printBookInfo(); // public void printBookInfo()
        
        publication.setTitle( "파이 이야기" ); //set ~~~ 를 통해서 담음
        publication.setPrice( 8400 );
        publication.setPage ( 280 );
        publication.printBookInfo();
        
    }

}
