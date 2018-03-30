package com.lgcns.workshop10.book.test;


public class BookBiz implements IBookBiz {

     private Book[] books = {
             new Magazine("Cooking Light", 15000, "living, cooing",                  "America Cooking"),
             new Magazine("Auto Bild\t"  , 16000, "science, car"  ,                  "Germany Car"    ),
             new Novel("The Confession"  , 10500,                   "Grisham, John"                   ),
             new Novel("Les Miserables"  , 17500,                   "Hugo, Victor"                    ),
             new Novel("Breakthrough"    , 47200,                   "Ifill, Gwen"                     ),
             new Novel("The Racketeer"   , 38000,                   "Grisham, John"                   )
     }; 
     
    @Override
    public void printAllBooks() {
        for(int i=0; i<books.length; i++) {
            System.out.println( i+1 +"." + books[i] );
        }
    }

    @Override
    public void searchNovelByAuthor( String author ) {

        int num=0;;
        for(int i=2;i<books.length; i++ ){
            if(((Novel)books[i]).getAuthor().equals( author )){
                num++;
                System.out.println( num+1 +"." + books[i] );
            } 
        }
        
    }

    @Override
    public void searchNovelByPrice( int minPrice, int maxPrice ) {
        printHeader();
        for(int i=0; i<books.length; i++){
            if(books[i].getPrice()>minPrice && books[i].getPrice()<maxPrice){
                
                System.out.println( books[i] );
                
            }
        }
        printTail();
    }

    @Override
    public void printHeader() {
        System.out.println( "----------------------------------- 도서 정보 -----------------------------------" );
        
    }

    @Override
    public void printTail() {
        
        System.out.println( "------------------------------------------------------------------------------" );
        
    }
    
    
}
