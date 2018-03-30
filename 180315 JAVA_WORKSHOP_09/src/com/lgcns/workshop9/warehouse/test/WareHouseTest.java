package com.lgcns.workshop9.warehouse.test;

import com.lgcns.workshop9.util.WorkshopUtil;

public class WareHouseTest {

    public static void main( String[] args ) {

        Product product = new Product();

        Computer[] computer = { new Computer( 1250000, "울트라 Slim", 12, true ),
                                new Computer( 1800000, "LG 일체형 PC", 3, true ),
                                new Computer( 600000, "LG PC Single", 7, false )
                              };

        Tv[] tv = { new Tv( 1300000, "Smart Tv S42", 12 ),
                    new Tv( 3280000, "Ultra HD s55", 5 ) };

        int selectedNum = 890105;

        
        
        
        while ( true ) {
            product.menu();
            selectedNum = WorkshopUtil.getUserIntegerInput();
            if ( selectedNum == 1 ) {
                System.out.println( "============= TV 목록 ============" );
                for ( int i = 0; i < tv.length; i++ ) {
                    System.out.println( i+1 + "." + tv[i] );
                }
                
                
            } else if ( selectedNum == 2 ) {
                int reStockNum = 0;
                int reStockInput;
                
                System.out.print( "수정하실 번호를 입력하세요 >> " );
                reStockNum = WorkshopUtil.getUserIntegerInput();
                    if(reStockNum<0 || reStockNum>tv.length+1){
                        System.out.println( "[에러] 정상적인 숫자를 입력해주시기 바랍니다." );
                    } else {
                        System.out.println( tv[reStockNum-1]);
                        System.out.print( tv[reStockNum].getModel() + "의 현재 재고량을 입력하세요 >>" );
                        reStockInput = WorkshopUtil.getUserIntegerInput();
                        if(reStockInput < 0 ) {
                            System.out.println( "[에러] 재고량은 음수가 될 수 없습니다." );
                        } else {
                            tv[reStockNum-1].setCount( reStockInput );
                            System.out.println( "정상적으로 수정 되었습니다." );
                            System.out.println( tv[reStockNum-1]);
                        }
                    }
                    
            } else if (selectedNum == 3){
                Tv[] tvs = new Tv[tv.length+1];
                System.arraycopy( tv, 0, tvs, 0, tv.length );
                
                int newTvPrice = 0;
                int newTvStock = 0;
             
                System.out.print( "추가하실 TV 모델명을 입력하세요 >>" );
                String newTvModel =  WorkshopUtil.getStringInput();
                System.out.print( "추가하실 TV 가격을 입력하세요 >> " );
                newTvPrice =  WorkshopUtil.getUserIntegerInput();
                    if(newTvPrice<0) {
                        System.out.println( "[에러] 정상적인 숫자를 입력해주시기 바랍니다." );
                    } else {
                        System.out.print( "추가하실 TV 재고량을 입력하세요 >> " );
                        newTvStock =  WorkshopUtil.getUserIntegerInput();
                            if(newTvStock<0) {
                                System.out.println( "[에러] 재고량은 음수가 될 수 없습니다." );
                            }  else {
                                tvs[tvs.length-1] = new Tv( newTvPrice, newTvModel, newTvStock); 
                                tv = tvs; // 배열을 배열에 담기는 쉽다
                                System.out.println( "정상적으로 등록되었습니다." );
                                System.out.println( tv[tv.length-1] ); // 마지막에 추가한 내용 하나 추가
                            }
                    }
             
                
                
                
                
                
            } else if (selectedNum == 4){
                System.out.println( "============= 컴퓨터 목록 ============" );
                for ( int i = 0; i < computer.length; i++ ) {
                    System.out.println( i+1 + "." + computer[i] );
                }
                
                
            } else if (selectedNum == 5){
                int reStockNum = 0;
                int reStockInput;
                
                System.out.print( "수정하실 번호를 입력하세요 >> " );
                reStockNum = WorkshopUtil.getUserIntegerInput();
                    if(reStockNum <= 0) {
                        System.out.println( "[에러] 정상적인 번호를 입력해주시기 바랍니다." );
                    }
                System.out.println( computer[reStockNum-1]);
                System.out.print( computer[reStockNum-1].getModel() + "의 현재 재고량을 입력하세요 >>" );
                reStockInput = WorkshopUtil.getUserIntegerInput();
                    if(reStockInput < 0 ) {
                        System.out.println( "[에러] 0보다 큰 숫자를 입력하세요" );
                    }
                computer[reStockNum-1].setCount( reStockInput );
                System.out.println( "정상적으로 수정 되었습니다." );
                System.out.println( computer[reStockNum-1]);
            

                
            } else if (selectedNum == 6){
                    System.out.println( "============= 창고 재고 목록 ============" );
                    int c = 1;
                    int i;
                    
                    for (i = 0; i < tv.length; i++ ) {
                        System.out.println( c + "." + tv[i] );
                        c++;
                    } 
                    for (int j=0; j<computer.length; j++){
                        System.out.println( c + "." + computer[j] );
                        c++;
                    }
                    
                    
                    
            } else if (selectedNum == 0){
                System.out.println( "Bye~ Bye~" );
                break;
                
              
                
            } else  {
                System.out.println( "[에러] 정상적인 숫자를 입력해주시기 바랍니다." );
            }
        }

    }
}


