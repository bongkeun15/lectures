package com.lgcns.workshop2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class BaseBallGame {

	public static void main(String[] args) {

		/*******************
		 * TODO: 수강생작성     *
		 *******************/
        
	    System.out.println( "야구 게임 시작 !!" );
	    System.out.print( "서로 다른 3자리 수를 입력해주세요 :" );
	    int number = getUserInput();
	    int A = number%1000/100 ;
        int B = number%100/10 ;
        int C = number%10;
	    
        for(int i = 0; i<10; i++) { 
            
              int strike = 0;
              int ball = 0;
              int out = 0;
            
	          System.out.println( "예상 숫자를 입력해주세요" );
	          int answer = getUserInput();
	          
	          int a = answer%1000/100 ;
              int b = answer%100/10 ;
              int c = answer%10;
                                
                  if(a==A){strike++;}
                  if(b==B){strike++;}
                  if(c==C){strike++;} //스트라이크
              
                  if(a==B){ball++;}
                  if(a==C){ball++;}
                  if(b==A){ball++;}
                  if(b==C){ball++;}
                  if(c==A){ball++;}
                  if(c==B){ball++;} //볼
              
                  if(a!=A && a!=B && a!=C){out++;}
                  if(b!=A && b!=B && b!=C){out++;}
                  if(c!=A && c!=B && c!=C){out++;} //아웃
                  
                  System.out.print  ( "스트라이크:" + strike + " ");
                  System.out.print  ( "볼:" + ball + " ");
                  System.out.println( "아웃:" + out + " ");
                  
              if(strike>=3){
                  System.out.println( "축하합니다. 정답입니다." );
                  break;
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
