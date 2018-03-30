package com.lgcns.workshop9.book.test;

public class Book {

    private String title;
    private String author;
    private int cost;
    private int stockQuantity;
    private Book[] book;
    
    public Book(){
        
    }
    
    public Book(String title, String author, int cost, int stockQuantity) {
        this.title=title;
        this.author=author;
        this.cost=cost;
        this.stockQuantity=stockQuantity;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public void setStockQuantity( int stockQuantity ) {
        this.stockQuantity = stockQuantity;
    }

    public String getTitle() {
        return title;
    }

    public int getCost() {
        return cost;
    }
    
    public String toString() {
        

        return "제목 : " + getTitle() + " 저자 : " + getAuthor() + " 가격 : "
                        + String.format( "%,d", getCost() ) +" 재고 : " + getStockQuantity() + "권";
    }

    // 우선 담아보자
    public void book( Book[] book ) {
        this.book = book;
    }

    public void printAllList() {
        
        for ( int i = 0; i < book.length; i++ ) {
            System.out.println( book[i] );
        }
    }
}
