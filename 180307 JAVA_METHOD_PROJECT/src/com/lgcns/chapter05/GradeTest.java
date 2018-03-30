package com.lgcns.chapter05;

public class GradeTest {

    // 메소드를 작성해보자
    public static int calculateTotal( int kor, int eng, int math ) {

        int total = kor + eng + math;
        return total;

    }

    public static double caculateAverage( int total ) {
        // int average = (korean+english+math)/3; // 이름이 다르기에, 만들어진걸 갖고와보자

        int average = total / 3;
        return average;

    }

    public static void main( String[] args ) {
        
        int korean = 90;
        int english = 80;
        int math = 70;
        
        int total = 0;
        double average = 0;
        
        total = calculateTotal( korean, english, math );
        System.out.println( "합계 : " + total );
        
        average = caculateAverage( total );
        System.out.println( "평균 : " + average );
    }

}
