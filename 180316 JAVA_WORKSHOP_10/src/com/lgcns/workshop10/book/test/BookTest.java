package com.lgcns.workshop10.book.test;

import com.lgcns.workshop10.util.WorkshopUtil;

public class BookTest {

    public static void main( String[] args ) {

        /*******************
         * TODO: 수강생작성 *
         *******************/

        IBookBiz bookBiz = new BookBiz();
        
        int selectedNum = 9999;
        int min = 0;
        int max = 99999;

        while ( true ) {
            printMenu();
            selectedNum = WorkshopUtil.getIntegerInput();
            if ( selectedNum == 1 ) {
                bookBiz.printHeader();
                bookBiz.printAllBooks();
                bookBiz.printTail();
            }

            else if ( selectedNum == 2 ) {
                System.out.print( ">> 검색할 저자명을 입력하세요 : " );
                String searching = WorkshopUtil.getStringInput();

                
                
                bookBiz.printHeader();
                bookBiz.searchNovelByAuthor( searching );
                bookBiz.printTail();
            }

            else if ( selectedNum == 3 ) {
                System.out.print( ">> 검색할 소설 가격의 최소값을 입력하세요  : " );
                min = WorkshopUtil.getIntegerInput();
                if ( min < 0 ) {
                    System.out.println( "[에러] 가격정보는 음수를 입력할 수 없습니다. 다시 입력하세요." );
                    
                } else {
                    System.out.print( ">> 검색할 소설 가격의 최대값을 입력하세요  : " );
                    max = WorkshopUtil.getIntegerInput();
                    if ( max < 0 ) {
                        System.out.println( "[에러] 가격정보는 음수를 입력할 수 없습니다. 다시 입력하세요." );
                        
                    } else if ( max < min ) {
                        System.out.println( "[에러] 최대값은 최소값보다 작을 수 없습니다. 다시 입력하세요." );
                        
                    }
                    bookBiz.searchNovelByPrice( min, max );
                }
            }
            
            else if(selectedNum == 9) {
                System.out.println( ">> 종료합니다. Bye" );
                break;
            }
            
            else {
                System.out.println( "[에러] 메뉴를 잘못 입력하였습니다. 다시 입력하세요 " );
            }
        }
    }

    public static void printMenu() {
        System.out.println( "===== << 도서 정보 프로그램 >> =====" );
        System.out.println( " 1. 전체 도서 정보 조회" );
        System.out.println( " 2. 소설 저자명 검색" );
        System.out.println( " 3. 소설 가격 검색 (최소값 ~ 최대값)" );
        System.out.println( " 9. 시스템 종료" );
        System.out.println( "====================================" );
        System.out.print( "## 메뉴 입력 : " );
    }
}