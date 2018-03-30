package com.lgcns.chapter06;

public class Student {

    String studentName;
    String studentId; // 숫자 같긴 하지만, 자릿수도 그렇고
                      // 0으로 시작되거나 하는 경우 값이 날아가버리므로
    int korean;
    int english;
    int math;
    
    public int calculateAverage(){ // 평균 점수 
        int average = (korean+english+math) / 3;
        return average;
    }
    
    public void printStudentInfo() { // 학생 정보 조회, 데이터 형태가 없음
                                     // void 이기에 return 이 없다 !!
        
        System.out.println( "학생 이름 : " + studentName );
        System.out.println( "학생 번호 : " + studentId   );
        System.out.println( "국어 점수 : " + korean      );
        System.out.println( "영어 점수 : " + english     );
        System.out.println( "수학 점수 : " + math        );
    }

    public void changeStudentId( String newId ){ // 학번 변경 (매개 변수)
        
        studentId = newId;
        
    }
    
    
    
}
