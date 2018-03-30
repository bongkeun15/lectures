package com.lgcns.workshop10.book.test;

public class Magazine extends Book{
    
    private String category;
    private String description;
    
    
    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }


    public Magazine (String title, int price, String category, String description) {
        super(title, price);
        this.category = category;
        this.description = description;
    }
    
    public String toString() {
        return super.toString() + "\t[분류] " + getCategory() + "\t[비고]" + getDescription();
    }
    
}
