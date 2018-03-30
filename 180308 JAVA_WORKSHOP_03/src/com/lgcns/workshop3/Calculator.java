package com.lgcns.workshop3;
import java.util.Scanner;

public class Calculator {
	public static void main(String args[])
	{
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int operand1;
		int operand2;
		int result;
		
		System.out.print("첫번째 숫자를 입력하시오 : ");
		operand1 = input.nextInt();
		
		System.out.print("두번째 숫자를 입력하시오 : ");
		operand2 = input.nextInt();
		
		System.out.println( "사칙 연산을 시작합니다 !! \n" );
		
		System.out.println( " < addition method >" );
		System.out.println( "parameter a: " + operand1 + ", b:" + operand2 );
		System.out.println( "덧셈 결과 : " + add(operand1, operand2) + "\n");
		
		System.out.println( " < subtraction method >" );
		System.out.println( "parameter a: " + operand1 + ", b:" + operand2 );
		System.out.println( "뺄셈 결과 : " +sub(operand1, operand2) + "\n" );
		
		System.out.println( " < multiplication method >" );
		System.out.println( "parameter a: " + operand1 + ", b:" + operand2 );
		System.out.println( "곱셈 결과 : " + mul(operand1, operand2) + "\n" );
		
		System.out.println( " < division method >" );
		System.out.println( "parameter a: " + operand1 + ", b:" + operand2 );
		System.out.println( "나눗셈 결과 : " + div(operand1, operand2) + "\n" );
		
						
	}
	
	public static int add(int a, int b)
	{
		return a + b;
	}
	
	public static int sub(int a, int b)
	{
	    return a - b;
	}
	
	public static int mul(int a, int b)
	{
	    return a * b;
	}
	
	public static int div(int a, int b)
	{
	    return a / b;
	}
}
