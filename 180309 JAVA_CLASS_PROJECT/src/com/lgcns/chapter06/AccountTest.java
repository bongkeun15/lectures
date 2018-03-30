package com.lgcns.chapter06;

public class AccountTest {

    public static void main( String[] args ) {

        Account account = new Account();
        
        
        
        account.holder = "신봉근";
        account.account = "12345689";
        account.balance = 10000; //클래스 변수에 접근해서 넣어줌
        
        System.out.println( "계좌 : " + account.account + "(예금주 :" + account.holder + ")");
        account.getBalance();
        account.deposit ( 20000 );
        account.deposit ( -20000 );
        account.withdraw (-20000);
        account.withdraw (45000);
        
        account.getBalance(); // 이거 자체만으로도 기능 실현

        
    }

    
}
