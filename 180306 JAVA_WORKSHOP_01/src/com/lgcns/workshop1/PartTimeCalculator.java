package com.lgcns.workshop1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PartTimeCalculator {
    public static void main( String[] args ) {

        int weekdays;
        int weekends;
        int nights;
        int overtimes;

        System.out.print( "이번 달 평일 근무는 몇 일 했나요? : " );
        weekdays = getUserInput();
        int weekdaysPay = weekdays * 5080 * 8; //하루 8시간

        System.out.print( "이번 달 주말 근무는 몇 일 했나요? : " );
        weekends = getUserInput();
        int weekendsPay = weekends * 5450 * 8; //하루 8시간

        System.out.print( "이번 달 야간 근무는 몇 시간 했나요? : " );
        nights = getUserInput();
        int nightsPay = nights * 6100;

        System.out.print( "이번 달 초과 근무는 몇 시간 했나요? : " );
        overtimes = getUserInput();
        int overtimesPay = overtimes * 5220;

        int total = weekdaysPay + weekendsPay + nightsPay + overtimesPay;
 
        System.out.println( "이번 달 아르바이트 급여는 " + total + "원 입니다." );

    }

    /**
     * 사용자의 입력을 받는 메소드
     * 
     * @return 사용자가 입력한 숫자
     */
    public static int getUserInput() {

        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
        String inputString = null;

        try {
            inputString = br.readLine();
        } catch ( IOException e ) {
            e.printStackTrace();
        }

        return Integer.parseInt( inputString );
    }
}
