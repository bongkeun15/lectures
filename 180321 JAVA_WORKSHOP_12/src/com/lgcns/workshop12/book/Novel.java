package com.lgcns.workshop12.book;

public class Novel extends Book {

    private String author;
    
    public Novel(String title, int price, String author){
        super(title, price);
        this.author = author;
    }
    
    public String toString() {
        return super.toString() + "\t[저자] " + getAuthor();
    }

    public String getAuthor() {
        return author;
    }
    
    
    
}
