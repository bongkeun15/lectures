package com.lgcns.chapter06;

public class ChocolateTest {

    public static void main( String[] args ) {

        Chocolate choco = new Chocolate();
        choco.setName("아마도라");
        choco.setType("다크");
        choco.setPrice(2200);
        
        choco.printChocolateInfo();
        String chocoName = choco.getName();
        int totalPrice = choco.calculateTotalPrice( 20 );
        System.out.println( chocoName + " 초콜렛 20개 : " + totalPrice );
        

        choco.changeChocolateInfo( "카페 키리쉬", 2500, "다크");
        int totalPrice1 = choco.calculateTotalPrice(15);
        System.out.println( choco.getName() + " 초콜렛 15개(10% 할인) : " + (totalPrice1*0.9) );
        
        /////////////////////////////////////////////////////////////////
        
        choco.changeChocolateInfo( "트리플 블랑", 2300, "화이트" );
        
        
        
    }

}
