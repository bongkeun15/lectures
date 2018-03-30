package com.lgcns.workshop10.travel.test;

public class PackageTravel extends Travel{

    private int minPeople;
    
    public PackageTravel(String travelCode, String cityName, String flight, int minPeople){
        super(travelCode, cityName, flight, "패키지여행"); 
        this.minPeople = minPeople;
       }
    
    public String toString() { // 배열에 담겼어도 toString에 설정이 맞아야한다.
        return getTravelCode() + "\t" + getCityName() + "\t" + getFlight() + "\t패키지여행\t\t" +  minPeople + "명\tN/A\t" + getReserved() + "명\t";
    }
}
