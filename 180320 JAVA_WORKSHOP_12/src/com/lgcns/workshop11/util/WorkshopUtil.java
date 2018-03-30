package com.lgcns.workshop11.util;

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
}