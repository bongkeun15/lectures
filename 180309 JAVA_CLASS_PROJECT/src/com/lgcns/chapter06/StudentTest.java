package com.lgcns.chapter06;

public class StudentTest {

    public static void main( String[] args ) {
        
        Student student = new Student();
    // 클래스명  변수명  생성  클래스명()
        
        student.studentName = "홍길동";
        student.studentId   = "S0001" ;
        student.korean      = 94;
        student.english     = 80;
        student.math        = 89;
        
        student.printStudentInfo();
        System.out.println( "평균 : " + student.calculateAverage() + "\n");
        
        System.out.println( "* 학번을 변경합니다 !!! \n" );
        student.changeStudentId("STU0001");
        
        student.printStudentInfo();
        System.out.println( "평균 : " + student.calculateAverage() + "\n");
        
        
        
    }

}
