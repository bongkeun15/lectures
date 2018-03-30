package com.lgcns.workshop12.book.biz;

public interface IBookBiz {

    public void printAllBooks();

    public void printNovelStockStatus();

    public void printMagazineStockStatus();

    public void sellMagazines( String title, String numberOfMagazine ) throws Exception;
}