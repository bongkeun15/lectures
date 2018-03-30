package com.lgcns.workshop4;

public class Phone {

    String user;
    int callUse = 0; // 총 통화량
    int dataUse = 0; // 총 데이터 사용량
    
    int callBalance = 0; // 무료 통화 잔액
    int dataBalance = 0; // 무료 데이터 잔액
    
    int freeCall = 0; // 무료 통화 지급량
    int freeData = 0; // 무료 데이터 지급량
    
    int guide = 0; // 데이터 소진 안내는 한 번 만 ! 
    
    
    
    boolean register;

    public void registerCallingPlan() {
        register = true;
        
        freeData = 350;
        freeCall = 200;
        
        dataBalance = freeData;
        callBalance = freeCall;
        
        System.out.println( "[알림] " + user + "님이 요금제에 가입하셨습니다." );
        System.out.println( "무료 통화 : " + callBalance + "분, 무료 데이터 " + dataBalance + "MB \n" );
    }

    
    
    
    
    public void doCall( int call ) {
        
        if(call <0) {
            System.out.println( "[에러] 음수만큼 통화를 사용할 수 없습니다. \n" );
        } else if ( call>0 && register==true) {
            callBalance -= call;
            callUse += call;
            System.out.println( "[알림] " + user + "님이 " + call + "분 통화했습니다." );
            
                if ( callBalance > 0 ) {
                    System.out.println( "[알림] 남은 무료통화 : " + callBalance + "분 \n" );
                }
                
        } else {
            System.out.println( "[알림] " + user + "님이 " + call + "분 통화했습니다.\n" );
            callBalance -= call;
            callUse += call;
        }
    }

    
    
    
    
    
    
    public void doInternet( int data ) {
        if (data<0){
            System.out.println( "[에러] 음수만큼 데이터를 사용할 수 없습니다. \n" );
        } else if(data>0 && register==true) {
            System.out.println( "[알림] " + user + "님이 데이터를 " + data + "MB 사용하였습니다." );
            dataBalance -= data;
            dataUse += data;
            
                if(dataBalance >= 0) {
                    System.out.println( "[알림] 남은 무료 데이터 : " + dataBalance + "MB \n" );
                } else if (guide != 1){
                    System.out.println( "[알림] 모든 무료 데이터를 소진하였습니다. \n");
                    guide = 1;
                } else if (dataBalance < 0){
                    System.out.println( "[알림] 남은 무료 데이터 0MB \n" );
                }//데이터 다 썼을 때
                                
        } else {
            System.out.println( "[알림] " + user + "님이 데이터를 " + data + "MB 사용하였습니다.\n" );
            dataBalance -= data;
            dataUse += data;
        }
   }
       
    

    public int calculateTotalFee() {

        int registerCost = 0;
        int overUseCall = -( freeCall - callUse );
        int overUseData = -( freeData - dataUse );
        
        if (register == true && overUseCall<0){
            overUseCall = 0;
        }
        
        int callCost = 0;
        int dataCost = 0;

        if ( overUseData > 0 ) {
            dataCost = overUseData * 50;
        } else {
            overUseData = 0;
        }

        if ( overUseCall > 0 ) {
            callCost = overUseCall * 110;
        } else {
            overUseCall = 0;
        }
        
        if (register == true) {
            registerCost = 18000;
        }

        int totalCost = callCost + dataCost + registerCost;

        System.out.println( " ========================= " );
        System.out.println( "고객명 : " + user );
        
            if ( register == true ) {
                System.out.println( "무료 통화량 : 200분" );
                System.out.println( "무료 데이터 : 350MB" );
            }
            
        System.out.println( "통화 초과 사용량 :" + ( overUseCall ) + "분" );
        System.out.println( "데이터 초과 사용량 :" + overUseData + "MB" );
        System.out.println( "이달의 청구 요금 : " + totalCost + "원" );
        System.out.println( " ========================= " );

        callBalance = 0;
        dataBalance = 0;
        freeCall = 0;
        freeData = 0;
        callUse = 0;
        dataUse = 0;
        register = false;

        return totalCost;
    }

}
