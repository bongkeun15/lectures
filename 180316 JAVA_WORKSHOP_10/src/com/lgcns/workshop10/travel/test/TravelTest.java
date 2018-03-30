package com.lgcns.workshop10.travel.test;

import com.lgcns.workshop10.util.WorkshopUtil;

public class TravelTest {

    public static void main( String[] args ) {

        /*******************
         * TODO: 수강생작성 *
         *******************/

        Travel[] travel = { new IndividualTravel( "TRV001", "뮌헨" , "독일항공"  , 10 ),
                            new IndividualTravel( "TRV002", "프라하", "에어프랑스" , 20 ),
                            new PackageTravel   ( "TRV003", "LA"  , "델타항공"  , 8 ),
                            new IndividualTravel( "TRV004", "오사카", "대한항공"  , 15 ),
                            new PackageTravel   ( "TRV005", "상해" , "남방항공"  , 12 ), };

        int selectedNum;

        while ( true ) {
            printMenu();
            selectedNum = WorkshopUtil.getIntegerInput();

            // 전체 여행 상품 조회
            if ( selectedNum == 1 ) {
                printHeader();
                for ( int i = 0; i < travel.length; i++ ) {
                    System.out.println( travel[i] );
                }
                printSeperator();
            }

            // 개별 자유여행 상품 조회
            else if ( selectedNum == 2 ) {
                printHeader();

                for ( int i = 0; i < travel.length; i++ ) {
                    if ( travel[i].getTravelType() == "개별자유여행" ) {
                        System.out.println( travel[i] );
                    }
                }
                printSeperator();
            }

            // 패키지 여행 상품 조회
            else if ( selectedNum == 3 ) {
                printHeader();

                for ( int i = 0; i < travel.length; i++ ) {
                    if ( travel[i].getTravelType() == "패키지여행" ) {
                        System.out.println( travel[i] );
                    }
                }
                printSeperator();
            }

            // 여행 상품 예약
            else if ( selectedNum == 4 ) {
                String selectedCode;
                int inputNum = 0;
                int i;

                System.out.print( ">> 예약할 상품의 여행 코드를 입력하세요 : " );
                selectedCode = WorkshopUtil.getStringInput();

                for ( i = 0; i < travel.length; i++ ) {
                    if ( selectedCode.toString().equals( travel[i].getTravelCode().toString() ) ) {
                        System.out.print( ">> 예약할 인원 수를 입력하세요 : " );
                        inputNum = WorkshopUtil.getIntegerInput();
                        break;
                    }
                }

                if ( i == travel.length ) {
                    System.out.println( "[에러] 여행 코드를 잘못 입력하셨습니다." );
                } else {
                    if ( inputNum <= 0 ) {
                        System.out.println( "[에러] 1명 이상 예약해주시기 바랍니다." );
                    }
                    else{
                        travel[i].setReserved(inputNum);
                    }
                }
            }
            
            // 9 종료
            else if ( selectedNum == 9 ) {
                 System.out.println( ">> 종료합니다 !!" );
            }
            
            
            // 예외
            else {
                 System.out.println( ">> 다시 입력하세요 !! " );
                 }
        }

    }

     

    public static void printMenu() {
        System.out.println( "========== < 메뉴 > ==========" );
        System.out.println( " 1. 전체 여행 상품 조회" );
        System.out.println( " 2. 개별 자유여행 상품 조회" );
        System.out.println( " 3. 패키지여행 상품 조회" );
        System.out.println( " 4. 여행 상품 예약" );
        System.out.println( " 9. 종료" );
        System.out.println( "==============================" );
        System.out.print( "## 메뉴 : " );
    }

    public static void printHeader() {
        printSeperator();
        System.out.println( "여행코드 도시명   항공편\t  여행유형\t 출발가능최소인원  최대예약가능인원   예약인원" );
        printSeperator();
    }

    public static void printSeperator() {
        System.out.println(
                "------------------------------------------------------------------------------------------------" );
    }
}