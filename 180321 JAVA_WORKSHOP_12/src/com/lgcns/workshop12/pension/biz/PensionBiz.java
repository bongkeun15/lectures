package com.lgcns.workshop12.pension.biz;

import java.util.ArrayList;
import java.util.HashMap;

import com.lgcns.workshop12.pension.Customer;
import com.lgcns.workshop12.pension.Standard;
import com.lgcns.workshop12.pension.Sweet;
import com.lgcns.workshop12.pension.biz.IPensionBiz;

public class PensionBiz implements IPensionBiz {

    private ArrayList<HashMap<String, Object>> data = new ArrayList<HashMap<String, Object>>();

    @Override
    public void initializeRoomData() {

        HashMap<String, Object> datas1 = new HashMap<String, Object>();
        HashMap<String, Object> datas2 = new HashMap<String, Object>();
        HashMap<String, Object> datas3 = new HashMap<String, Object>();
        HashMap<String, Object> datas4 = new HashMap<String, Object>();
        HashMap<String, Object> datas5 = new HashMap<String, Object>();

        datas1.put( "101", new Standard() );
        datas2.put( "102", new Standard() );
        datas3.put( "103", new Standard() );
        datas4.put( "104", new Sweet() );
        datas5.put( "105", new Sweet() );

        data.add( datas1 );
        data.add( datas2 );
        data.add( datas3 );
        data.add( datas4 );
        data.add( datas5 );
    }

    @Override
    public void checkIn( String roomId, String custName, String custPhone ) throws Exception {
        for ( HashMap<String, Object> hash : data ) {
            for ( String stuff : hash.keySet() ) {
                if ( stuff.equals( roomId ) ) {
                    Customer cus = new Customer( custName, custPhone );
                    hash.put( Integer.toString( cus.index ), cus );
                    break;
                }
            }
        }
    }

    @Override
    public void checkOut( String roomId ) throws Exception {
        try {
            Integer.parseInt( roomId );

        } catch ( Exception e ) {
            throw new Exception( "[에러] 방 번호는 숫자로 입력하세요." );
        }
        try {
            int checkCustomer = 0;
            String keyStore = "";
            if ( findEqualKey( roomId ) ) {
                for ( int i = 0; i < data.size(); i++ ) {
                    HashMap<String, Object> tempHash = new HashMap<String, Object>();
                    tempHash = data.get( i );
                    checkCustomer = 0;
                    for ( String key : tempHash.keySet() ) {
                        if ( checkCustomer == 1 ) {
                            keyStore = key;
                            tempHash.remove( keyStore );
                            data.set( i, tempHash );
                            throw new Exception( "@ 퇴실되었습니다." );
                        }
                        if ( key.toString().equals( roomId ) ) {
                            checkCustomer++;
                        }
                    }
                }
                if ( checkCustomer == 0 ) {
                    throw new Exception( "[에러] 이미 퇴실되었습니다." );
                }
            } else {
                throw new Exception( "[에러] 정확한 방 번호를 입력하세요" );
            }
        } catch ( Exception e ) {
            throw new Exception( e.getMessage() );
        }
    }

    @Override
    public void roomList() {
        for ( HashMap<String, Object> hash : data ) {
            int cnt = 0;
            for ( String thing : hash.keySet() ) {
                if ( cnt == 0 ) {
                    System.out.print( thing + "호 : " + hash.get( thing ) );
                    cnt++;
                } else {
                    System.out.print( hash.get( thing ) );
                }
            }
            System.out.println();
        }
    }

    public boolean findEqualKey( String roomId ) { // 중현 도움 받음
        for ( int i = 0; i < data.size(); i++ ) {
            HashMap<String, Object> tempHash = new HashMap<String, Object>();
            tempHash = data.get( i );
            for ( String key : tempHash.keySet() ) {
                if ( key.toString().equals( roomId ) ) {
                    return true;
                }
            }
        }
        return false;
    }

}
