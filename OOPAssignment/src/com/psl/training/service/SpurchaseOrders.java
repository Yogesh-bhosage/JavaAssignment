package com.psl.training.service;

import com.psl.training.CustomException.InsufficentDataException;
import com.psl.training.model.OrderItem;
import com.psl.training.model.PurchaseOrder;
import com.psl.training.model.StockItem;
import com.psl.training.util.DBConnectionUitl;

import java.sql.Connection;
import java.sql.Date;
import java.time.LocalDate;

public class SpurchaseOrders {
    SstockItem sstockItem=new SstockItem();
    PurchaseOrder[] po=new PurchaseOrder[3];
    StockItem[] s=sstockItem.initStock();
    public void intialize(){
        createPurchaseOrders();
    }
    public SpurchaseOrders(){
        createPurchaseOrders();
    }
    public PurchaseOrder[] getPurchaseOrders(){
        return po;
    }
    public PurchaseOrder[] createPurchaseOrders(){

        // 1.	PO 1 - 2 gallons Milk, 2 lbs Chicken and 12 eggs.

        //Creating Order Item for 1st Purchase Order
        OrderItem orderItems[]=new OrderItem[3];
        StockItem stockItem=sstockItem.getStockItemByName(10001);
        long total=(long) (2*stockItem.getPrice());
        int qt=20;
        try {
            if (sstockItem.getStockqnt(10001) < qt) {
                    throw new InsufficentDataException();
            }
//            orderItems[0]=new OrderItem(stockItem, qt,total);

        }
        catch (InsufficentDataException e){
            System.out.println(e);
        }

        stockItem=sstockItem.getStockItemByName(10002);
        total=(long) (2*stockItem.getPrice());

//        orderItems[1]=new OrderItem(stockItem, 2,total );
//
//        stockItem=sstockItem.getStockItemByName(10003);
//        total=(long) (12*stockItem.getPrice());
//        orderItems[2]=new OrderItem(stockItem,12,total );

//        po[0] =new PurchaseOrder(1, Date.valueOf(LocalDate.now()), null);

        // Creating Order Item for 2nd Purchase Order

        //2.	PO 2 - 5 apples and 10 oranges
        orderItems=new OrderItem[2];
        stockItem=sstockItem.getStockItemByName(10004);
        total=(long) (5*stockItem.getPrice());
//        orderItems[0]=new OrderItem(stockItem, 5,total );
//
//        stockItem=sstockItem.getStockItemByName(10005);
//        total=(long) (10*stockItem.getPrice());
//        orderItems[1]=new OrderItem(stockItem, 10,total );

//        po[1] =new PurchaseOrder(2, Date.valueOf(LocalDate.now()), null);


        // Creating Order Item for 3rd Purchase Order

        //3.	PO 3 - 5 Lbs chicken and 10 apples
        orderItems=new OrderItem[2];
        stockItem=sstockItem.getStockItemByName(10002);
        total=(long) (5*stockItem.getPrice());
//        orderItems[0]=new OrderItem(stockItem, 5,total );
//
//        stockItem=sstockItem.getStockItemByName(10004);
//        total=(long) (10*stockItem.getPrice());
//        orderItems[1]=new OrderItem(stockItem, 10,total );

//        po[2] =new PurchaseOrder(3,Date.valueOf(LocalDate.now()), null);
        return po;

    }

    public PurchaseOrder[] getPurchaseOrder(int... orderNo){
        PurchaseOrder orders[]=new PurchaseOrder[orderNo.length];
        int index=0;
        for(int ono:orderNo)
        {
            for (PurchaseOrder po : this.po) {

                if(po.getPoNumber()==ono)
                    orders[index++]=po;
            }

        }
        return orders;
    }

    public void setShiDate(Date date,int poNumber){
        for(PurchaseOrder p:po){
            if(p.getPoNumber()==poNumber){
                p.setShipDate(date);
                p.isShipped=true;
            }
        }

    }

    public boolean isSipped(int poNumber){
        for (PurchaseOrder p:po){
            if(p.getPoNumber()==poNumber){
                return p.isShipped;

            }
        }
        return false;
    }

    public void findOrderPlacedByCust(int custId){
        for (PurchaseOrder p:po) {


        }

    }



}
