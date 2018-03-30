package com.lgcns.workshop2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class GuessGame {
	
	public static void main( String[] args ) {

		/*******************
		 * TODO: 수강생작성     *
		 *******************/
	    
	    int answer; // 답변
	    int hiddenNumber = getHiddenNumber(); // 정답 숫자

	    
	    
	    System.out.println( "*********************************" );
	    System.out.println( "1에서 100사이의 숫자를 맞춰보세요" );
	    System.out.println( "   10 번의 기회가 있습니다." );
	    System.out.println( "*********************************" );
	    
	    for(int chance = 1; chance <= 10; chance++){
	        System.out.println( "" );
	        System.out.println( chance + "번째 기회입니다. 숫자를 입력하세요" );
	        answer = getUserInput();
	        if (answer > hiddenNumber) {
	            System.out.println( answer + "보다 작습니다." );
	        } else if ( answer < hiddenNumber) {
	            System.out.println( answer + "보다 큽니다." );
	        } else {
	            System.out.println( "축하합니다. 정답은 " + hiddenNumber + "입니다." );
	            break;
	        }
	        
	        if(chance==10){
	            System.out.println( "\n 모든 기회를 놓쳤습니다" );
	        }
	    } 
          System.out.println( "게임을 종료합니다 !! " );
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
	
	/**
	 * 1 ~ 100 까지의 숫자 중 무작위로 하나의 숫자를 추출하는 메소드
	 * 
	 * @return 1 ~ 100 중 랜덤하게 뽑힌 숫자
	 */
	public static int getHiddenNumber() {
		
		Random rand = new Random();
		
		return rand.nextInt( 100 ) + 1;
	}
}