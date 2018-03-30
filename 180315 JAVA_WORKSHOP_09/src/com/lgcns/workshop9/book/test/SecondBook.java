package com.lgcns.workshop9.book.test;

public class SecondBook extends Book {

    private String seller;
    private int discountRate;
    private SecondBook[] sbook;

    public SecondBook( String title, String author, int cost, String seller, int discountRate ) {
        super(title, author, cost, 1);
        this.seller = seller;
        this.discountRate = discountRate;
    }

    public SecondBook() {
        
    }

    public int getDiscountRate() {
        return discountRate;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller( String seller ) {
        this.seller = seller;
    }
    
    @Override
    public String toString() {
        return "제목 : " + getTitle() + " 저자 : " + getAuthor() +
               " 가격 : " + getCost() + " 재고 : " + getStockQuantity() + "권  할인율 : " + getDiscountRate() + "%" + 
               " 판매자 : " + getSeller();
    }

    public void sBook( SecondBook[] sbook ) {
        this.sbook = sbook;
    }
    
    public void printAllList() {
        for ( int i = 0; i < sbook.length; i++ ) {
            System.out.println( sbook[i] );
        }
    }
}
