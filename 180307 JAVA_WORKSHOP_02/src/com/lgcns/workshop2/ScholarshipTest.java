package com.lgcns.workshop2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.omg.Messaging.SyncScopeHelper;

public class ScholarshipTest {
	
	public static void main( String[] args ) {
		
		/*******************
		 * TODO: 수강생작성     *
		 *******************/
	    double CS;
	    double JP;
	    double Mech;
	    double Opera;
	    double Bedminton;
	    
	    System.out.println( "Computer Science 성적을 입력하세요 : " );
	    CS = getUserInput();
	    System.out.println( "Java Programming 성적을 입력하세요 : " );
	    JP = getUserInput();
	    System.out.println( "공학 성적을 입력하세요 : " );
	    Mech = getUserInput();
	    System.out.println( "오페라의 이해 성적을 입력하세요 : " );
	    Opera = getUserInput();
	    System.out.println( "배드민턴 성적을 입력하세요 : " );
	    Bedminton = getUserInput();
	    
	    double average = (CS+JP+Mech+Opera+Bedminton)/5;
	    
	    
	    System.out.println( "====================" );
	    System.out.println( "평점은 " + average + "점 입니다." );
	    System.out.println( "장학금을 받을 수 있을까요? :" );
	    
	    if (average >= 3.7 && CS>=2.5 && JP>=2.5 && Mech>=2.5 && Opera>=2.5 && Bedminton>=2.5) {
	        System.out.println( "true" );
	    } else { 
	        System.out.println( "false" );
	    }
	    
	    
	    
	    
	   } 
	
	
	
	/**
	 * 사용자의 입력을 받는 메소드
	 * 
	 * @return 사용자가 입력한 숫자
	 */
	public static double getUserInput() {
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		String inputString = null;
		
		try {
			inputString = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return Double.parseDouble( inputString );
	}
}