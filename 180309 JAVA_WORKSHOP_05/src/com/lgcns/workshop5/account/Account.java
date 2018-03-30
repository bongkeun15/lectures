package com.lgcns.workshop5.account;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Account {

    private String customerId;
    private String customerName;
    private String accountNumber;
    private int balance;

    public Account() {

    }

    // 5번 문항, 계좌에서 입력한 금액 출금
    public void withdraw( int money ) {
        if ( isExistAccount() == true ) { // 계좌 존재 여부 확인, 있으면 in
            if ( money <= 0 ) { // 음수/0은 거른다
                System.out.println( "[에러] 0보다 큰 숫자를 입력해주시기 바랍니다." );
            } else if ( balance >= money ) { // 정상 진행
                balance -= money;
                System.out.println( "[출금] " + money + "원을 출금합니다." );
                printAccountInfo();
            } else if ( balance < money ) { // 잔액 부족
                System.out.println( "[출금] " + money + "원을 출금합니다." );
                System.out.println( "[에러] 잔액이 부족합니다." );
                printAccountInfo();
            }
        }
    }

    // 6번 문항, 계좌에다가 입력한 금액 입금
    public void deposit( int money ) {
        if ( isExistAccount() == true ) { // 계좌 존재 여부 확인, 있으면 in
            if ( isPositiveNumber( money ) == true ) { // 음수/0은 거른다
                balance += money;
                System.out.println( "[입금] " + money + "원을 입금합니다." );
                printAccountInfo();
            }
        }
    }

    // 7번 문항, 계좌의 존재 여부를 검증한다, 이 페이지에서도 사용
    private boolean isExistAccount() {

        if ( accountNumber != null ) {
            return true;
        }
        System.out.println( "[공지] 계좌가 없습니다. 계좌를 생성해주시기 바랍니다." );
        return false;
    }

    // 8번 문항, 입력값의 양수 여부 검증
    private boolean isPositiveNumber( int money ) {
        if ( money > 0 ) {
            return true;
        } else {
            System.out.println( "[에러] 0보다 큰 숫자를 입력해주시기 바랍니다." );
        }
        return false;
    }

    // 9번 문항, 3번이랑 얼추 중복 됨.
    private boolean nameValidationCheck( String name ) {
        if ( name.length() > 3 ) {
            this.customerName = name;
            return true;
        } else {
            System.out.println( "[에러] 이름을 세 글자 이상으로 입력하세요" );
            return false;
        }
    }

    // 10번 문항 출금 가능 여부
    private boolean isWithdrawable( int money ) {
        if ( isExistAccount() == true ) {
            if ( balance >= money ) {
                balance -= money;
                System.out.println( "[출금] " + money + "원을 출금합니다." );
                return true;
            } else if ( balance < money ) { // 잔액 부족
                System.out.println( "[출금] " + money + "원을 출금합니다." );
                System.out.println( "[에러] 잔액이 부족합니다." );
                printAccountInfo();
            }
        }
        System.out.println();

        return false;
    }

    // 11번 문항, 계좌 정보 출력
    public void printAccountInfo() {
        System.out.println( "고객 번호 : " + customerId + " " );
        System.out.println( "고객명 : " + customerName + " " );
        System.out.println( "계좌 번호 : " + accountNumber + " " );
        System.out.println( "잔액 : " + balance + " " );
    }

    // 메뉴 간추림
    public void menu() {
        System.out.println( " ======= 통장 관리 =======" );
        System.out.println( "1. 계좌 신규 개설" );
        System.out.println( "2. 계좌 정보 수정" );
        System.out.println( "3. 입금" );
        System.out.println( "4. 출금" );
        System.out.println( "9. 종료" );
        System.out.println( " ======================" );
        System.out.println( "#메뉴를 입력하세요 >> " );
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId( String customerId ) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    // 3번 문항, 고객의 이름 길이가 2자 이상이면 통과
    public void setCustomerName( String customerName ) {
        if ( customerName.length() <= 2 ) { // 계좌 존재 여부 확인, 있으면 in
            System.out.println( "[에러] 이름을 세 글자 이상으로 입력하세요" );
        } else {
            this.customerName = customerName;
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber( String accountNumber ) {
        this.accountNumber = accountNumber;
        System.out.println( "[공지] 계좌를 개설합니다." );
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance( int balance ) {
        this.balance = balance;
    }

}
