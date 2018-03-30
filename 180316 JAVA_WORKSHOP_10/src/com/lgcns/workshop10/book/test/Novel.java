package com.lgcns.workshop10.book.test;

public class Novel extends Book{

    private String author;
    
    public Novel() {
        
    }
    
    public Novel(String title, int price, String author){
        super(title, price);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
    
    public String toString() {
        return super.toString() + "\t[저자] " + getAuthor();    
    }
    
}
