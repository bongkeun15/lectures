package com.lgcns.workshop10.travel.test;

public class IndividualTravel extends Travel{

    private int maxPeople;
    int sum = 0;
    
    public IndividualTravel(String travelCode, String cityName, String flight, int maxPeople){
        super(travelCode, cityName, flight, "개별자유여행"); 
        this.maxPeople =  maxPeople ;
    }
    
    public String toString() { // 배열에 담겼어도 toString에 설정이 맞아야한다.
        return getTravelCode() + "\t" + getCityName() + "\t" + getFlight() + "\t개별자유여행\t" + "N/A\t" + maxPeople + "명\t" + getReserved()+ "명\t";
    }

    public void setReserved(int reserved){
        
        if(reserved > maxPeople){
            System.out.println( "[에러] 최대 예약 가능 인원을 초과한 인원을 예약할 수 없습니다." );
        } else {
            sum += reserved;
            super.setReserved( sum);
        }
    }
 
}
