package com.psl.training.test;

import java.time.LocalDate;

import com.psl.training.dao.PurchaseOrderDao;
import com.psl.training.model.Customer;
import com.psl.training.model.OrderItem;
import com.psl.training.model.PurchaseOrder;
import com.psl.training.model.StockItem;
import com.psl.training.service.Scustomer;
import com.psl.training.service.SorderItem;
import com.psl.training.service.SpurchaseOrders;
import com.psl.training.service.SstockItem;

public class Tester {
	StockItem stockItems[]=new StockItem[5];
	PurchaseOrder[] po=new PurchaseOrder[3];
	Customer customers[]=new Customer[3];

	Scustomer scustomer=new Scustomer();
	SpurchaseOrders spurchaseOrders=new SpurchaseOrders();
	SstockItem sstockItem=new SstockItem();


	public PurchaseOrder[] getPurchaseOrder(){
		return po;
	}
	
public Tester() {
	stockItems=sstockItem.initStock(); // initialize stock
	po=spurchaseOrders.getPurchaseOrders();
	customers=scustomer.initCustomers();
}	
	
public static void main(String[] args) {

	/*SorderItem sorderItem=new SorderItem();
	Tester test=new Tester();
	test.spurchaseOrders.intialize();
//	for (PurchaseOrder purchaseOrder : test.getPurchaseOrder(1,2)) {
//		System.out.println(purchaseOrder);
//	}
	System.out.println(" placing Order for Jamie");
	Customer customer1=sorderItem.placeOrder("Jamie", 1,2);
	System.out.println(" Orders of Jamie");
//	for (PurchaseOrder po : customer1.getPo()) {
//		System.out.println(po);
//	}
	
	System.out.println(" placing Order for Bill");
	Customer customer2=test.placeOrder("Bill", 3);
	System.out.println(" Orders of Bill");
//	for (PurchaseOrder po : customer2.getPo()) {
//		System.out.println(po);
//	}

	
	// considering a fixed requirement that we have only 3 orders 
	
	// Po1 - with Jamie
	// po2 - with Jamie
	// po3- with Bill

	// Get all the orders to be shipped and print labels
	//  purchaser Order Array


	
	System.out.println("----- Printing labels for Orders to be shipped ");
	// considering all the orders to be shipped by default
	long totalPrice=0;
	for (PurchaseOrder po : test.po) {
		totalPrice=0;
		String label="--------------------------------------";
		label+="\n Order No :"+po.getPoNumber();
		label+="\n Ordered Date : "+po.getOrderDate();
		//po.setShipDate(po.getOrderDate().plusDays(1));
		label+="\n shipped on :"+po.getShipDate();
		label+="\n Items to be shipped ";
//		for (OrderItem orderedItem : po.getOrderedItems()) {
//			label+="\n Item : "+orderedItem.getStockItem().getItemDesc()+", Qty :"+orderedItem.getOrderedQuntity()+
//					",  price :"+orderedItem.getTotal();
//			totalPrice+=orderedItem.getTotal();
//		}
		label+="\n Total Bill of Order :"+totalPrice;
		System.out.println(label);
		
	}
System.out.println("---------------Shippping Orders---------");
	//Shipping 1st order of jamie
//	test.spurchaseOrders.setShiDate(LocalDate.of(2021,2,1),test.po[0].getPoNumber());
//	//Shipping 1st order of Bills
//	test.spurchaseOrders.setShiDate(LocalDate.of(2021,2,3),test.po[1].getPoNumber());
//	//Shipping 2nd order of jamie
//	test.spurchaseOrders.setShiDate(LocalDate.of(2021,2,5),test.po[2].getPoNumber());

	System.out.println("+++++++++Status of Shiiping+++++++++++++");
	System.out.println("Jamie 1st order"+test.spurchaseOrders.isSipped(test.po[0].getPoNumber()));

	System.out.println("Get Customer info by name");
	test.spurchaseOrders.findOrderPlacedByCust(100);*/
	PurchaseOrderDao.printShipperOrderLastMonth();

	
	
}

public Customer placeOrder(String customerName,int... orderNo){

		Customer c=scustomer.getCustomerByName(customerName);
		PurchaseOrder[] po=spurchaseOrders.getPurchaseOrder(orderNo);
		//c.setPo(po);
		return c;
	}









// u can add this method in CustomerService / util class
//public void initCustomers(){
//
//
//		customers[0]=new Customer(100, "Jamie", "NY", null);
//		customers[1]=new Customer(101, "Bill", "LV", null);
//		customers[2]=new Customer(102, "Joe", "NY", null);
//
//	//return customers;
//
//}

//public void createPurchaseOrders(){
//
//	// 1.	PO 1 - 2 gallons Milk, 2 lbs Chicken and 12 eggs.
//
//	//Creating Order Item for 1st Purchase Order
//	OrderItem orderItems[]=new OrderItem[3];
//	StockItem stockItem=getStockItemByName(10001);
//	long total=(long) (2*stockItem.getPrice());
//	orderItems[0]=new OrderItem(stockItem, 2,total );
//
//	 stockItem=getStockItemByName(10002);
//	 total=(long) (2*stockItem.getPrice());
//	orderItems[1]=new OrderItem(stockItem, 2,total );
//
//	 stockItem=getStockItemByName(10003);
//	total=(long) (12*stockItem.getPrice());
//	orderItems[2]=new OrderItem(stockItem,12,total );
//
//	po[0] =new PurchaseOrder(1, LocalDate.now(), null, orderItems);
//
//	// Creating Order Item for 2nd Purchase Order
//
//	//2.	PO 2 - 5 apples and 10 oranges
//	orderItems=new OrderItem[2];
//	stockItem=getStockItemByName(10004);
//	total=(long) (5*stockItem.getPrice());
//	orderItems[0]=new OrderItem(stockItem, 5,total );
//
//	 stockItem=getStockItemByName(10005);
//	 total=(long) (10*stockItem.getPrice());
//	orderItems[1]=new OrderItem(stockItem, 10,total );
//
//	po[1] =new PurchaseOrder(2, LocalDate.now(), null, orderItems);
//
//
//	// Creating Order Item for 3rd Purchase Order
//
//	//3.	PO 3 - 5 Lbs chicken and 10 apples
//		orderItems=new OrderItem[2];
//		stockItem=getStockItemByName(10002);
//		total=(long) (5*stockItem.getPrice());
//		orderItems[0]=new OrderItem(stockItem, 5,total );
//
//		 stockItem=getStockItemByName(10004);
//		 total=(long) (10*stockItem.getPrice());
//		orderItems[1]=new OrderItem(stockItem, 10,total );
//
//		po[2] =new PurchaseOrder(3, LocalDate.now(), null, orderItems);
//		//return po;
//
//}

//public StockItem getStockItemByName(int stockItemId){
//	for (StockItem stockItem : stockItems) {
//		if(stockItem.getItemNo()==stockItemId)
//			return stockItem;
//	}
//	return null;
//}


//public void initStock(){
//	//2.	Create 5 items - Milk, Chicken, Egg, Apple and Orange
//
//	stockItems[0]=new StockItem(10001,"Milk",80,100);
//	stockItems[1]=new StockItem(10002,"Chicken",400,100);
//	stockItems[2]=new StockItem(10003,"Egg",100,50);
//	stockItems[3]=new StockItem(10004,"Apple",400,80);
//	stockItems[4]=new StockItem(10005,"Orange",350,100);
//	//return stockItems;
//
//}

//Customer getCustomerByName(String custName){
//	for (Customer customer : customers) {
//		if(custName.equals(customer.getCustomerName()))
//			return customer;
//	}
//	return null;
//}

//PurchaseOrder[] getPurchaseOrder(int... orderNo){
//	PurchaseOrder orders[]=new PurchaseOrder[orderNo.length];
//	int index=0;
//	for(int ono:orderNo)
//	{
//		for (PurchaseOrder po : this.po) {
//
//			if(po.getPoNumber()==ono)
//				orders[index++]=po;
//		}
//
//	}
//	return orders;
//}





}
