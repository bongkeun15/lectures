package com.lgcns.workshop2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome {

	public static void main(String[] args) {
		
		/*******************
		 * TODO: 수강생작성     *
		 *******************/
	    
	    System.out.println( "여덟자리 이하의 숫자를 입력하세요 ! " );
	    int number = getUserInput();
	   

        
        int i = number%1000000000/100000000 ;
        int h = number%100000000/10000000 ;
        int g = number%10000000/1000000 ;
        int f = number%1000000/100000 ;
        int e = number%100000/10000 ;
        int d = number%10000/1000 ;
        int c = number%1000/100 ;
        int b = number%100/10 ;
        int a =  number%10;
        
        
//      System.out.println( "억의 자리 수   : " + number%1000000000/100000000 );
//	    System.out.println( "천만의 자리 수 : " + number%100000000/10000000 );
//	    System.out.println( "백만의 자리 수 : " + number%10000000/1000000 );
//	    System.out.println( "십만의 자리 수 : " + number%1000000/100000 );
//	    System.out.println( "만의 자리 수   : " + number%100000/10000 );
//	    System.out.println( "천의 자리 수   : " + number%10000/1000 );
//      System.out.println( "백의 자리 수   : " + number%1000/100 );
//      System.out.println( "십의 자리 수   : " + number%100/10 );
//      System.out.println( "일의 자리 수   : " + number%10 );
	    
	    
	    if (number>10 && number<100 && a==b) {
	       System.out.println( "입력하신 " + number + "는 회문수 입니다." ); // 두 자리 수
	       
	    } else if (number>100 && number<1000 && a==c) {
	        System.out.println( "입력하신 " + number + "는 회문수 입니다." ); // 세 자리 수
	        
	    } else if (number>1000 && number<10000 && a==d && b==c) {
            System.out.println( "입력하신 " + number + "는 회문수 입니다." ); // 네 자리 수
            
	    } else if (number>10000 && number<100000 && a==e && b==d) {
          System.out.println( "입력하신 " + number + "는 회문수 입니다." ); // 다섯 자리 수 
          
	    } else if (number>100000 && number<1000000 && a==f && b==e && c==d) {
	        System.out.println( "입력하신 " + number + "는 회문수 입니다." ); // 여섯 자리 수 
	        
	    } else if (number>1000000 && number<10000000 && a==g && b==f && c==e) {
	        System.out.println( "입력하신 " + number + "는 회문수 입니다." ); // 일곱 자리 수 
	        
	    } else if (number>10000000 && number<100000000 && a==h && b==g && c==f && d==e) {
	        System.out.println( "입력하신 " + number + "는 회문수 입니다." ); //여덟 자리 수
	        
	    } else {
	        System.out.println( "입력하신 " + number + "는 회문수가 아닙니다." );
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
