package com.lgcns.workshop12.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.NumberFormat;
import java.util.Locale;

public class WorkshopUtil {

    public static String getUserInput() {

        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
        String inputString = null;

        try {
            inputString = br.readLine();
        } catch ( IOException e ) {
            e.printStackTrace();
        }

        return inputString;
    }

    public static String moneyFormat( int price ) {
        NumberFormat nf = NumberFormat.getCurrencyInstance( Locale.KOREA );
        return nf.format( price );
    }

    /**
     * 사용자로부터 정수를 입력 받는 메소드
     * 
     * @return 사용자가 입력한 숫자(정수)
     */
    public static int getUserIntegerInput() {

        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
        String inputString = null;

        try {
            inputString = br.readLine();
        } catch ( IOException e ) {
            e.printStackTrace();
        }

        return Integer.parseInt( inputString );
    }

    /**
     * 사용자로부터 코드(문자열)를 입력 받는 메소드
     * 
     * @return 사용자가 입력한 코드(문자열)
     */
    public static String getStringInput() {

        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
        String inputString = null;

        try {
            inputString = br.readLine();
        } catch ( IOException e ) {
            e.printStackTrace();
        }

        return inputString;
    }
}
