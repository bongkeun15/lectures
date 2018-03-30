package com.lgcns.chapter07;

import com.lgcns.chapter06.Building;
import com.lgcns.chapter06.Student;

public class ProductTest {

    public static void main( String[] args ) {

        Product product1 = new Product("커피믹스", 12000, 20);
        
        System.out.println( " ====== " + product1.name + " ====== " );
        System.out.println( "정가 : " + product1.price);
        
            if (product1.discount>0){
                System.out.println( "할인율 : " + product1.discount + "%" );
            } else {
                System.out.println( "할인율 : 할인하지 않음" );
            }
        
        ///////////////////////////////////////////////////////////////
        
        Product product2 = new Product("종이컵", 3000);
        
        System.out.println( " ====== " + product2.name + " ====== " );
        System.out.println( "정가 : " + product2.price);
        
        if (product2.discount>0){
            System.out.println( "할인율 : " + product2.discount );
        } else {
            System.out.println( "할인율 : 할인하지 않음" );
        }
        
        
        
        
        
        // building import test 부분
        // import com.lgcns.chpater06.Building;
        
        Building building = new Building();

        // student import test
        // import com.lgcns.chpater06.Student;
        
        Student student = new Student();
        
    }

}
