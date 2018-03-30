package com.lgcns.workshop11.customer.biz;

import java.util.ArrayList;

import com.lgcns.workshop11.customer.Customer;

public class CustomerBiz implements ICustomerBiz{

    private ArrayList<Customer> customers = new ArrayList<Customer>(); // new ArrayList<Customer>() 잊지말자
    
    
    @Override
    public void initializeCustomer() {

        customers.add( new Customer ("Lee" , 28, "010-5678-1234"));
        customers.add( new Customer ("Park", 31, "010-4567-9876"));
        customers.add( new Customer ("Choi", 25, "010-1111-2222"));
     // customers.add( new Customer ("Hong", 27, "010-4679-8522"));
        
    }

    @Override
    public void printAllCustomer() { 
        int inx = 1;
        System.out.println( "\n------------------ 고객 정보 ---------------------" );
         for ( Customer customer : getCustomers() ) {
             System.out.print( inx++ + ". "  );
             System.out.println( customer );
        } System.out.println( "-----------------------------------------------\n" );
    }

    @Override
    public void insertCustomer( String name, int age, String phone ) {
        
        getCustomers().add( new Customer (name, age,phone ));
        
    }

    @Override
    public void changeAge( int number, int age ) {
        getCustomers().get( number-1 ).setAge( age );
    }

    @Override
    public void changePhone( int number, String phone ) {
        getCustomers().get( number-1 ).setPhone( phone );
    }

    @Override
    public void deleteCustomer( int number ) {
        
        getCustomers().remove( number-1 );
        
    }

    @Override
    public int getCustomerNumber() {
        // TODO Auto-generated method stub
        return 0;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
}
