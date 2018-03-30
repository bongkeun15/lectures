package com.lgcns.workshop12.book;

public class Magazine extends Book{

    private String category;
    private String description;
    
    public Magazine(String title, int price, String category){
        super(title, price);
        this.category = category;
    }
    
    public Magazine(String title, int price, String category, String description){
        super(title, price);
        this.category = category;
        this.description = description;
    }
    
    public String toString() {
        if(description != null){
            return super.toString() + "\t[분류] " + getCategory() + "\t[비고] " + getDescription();
        } else {
            return super.toString() + "\t[분류] " + getCategory();
        }
                
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }
    
    
}
