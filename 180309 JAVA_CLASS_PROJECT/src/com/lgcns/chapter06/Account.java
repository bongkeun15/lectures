package com.lgcns.chapter06;

public class Account {

        String holder;
        String account;
        int balance = 10000;
        
        
        
        public void deposit(int money) {
            
            if(money>=0){
                balance += money;
                System.out.println( "입금 : " + money + "원을 입금 했습니다."     );
                System.out.println( "입금 후 잔액은 " + balance + "원 입니다."    );
            } else {
                System.out.println( "입금 : " + money + "원을 입금할 수 없습니다" );
                System.out.println( "[에러] 올바른 금액을 입금하세요"             );
            }
        }
        
        public void withdraw(int money) {
            
            if(balance>money && money>=0) {
                balance -= money;
                System.out.println( "출금 : " + money + "원을 출금 했습니다."  );
                System.out.println( "출금 후 잔액은 " + balance + "원 입니다." );
            } else {
                System.out.println( "출금 : " + money + "원을 출금합니다"      );
                System.out.println( "[에러] 잔액이 부족합니다."                );
            }
        }
            
        public int getBalance(){
                System.out.println( "현재 잔액은 " + balance + "원 입니다. "       );
                return balance;
        }
}
