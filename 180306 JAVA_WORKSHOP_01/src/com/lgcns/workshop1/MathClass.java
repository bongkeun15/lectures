package com.lgcns.workshop1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MathClass {

	
	public static void main(String [] args) {
		
		/*수학 계산식 만들기*/
		
		/* 1. 직육면체의 겉넓이 구하기
		 * 
		 * 입력 : 가로, 세로, 높이
		 * 결과 : 겉넓이
		 * 
		 * 가로*세로*2
		 * 세로*높이*2
		 * 높이*가로*2
		 * 
		 * 
		 * */
		
			/*******************
			 * TODO: 수강생작성     *
			 *******************/
		
		/* 2. 피타고라스의 정리 
		 * 
		 * 입력 : 가장 길지 않은 두 변의 길이
		 * 결과 : 가장 긴 나머지 한 변을 출력
		 * a*
		 * */
		
			/*******************
			 * TODO: 수강생작성     *
			 *******************/
		
		/* 3. 근의공식 
		 * 
		 *  입력 : 2차방정식의 계수 a,b,c
		 *  결과 : ax^2 + bx + c = 0 의 이차방정식의 근 x
		 *  
		 *  */
		
			/*******************
			 * TODO: 수강생작성     *
			 *******************/
		
		/* 4. 철수가 영희 따라잡기  
		 * 
		 * 입력 : 영희의 속도 a, 철수의 속도 b, 영희가 먼저 출발한 시간 t 
		 * 결과 : 영희가 시속 a km/h 로 t분 먼저 출발하고 철수가 b km/h로 따라갈때 영희와 철수가 만나는 시간 x
		 * 
		 * */
		
			/*******************
			 * TODO: 수강생작성     *
			 *******************/

		/* 5. 두 숫자와 두 숫자사이의 합 구하기 
		 * 
		 * 두 숫자 a와 b를 입력받고  그 사이값들의 합을 구하는 계산식
		 * 
		 * */
		
			/*******************
			 * TODO: 수강생작성     *
			 *******************/
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
