package com.lgcns.workshop12.pension;

public class RoomType {

    private int price;
    private int roomSize;
    
    public RoomType (int price, int roomSize){
        this.price = price;
        this.roomSize = roomSize;
    }
    
    public String toString() {
        return getRoomSize() + "평/" + getPrice() + "원)" ;
    }
    
    
    public int getPrice() {
        return price;
    }

    public void setPrice( int price ) {
        this.price = price;
    }

    public int getRoomSize() {
        return roomSize;
    }

    public void setRoomSize( int roomSize ) {
        this.roomSize = roomSize;
    }


}
