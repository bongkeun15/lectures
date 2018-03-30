package com.lgcns.chapter05;

public class BreakSumTest {

    public static void main( String[] args ) {
        int sum = 0;
        
        for(int inx=1; inx<=10; inx++){
            sum += inx;
            
            if (sum > 30) { 
                break; // if 만 끝내는게 아니라, for문 통째로 break 시켜버림
            }
        } System.out.println( sum );
    }

}
