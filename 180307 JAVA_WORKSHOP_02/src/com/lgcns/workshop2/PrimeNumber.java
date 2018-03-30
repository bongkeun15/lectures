package com.lgcns.workshop2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNumber {
	public static void main( String[] args ) {

		/*******************
		 * TODO: 수강생작성     *
		 *******************/
	    
	    System.out.println( "====== < 소수 찾기 > =======" );
	    
	    
	    for(int chance=1; chance<100; chance++ ) {
	        
	        System.out.print( "숫자를 입력하세요. (종료:0) : " );
	        int answer = getUserInput();
	    
	          if (answer == 0) {
	              System.out.println( "소수 찾기를 종료 합니다." );
	              System.out.println( "bye bye !!! " );
	              break;
	              } 
	          if (answer == 2 || answer == 3 || answer == 5 || answer == 7) {
	              System.out.println( answer + "은(는) 소수입니다" );
	              System.out.println( "" );
	              
	          } else if (answer%2==0 || answer%3==0 || answer%5==0 || answer%7==0){
	              System.out.println( answer + "은(는) 소수가 아닙니다." );
	              System.out.println( "" );
	          
	          } else { // (answer%2==0 || answer%3==0 || answer%5==0 || answer%7==0)
	              System.out.println( answer + "은(는) 소수입니다" );
	              System.out.println( "" );
	          }
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
