package com.lgcns.workshop10.book.test;

public interface IBookBiz {

    
    public void printAllBooks();
    
    public void searchNovelByAuthor(String author);
    
    public void searchNovelByPrice(int minPrice, int maxPrice);
    
    public void printHeader();
    
    public void printTail();
        
}
