package com.lgcns.workshop12.book.test;

import com.lgcns.workshop12.book.biz.BookBiz;
import com.lgcns.workshop12.util.WorkshopUtil;

public class BookTest {

    public static void main( String[] args ) throws Exception {

        /*******************
         * TODO: 수강생작성 *
         *******************/

        BookBiz bookBiz = new BookBiz();

        while ( true ) {
            try { 
            printMenu();
            int selectedNum = WorkshopUtil.getUserIntegerInput();

           
                if ( selectedNum == 1 ) {
                    bookBiz.printAllBooks();
                }

                else if ( selectedNum == 2 ) {
                    bookBiz.printNovelStockStatus();
                }

                else if ( selectedNum == 3 ) {
                    bookBiz.printMagazineStockStatus();
                }

                else if ( selectedNum == 4 ) {
                    System.out.print( ">> 판매된 잡지의 제목을 입력하세요 : " );
                    String inputTitle = WorkshopUtil.getStringInput();
                    System.out.print( ">> 판매된 수량을 입력하세요 : " );
                    String sold = WorkshopUtil.getStringInput();
                    bookBiz.sellMagazines( inputTitle, sold );
                }

                else if ( selectedNum == 9 ) {
                    System.out.println( ">> 종료합니다. " );
                    break;
                }

                else {
                    System.out.println( ">>  메뉴 번호를 잘못 입력하였습니다." );
                }
                
            } catch ( Exception e ) {
                System.out.println( "[에러] 메뉴 번호는 숫자로 입력해야 합니다." );
            }
        }
    }

    public static void printMenu() {
        System.out.println( "===== << 도서 재고 프로그램 >> =====" );
        System.out.println( " 1. 전체 도서 정보 조회" );
        System.out.println( " 2. 소설 재고 수량 및 총 가격 조회" );
        System.out.println( " 3. 잡지 재고 수량 및 총 가격 조회" );
        System.out.println( " 4. 잡지 판매" );
        System.out.println( " 9. 프로그램 종료" );
        System.out.println( "====================================" );
        System.out.print( "## 메뉴 : " );
    }
}