package com.lgcns.workshop1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ParkingCalculator {

	public static void main(String[] args) {
	    
	System.out.println( "======= 주차 요금 계산기 =======" );
	System.out.print( "LG CNS 임직원이면 0을, 외부 방문 고객이면 1을 입력해 주세요 : " );
	int empOrNot = getUserInput();
	System.out.print( "일반 요금이면 0을, 야간 요금이면 1을 입력해주세요 : " );
	int dayOrNight = getUserInput();
	System.out.println( "몇 시간 몇 분을 주차 하셨습니까(10분 단위로 입력해주세요)" );
	System.out.print( " 시간 : " );
	int hour = getUserInput();
	System.out.print( " 분(10분 단위 입력) : " );
	int minutes = getUserInput()/10;

	
	//////////////////////////////////////////////////
	int Fee;
	
	if (empOrNot == 0) {
	    Fee = ((hour*6)+minutes)*300; //임직원이라면 시간당 1,800원
	} else {
	    Fee = ((hour*6)+minutes)*500; //외부인은 시간당 3,000원
	};
	
	if (dayOrNight == 1) {
	    Fee = Fee / 2 ;
	}; // 야간 요금은 50%
	
	//////////////////////////////////////////////////
	System.out.println( "==========================================" );
	System.out.println( "총 요금은 " + Fee + "원 입니다." );
	// 요금 까지는 안정적으로 마무리
	
	System.out.println( "요금을 계산해주시기 바랍니다." );
	System.out.println( "낼 금액(100원 단위 입력) : " );
	int pay = getUserInput();
	
	if (pay-Fee>0){
	    
	    int change = pay-Fee; //거스름돈 변수
	    System.out.println( change + "원의 잔돈을 받아가세요 ");
	
	    int tenTh  = change%50000/10000;
	    int fiveTh = change%10000/5000;
	    int oneTh  = change%5000/1000;
	    int fiveH  = change%1000/500;
	    int oneH   = change%500/100;
	    int fifth  = change%100/50;
	
	    System.out.println( "5만원 권   : 0 장"); //화폐 단위 상 5만원권 거스름돈 불가능하니 생략
	    System.out.println( "1만원 권   : " + tenTh +  " 장");
	    System.out.println( "5천원 권   : " + fiveTh + " 장");
	    System.out.println( "1천원 권   : " + oneTh +  " 장");
	    System.out.println( "5백원 주화 : " + fiveH +  " 개");
	    System.out.println( "1백원 주화 : " + oneH +   " 개");
	    System.out.println( "5십원 주화 : " + fifth +  "개가 맞는지 확인하세요");
	    System.out.println( "==========================================");
	    System.out.println( "감사합니다. 다음에도 이용해 주시기 바랍니다.");
	    } else {
	        System.out.println( "입력 금액이 주차 비용보다 적습니다." );
	        System.out.println( "처음부터 다시 진행하세요" );
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
