package com.lgcns.workshop11.customer.test;

import com.lgcns.workshop11.customer.biz.CustomerBiz;
import com.lgcns.workshop11.util.WorkshopUtil;

public class CustomerTest {
    
    public static void main( String[] args ) {

    	/*******************
		 * TODO: 수강생작성     *
		 *******************/
        CustomerBiz customerBiz = new CustomerBiz();
        
        
        customerBiz.initializeCustomer();

        while(true) {
            printMenu();  
            int selectedNum = 0;
            selectedNum = WorkshopUtil.getUserIntegerInput();
        
            
            if(selectedNum == 1){ // 1. 전체 고객 정보 조회1
                
                customerBiz.printAllCustomer();
            } // 1. 전체 고객 정보 조회 끝
            
            
            
            else if(selectedNum == 2) { // 2. 고객 정보 추가
                System.out.println( " -----------------------------------------------" );
                System.out.println( "새로운 고객 정보를 추가합니다.\n새로운 고객의 정보를 입력하세요" );
                System.out.println( " -----------------------------------------------" );
                System.out.print( "> 이름 : " );
                String name = WorkshopUtil.getUserInput();
                System.out.print( "> 나이 : " );
                int age = WorkshopUtil.getUserIntegerInput();
                    if(age<0) {
                        System.out.println( "[에러] 나이는 음수로 입력하실 수 없습니다." );
                    } else {
                        System.out.print( "> 전화번호 : " );
                        String phone = WorkshopUtil.getUserInput();
                        customerBiz.insertCustomer( name, age, phone );
                        System.out.println( "@ 고객 정보를 추가하였습니다." );
                    }
               
            }  // 2. 고객 정보 추가 끝
            
            
            
            else if (selectedNum == 3){ // 3.고객 나이 수정
                System.out.println( " -----------------------------------------------" );
                System.out.println( "고객의 나이를 수정합니다." );
                System.out.println( " -----------------------------------------------" );
                System.out.print( "> 정보를 수정할 고객의 번호 : " );
                int number = WorkshopUtil.getUserIntegerInput();
                    if(number > customerBiz.getCustomers().size()){
                        System.out.println( "[에러] 해당하는 번호의 고객을 찾을 수 없습니다." );
                    } else {
                        System.out.print( "> 수정할 나이 정보 : " );
                        int age = WorkshopUtil.getUserIntegerInput();
                            if(age<0){
                                System.out.println( "[에러] 나이는 음수로 입력하실 수 없습니다." );
                            } else {
                                customerBiz.changeAge( number, age );
                                
                                System.out.println( "@ 고객 정보를 수정하였습니다." );
                            }
                    }
            } // 3. 고객 나이 수정 끝
            
            
            
            else if (selectedNum == 4) { // 4. 고객 전화 번호 수정
                System.out.println( " -----------------------------------------------" );
                System.out.println( "고객의 전화번호를 수정합니다." );
                System.out.println( " -----------------------------------------------" );
                System.out.print( "> 정보를 수정할 고객의 번호 : " );
                int number = WorkshopUtil.getUserIntegerInput();
                if(number > customerBiz.getCustomers().size() || number<0){
                    System.out.println( "[에러] 해당하는 번호의 고객을 찾을 수 없습니다." );
                } else { 
                    System.out.print( "> 수정할 전화번호 : " );
                    String phone = WorkshopUtil.getUserInput();
                    customerBiz.changePhone( number, phone );
                    System.out.println( "@ 고객 정보를 수정하였습니다." );
                }
            } // 4. 고객 전화 번호 수정 끝
            
            
            
            else if(selectedNum == 5) { // 5.고객 정보 삭제
                System.out.println( " -----------------------------------------------" );
                System.out.println( "고객의 정보를 삭제합니다." );
                System.out.println( " -----------------------------------------------" );
                System.out.print( "> 삭제할 고객의 번호 : " );
                int number = WorkshopUtil.getUserIntegerInput();
                if(number > customerBiz.getCustomers().size()){
                    System.out.println( "[에러] 해당하는 번호의 고객을 찾을 수 없습니다." );
                } else { 
                    customerBiz.deleteCustomer( number );
                    System.out.println( "@ 고객의 정보를 삭제하였습니다." );
                }
            }  // 5.고객 정보 삭제 끝
            
        
            
            else if(selectedNum == 9) { // 9. 시스템 종료
                System.out.println( "종료합니다. Bye~ Bye~" );
                break;
            }  // 9. 시스템 종료 끝
        
            
            
            else { // 메뉴 예외 번호
               System.out.println( "[에러] 정상적인 메뉴 번호를 입력해주시기 바랍니다." );
            } // 메뉴 예외 번호 끝
        }
    }
    public static void printMenu() {
        System.out.println( "=== << 고객 관리 프로그램 >> ===" );
        System.out.println( " 1. 전체 고객 정보 조회" );
        System.out.println( " 2. 고객 정보 추가" );
        System.out.println( " 3. 고객 나이 수정" );
        System.out.println( " 4. 고객 전화번호 수정" );
        System.out.println( " 5. 고객 정보 삭제" );
        System.out.println( " 9. 시스템 종료" );
        System.out.println( "================================" );
        System.out.print( "## 메뉴 입력 : " );
    }
}