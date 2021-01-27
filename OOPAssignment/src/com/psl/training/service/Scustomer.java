package com.psl.training.service;

import com.psl.training.model.Customer;

public class Scustomer {
    // u can add this method in CustomerService / util class
    Customer[] customers=new Customer[3];
    public Scustomer(){
        initCustomers();
    }
    public Customer[] initCustomers(){


        customers[0]=new Customer(100, "Jamie", "NY");
        customers[1]=new Customer(101, "Bill", "LV");
        customers[2]=new Customer(102, "Joe", "NY");

        return customers;

    }

    public Customer getCustomerByName(String custName){
        System.out.println(custName);
        for (Customer customer : customers) {
            if(custName.equals(customer.getCustomerName())) {
                return customer;
            }
        }
        return null;
    }
}
