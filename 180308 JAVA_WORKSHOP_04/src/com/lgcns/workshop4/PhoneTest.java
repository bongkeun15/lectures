package com.lgcns.workshop4;

public class PhoneTest {

    public static void main( String[] args ) {

        Phone phone = new Phone();

        phone.user = "철수";

        phone.registerCallingPlan();
        phone.doCall( 150 );            // [알림] : 철수님이 150분 통화했습니다.
                                        // [알림] 남은 무료통화 : 50분                   200-150   
        phone.doCall( -30 );            // [에러] 음수만큼 통화를 사용할 수 없습니다.
        phone.doInternet( 100 );        // [알림] 철수님이 데이터를 100MB 사용하였습니다.
                                        // [알림] 남은 무료 데이터 : 250MB
        phone.doCall( 30 );             // [알림] 철수님이 30분 통화했습니다.            50-30
                                        // [알림] 남은 무료통화 : 20분
        phone.doInternet( 450 );        // [알림] 철수님이 데이터를 450MB 사용하였습니다.
                                        // [알림] 남은 무료 데이터 : 0MB
        phone.doInternet( -50 );        // [에러] 음수만큼 데이터를 사용할 수 없습니다.
        phone.doInternet( 30 );         // [알림] 모든 무료 데이터를 소진하였습니다.
        
        phone.calculateTotalFee();
        
        // 철수 끝
        
        phone.user = "영희";            
        phone.doCall( -300 );           //[에러] 음수만큼 통화를 사용할 수 없습니다.         
        phone.doCall( 20 );             //[알림] 영희님이 20분 통화했습니다.           
        phone.doInternet( 230 );        //[알림] 모든 무료 데이터를 소진하였습니다.        
        phone.doCall( 210 );            //[알림] 영희님이 210분 통화했습니다.          
        phone.doInternet( 150 );        //[알림] 모든 무료 데이터를 소진하였습니다.        
        phone.doInternet( -10 );        //[에러] 음수만큼 데이터를 사용할 수 없습니다.      
        
        phone.calculateTotalFee();
        
        
    }
}