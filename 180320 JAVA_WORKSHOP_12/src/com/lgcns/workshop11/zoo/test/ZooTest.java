package com.lgcns.workshop11.zoo.test;

import com.lgcns.workshop11.util.WorkshopUtil;
import com.lgcns.workshop11.zoo.biz.ZooBiz;

public class ZooTest {

	public static void main(String[] args) {

		/*******************
		 * TODO: 수강생작성     *
		 *******************/
	    
	    ZooBiz zooBiz = new ZooBiz(); // 객체 생성
	    zooBiz.initializeData(); // 초기화 담기
	    
	    while(true) {
	    printMenu();
	    int selectedNum = WorkshopUtil.getUserIntegerInput();
	    
	    
	        if(selectedNum == 1) { // 동물 목록
	            zooBiz.animalList();
	        }  
	        
	        
	        else if (selectedNum == 2){
	            System.out.print( "# 직원 번호를 입력하세요 >> " );
	            String employeeId = WorkshopUtil.getUserInput();
	                if(zooBiz.searchEmployeeById( employeeId  ) == null) { // null 중복 아님
	                    System.out.print( "# 직원 이름을 입력하세요 >> " );
                        String employeeName = WorkshopUtil.getUserInput();
                        System.out.print( "# 직원 전화번호를 입력하세요 >> " );
                        String employeePhone = WorkshopUtil.getUserInput();
                        System.out.print( "# 동물 ID를 입력하세요 >> " );
                        String animalId = WorkshopUtil.getUserInput();
                        System.out.print( "# 동물 이름을 입력하세요 >> " );
                        String animalName = WorkshopUtil.getUserInput();
                        System.out.print( "# 동물 수를  입력하세요 >> " );
                        int animalCount = WorkshopUtil.getUserIntegerInput();
                            if(animalCount<0) {
                                System.out.println( "[에러] 동물의 수가 0미만이 될 수 없습니다." );
                            } else {
                                zooBiz.addAnimal( employeeId, employeeName, employeePhone, animalId, animalName, animalCount );
                                System.out.println( "@ 등록되었습니다." );
                            }
	                } else { // 중복
	                    System.out.println( "[에러] 이미 등록되어있는 직원ID 입니다." ); 
	                }
	        }
	        
	        
	        
	        else if(selectedNum == 3){
	            System.out.print( "# 직원 번호를 입력하세요 >> " );
	            String employeeId = WorkshopUtil.getUserInput();
	                if(zooBiz.searchEmployeeById(employeeId) != null){
	                    System.out.print( "# 현재 담당하고 있는 변경할 동물의 수를 입력하세요 >> " );
	                    int animalCount = WorkshopUtil.getUserIntegerInput();
	                      if(animalCount<0) {
	                          System.out.println( "[에러] 동물의 수가 0미만이 될 수 없습니다." );
	                      } else {
	                          zooBiz.changeAnimal(employeeId, animalCount);
	                          System.out.println( "@ 등록되었습니다." );
	                      }
	                } else {
	                    System.out.println( "[에러] 해당하는 직원ID를 찾을 수 없습니다." );
	                }
	        }
	        
	        
	        
	        else if (selectedNum == 4) {
	            zooBiz.employeeList();
	        }
	        
	        
	        
	        else if (selectedNum == 9){
	            System.out.println( "종료합니다." );
	            break;
	        }
	        
	        
	        
	        else {
	            System.out.println( "[에러] 메뉴를 잘못 입력하셨습니다." );
	        }
	    } // while문 종료
	} // main 종료
	
	public static void printMenu(){
		System.out.println("===<< 동물원 관리 >>===");
		System.out.println(" 1. 동물 목록");
		System.out.println(" 2. 동물 및 관리자 추가");
		System.out.println(" 3. 동물 수 변경");
		System.out.println(" 4. 관리자 목록");
		System.out.println(" 9. 종료");
		System.out.println("==================");
		System.out.print( "# 메뉴를 입력하세요 >> " );
	}
}
