package com.lgcns.workshop10.travel.test;


public class Travel {

    private String travelCode;
    private String cityName;
    private String flight;
    private String travelType;
    private int reserved;

    public Travel() {
    }
   
    public Travel( String travelCode, String cityName, String flight, String travelType ) {
        this.travelCode = travelCode;
        this.cityName = cityName;
        this.flight = flight;
        this.travelType = travelType;
    }

    public Travel[] travel;
    

    public String getTravelCode() {
        return travelCode;
    }

    public void setTravelCode( String travelCode ) {
        this.travelCode = travelCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName( String cityName ) {
        this.cityName = cityName;
    }

    public String getFlight() {
        return flight;
    }

    public void setFlight( String flight ) {
        this.flight = flight;
    }

    public String getTravelType() {
        return travelType;
    }

    public void setTravelType( String travelType ) {
        this.travelType = travelType;
    }

    public int getReserved() {
        return reserved;
    }

    public void setReserved( int reserved ) {
        this.reserved = reserved;
    }

    public Travel[] getTravel() {
        return travel;
    }

    public void setTravel( Travel[] travel ) {
        this.travel = travel;
    }

    public String toString() {
        return null;
    }

}
