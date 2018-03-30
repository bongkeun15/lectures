package com.lgcns.workshop12.book;

import com.lgcns.workshop12.util.WorkshopUtil;

public class Book {
    private String title;
    private int price;

    public Book(String title, int price){
        this.title = title;
        this.price = price;
    }

    public String toString() {
        return "[제목] " + getTitle() + "\t[가격] " + WorkshopUtil.moneyFormat( getPrice());
    }
    
    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }
    
    
}
