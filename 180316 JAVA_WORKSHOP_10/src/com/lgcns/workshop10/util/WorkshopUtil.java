package com.lgcns.workshop10.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WorkshopUtil {
    
    /**
     * 사용자로부터 정수를 입력 받는 메소드
     * 
     * @return 사용자가 입력한 숫자(정수)
     */
    public static int getIntegerInput() {
        
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
        String inputString = null;
        
        try {
            inputString = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return Integer.parseInt( inputString );
    }
    
    /**
     * 사용자로부터 문자열을 입력 받는 메소드
     * 
     * @return 사용자가 입력한 문자열
     */
    public static String getStringInput() {
        
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
        String inputString = null;
        
        try {
            inputString = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return inputString;
    }
}