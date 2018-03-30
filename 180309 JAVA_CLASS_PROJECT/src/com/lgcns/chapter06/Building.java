package com.lgcns.chapter06;

public class Building {

         String name;       // 건물명
         String address;    // 주소
         int totalFloor;    // 전체 층 수
        
         
         public void moveElevator() {
             System.out.println( "엘리베이터를 운영합니다." );
         }
         
         public void changeAddress (String newAddress) { // 매개 변수가 있다
             address = newAddress;  // 그 매개 변수에 새로운 주소로 바꾸는 로직
         }
}
