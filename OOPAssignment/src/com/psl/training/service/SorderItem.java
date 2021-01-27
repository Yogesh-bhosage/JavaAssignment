package com.psl.training.service;

import com.psl.training.model.Customer;
import com.psl.training.model.PurchaseOrder;

public class SorderItem {
    Scustomer scustomer=new Scustomer();
    SpurchaseOrders spurchaseOrders=new SpurchaseOrders();



    public Customer placeOrder(String customerName, int... orderNo){

        Customer c=scustomer.getCustomerByName(customerName);
        PurchaseOrder[] po=spurchaseOrders.getPurchaseOrder(orderNo);
//        c.setPo(po);
        return c;
    }
}
