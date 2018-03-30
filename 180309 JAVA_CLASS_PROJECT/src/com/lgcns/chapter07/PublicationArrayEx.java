package com.lgcns.chapter07;

public class PublicationArrayEx {

    public static void main( String[] args ) {
        
        
        Publication[] publications = {
                new Publication ("습관의 힘", 16000),
                new Publication ("빅 픽쳐", 12000),
                new Publication ("7년 후", 13500)
        };

        for(int i=0; i<publications.length; i++){
            System.out.print  (publications[i].getTitle() + " : ");
            System.out.println(publications[i].getPrice() + "원" );
            
        }
    }
}
