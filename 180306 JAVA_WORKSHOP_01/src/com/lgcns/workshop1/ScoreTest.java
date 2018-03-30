package com.lgcns.workshop1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScoreTest {
	
	public static void main( String[] args ) {
	              //커서 맨 위에 맞추자
            System.out.print( "홍길동의 점수는 ? : " ); 
            int dong = getUserInput();
            System.out.print( "홍길순의 점수는 ? : " ); 
            int soon= getUserInput();
            System.out.print( "홍길자의 점수는 ? : " ); 
            int ja= getUserInput();
            
            int total = dong+soon+ja;
            double average = (dong+soon+ja)/3;
            String average2 = String.format( "%.2f", average ); //소수점 둘째 자리 까지 0이 되어버리네
              
            System.out.println( "" );
            System.out.println( "" );
            System.out.println( "홍길동의 점수 : " + dong);
            System.out.println( "홍길순의 점수 : " + soon);
            System.out.println( "홍길자의 점수 : " + ja);
            System.out.println( "=========================" );
            System.out.println( "3명의 총 점 : " + total);
            System.out.println( "3명의 평균 : " + average2);
            System.out.println( "=========================" );
            
            if(average>=85){
                System.out.println( "길동/길순/길자의 평균이 85점 이상입니다 !!!!" );
            } else {
                System.out.println( "길동/길순/길자의 평균이 85점 보다 낮습니다 !!" );
            }
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
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return Integer.parseInt( inputString );
	}
	
	
	
}