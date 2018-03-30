package com.lgcns.workshop9.book.test;

public class Customer {
    
    private int totalPrice = 0;
    private String name;
    public int sold = 1;
    
    public Customer(String name){
        this.name = name;
    }
    
    public Customer() {
       
    }

    public String toString() {
        return name + "님이";
    }
 
    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice( int totalPrice ) {
        this.totalPrice = totalPrice;
    }
    
    public void buyBook(Book book, int quantity){
        
        
        
        if(quantity > book.getStockQuantity()) {
            System.out.println( "[에러] 재고가 부족합니다. 현재 재고량 : " + book.getStockQuantity() + "권");
        } else if(quantity <= 0) {
            System.out.println( "[에러] 0권 이하로 구매하실 수 없습니다." );
        } else {
            totalPrice += quantity*book.getCost();
            book.setStockQuantity(book.getStockQuantity()-quantity);
            System.out.println( name + "님이 " + book.getTitle() + "를(을) 구매하였습니다. 총 금액 :" + String.format( "%,d", totalPrice ) + "원");
        
        
        }
    }
    public void buyBook(SecondBook book){
        
        if(book.getStockQuantity()!=0){
            totalPrice += book.getCost()*(100-book.getDiscountRate())/100;  
        System.out.println( name + "님이 " + book.getTitle() + "를(을) 구매하였습니다. 총 금액 :" + String.format( "%,d", totalPrice) + "원");
        book.setStockQuantity(book.getStockQuantity()-1);
        } else {
            System.out.println( "[에러] 재고가 부족합니다. 현재 재고량 : 0권");
        }
       
    }
}
