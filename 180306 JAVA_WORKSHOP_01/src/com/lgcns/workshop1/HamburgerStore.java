package com.lgcns.workshop1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HamburgerStore {

	public static void main(String[] args) {
		System.out.println( " ====== 메뉴판 ====== " );
		System.out.println( " 1. 햄버거   : 3000원" );
		System.out.println( " 2. 음료수   : 1500원" );
		System.out.println( " 3. 감자튀김 : 1000원" );
		System.out.println( "" );
		
		
		System.out.println( " ====== 주 문 ======" );
		System.out.print( " 몇 개의 햄버거를 구입하시겠습니까? : " );
		int hamburger = getUserInput();
		int hCost = hamburger * 3000;
		
		System.out.print( " 몇 개의 음료수를 구입하시겠습니까? : " );
		int drinks = getUserInput();
		int dCost = drinks * 1500;
		
		System.out.print( " 몇 개의 감자튀김을 구입하시겠습니까? : " );
		int frenchFries = getUserInput();
		int fCost = frenchFries * 1000;
		
		
		System.out.println( " ====== 메뉴별 금액 ====== " );
		System.out.println( "햄버거 " + hamburger + "개 금액 : " + hCost + "원");
		System.out.println( "음료수 " + drinks + "개 금액 : " + dCost + "원");
		System.out.println( "감자튀김 " + frenchFries + "개 금액 : " + fCost + "원");
		
		int total = hCost + dCost + fCost;
		
		System.out.println( " ====== 총 금액 ======" );
		System.out.println( "총 금액은 " + total + "원 입니다." );
	
		
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
