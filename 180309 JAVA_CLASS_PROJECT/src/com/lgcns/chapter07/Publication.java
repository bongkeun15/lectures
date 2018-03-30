package com.lgcns.chapter07;

public class Publication {

        private String title;
        private int price;
        private int page;
        
        public Publication() {
            // 기본! 까먹지 말자 확장성을 위해서 !!!
        }

        public Publication(String title, int price) {
            this.title = title;
            this.price = price;
        }
        
        public void setTitle( String title ) {
            this.title = title;
        }
        
        public String getTitle() {
            return title;
        }
        
        
        public void setPrice( int price ) {
            if(price <= 0) { 
                System.out.println( "[에러] 가격 정보는 음수를 입력할 수 없습니다!" );
            } else {
                this.price = price;
            }
        }
        
        public int getPrice() {
            return price;
        }
        
        
        public void setPage( int page ) {
            if(page < 0) { 
                System.out.println( "[에러] 페이지 정보는 음수를 입력할 수 없습니다!" );
            } else {
                this.page = page;
            }
        }
               public int getPage() {
            return page;
        }
        
        public static void printHeader() { //반복적으로 많이 쓸 때 !!
            
            System.out.println( "===== 도서 정보 조회 =====" );
        }
        
        public void printBookInfo() {
            System.out.println( getTitle() + "(" + getPrice() + "원, " + getPage() +"page)" );
        }
        
}
