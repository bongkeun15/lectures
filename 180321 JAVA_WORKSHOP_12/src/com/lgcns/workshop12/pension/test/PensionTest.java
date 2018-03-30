package com.lgcns.workshop12.pension.test;

import com.lgcns.workshop12.pension.biz.PensionBiz;
import com.lgcns.workshop12.util.WorkshopUtil;

public class PensionTest {

    public static void main( String[] args ) throws Exception {

        PensionBiz pensionBiz = new PensionBiz();

        pensionBiz.initializeRoomData();

        // System.out.println( pensionBiz.getData().toString() );

        while ( true ) {
            int selectedNum;
            printHeader();
            selectedNum = WorkshopUtil.getUserIntegerInput();
            try {
                if ( selectedNum == 1 ) {
                    pensionBiz.roomList();

                }

                else if ( selectedNum == 2 ) {
                    System.out.print( "투숙하실 방 번호를 입력하세요 >> " );
                    String roomNum = WorkshopUtil.getStringInput();
                    System.out.print( "고객님의 이름을 입력하세요 >> " );
                    String name = WorkshopUtil.getStringInput();
                    System.out.print( "고객님의 전화번호를 입력하세요 >> " );
                    String phone = WorkshopUtil.getStringInput();

                    pensionBiz.checkIn( roomNum, name, phone );

                }

                else if ( selectedNum == 3 ) {
                    try {
                        String roomId;
                        System.out.print( "투숙하신 방 번호를 입력하세요 >> " );
                        roomId = WorkshopUtil.getUserInput();
                        pensionBiz.checkOut( roomId );
                    } catch ( Exception e ) {
                        System.out.println( e.getMessage() );
                    }
                } else if ( selectedNum == 0 ) {
                    System.out.println( "Bye~ Bye~" );
                    break;
                } else {
                    System.out.println( "[에러] 메뉴를 다시 입력하세요." );
                }
            } catch ( Exception e ) {
                System.out.println( "[에러] 메뉴를 다시 입력하세요." );
            }
        }
    }

    public static void printHeader() {
        System.out.println( "======<< 춘 펜션 관리 시스템 >>======" );
        System.out.println( " 1. 전체 방 조회" );
        System.out.println( " 2. 입실" );
        System.out.println( " 3. 퇴실" );
        System.out.println( " 0. 종료" );
        System.out.println( "=============================" );
        System.out.print( "# 메뉴를 입력하세요 >> " );
    }
}
