package com.lgcns.chapter06;

public class BuildingTest {

    public static void main( String[] args ) {
        Building building = new Building();
        
        building.name       = "프라임 타워";
        building.address    = "회현동";
        building.totalFloor = 22;
        
        System.out.println( "건물명 : "     + building.name       );
        System.out.println( "주소 : "       + building.address    );
        System.out.println( "전체 층 수 : " + building.totalFloor );
        
        building.moveElevator();
        building.changeAddress( "소공로" );
        
//      public void changeAddress (String newAddress)
//      address = newAddress;

        System.out.println( "새 주소 : " + building.address);
        
    }

}
