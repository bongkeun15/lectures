package com.lgcns.workshop11.zoo.biz;

import java.util.ArrayList;
import java.util.HashMap;

import com.lgcns.workshop11.zoo.Animal;
import com.lgcns.workshop11.zoo.Employee;

public class ZooBiz implements IZooBiz {

    private ArrayList<Employee> emp = new ArrayList<Employee>();
    private HashMap<String, Animal> animal = new HashMap<String, Animal>();

    @Override
    public void initializeData() {
        
        emp.add( new Employee( "EMP01", "아이유", "010-7777-8888" ) );
        emp.add( new Employee( "EMP02", "조인성", "010-1717-2828" ) );
        emp.add( new Employee( "EMP03", "유재석", "010-4321-8765" ) );
        emp.add( new Employee( "EMP04", "김연아", "010-1234-9876" ) ); //Array
        

        animal.put( "EMP01", new Animal( "ANM01", "펭귄"    , 20 ) );
        animal.put( "EMP02", new Animal( "ANM05", "하마"    , 2  ) );
        animal.put( "EMP03", new Animal( "ANM03", "분홍돌고래", 1  ) );
        animal.put( "EMP04", new Animal( "ANM02", "호랑이"   , 8  ) );
        animal.put( "EMP05", new Animal( "ANM04", "긴팔원숭이", 4  ) ); //Map
    }

    @Override
    public void animalList() {
        System.out.println( "--------------------------" );
        System.out.println( "동물 ID\t동물명\t 동물 수\t 담당자 " );

        for ( String EmployeeId : animal.keySet() ) {
                    for(int j=0; j<emp.size(); j++){
                            if(emp.get(j).getEmployeeId().equals( EmployeeId )){
                                System.out.print( animal.get( EmployeeId )); // 해당 값들 다 띄우고
                                System.out.println( emp.get(j).getEmployeeName()); // 담당자 이름
                                break;
                            }
                    }
        }
        System.out.println( "--------------------------" );
    }

    @Override
    public void addAnimal( String employeeId, String employeeName, String employeePhone,
                           String animalId,   String animalName, int animalCount ) {

        emp.add( new Employee( employeeId, employeeName, employeePhone));
        animal.put( employeeId, new Animal( animalId, animalName, animalCount));
    }

    @Override
    public Employee searchEmployeeById( String employeeId ) {
        
        for(int i=0; i<emp.size(); i++){
              if(emp.get(i).getEmployeeId().equals(employeeId)){
                    return emp.get(i); // 중복
              } 
        }
        return null; // 중복 아님
    }
    
    
    @Override
    public void changeAnimal( String employeeId, int animalCount ) {
        animal.get(employeeId).setAnimalCount(animalCount);
    }

    @Override
    public void employeeList() {
        int i = 0;
        
        for(i=0; i<emp.size();i++){
            System.out.println( emp.get(i));
        }
    }

}
