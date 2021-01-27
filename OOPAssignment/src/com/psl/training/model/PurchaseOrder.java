package com.psl.training.model;

import com.psl.training.dao.StockItemDao;

import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Arrays;

public class PurchaseOrder {
	public boolean isShipped=false;
	private int poNumber;
	private Date orderDate;
	private Date shipDate;
	private int itemno,custid,orderQnty;

	double total;

	public double getTotal() throws SQLException {
		StockItemDao s=new StockItemDao();
		total=s.getPriceOfItem(this.itemno);
		total=total*orderQnty;
		return total;
	}



	public PurchaseOrder() {
		// TODO Auto-generated constructor stub
	}

	public PurchaseOrder( int poNumber, Date orderDate, Date shipDate, int itemno, int custid, int orderQnty) {
		this.poNumber = poNumber;
		this.orderDate = orderDate;
		this.shipDate = shipDate;
		this.itemno = itemno;
		this.custid = custid;
		this.orderQnty = orderQnty;

	}

	public boolean isShipped() {
		return isShipped;
	}

	public void setShipped(boolean shipped) {
		isShipped = shipped;
	}

	public int getItemno() {
		return itemno;
	}

	public void setItemno(int itemno) {
		this.itemno = itemno;
	}

	public int getCustid() {
		return custid;
	}

	public void setCustid(int custid) {
		this.custid = custid;
	}

	public int getOrderQnty() {
		return orderQnty;
	}

	public void setOrderQnty(int orderQnty) {
		this.orderQnty = orderQnty;
	}

	public int getPoNumber() {
		return poNumber;
	}

	public void setPoNumber(int poNumber) {
		this.poNumber = poNumber;
	}

	public Date getOrderDate() {
		return Date.valueOf(String.valueOf(orderDate));
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Date getShipDate() {
		return shipDate;
	}

	public void setShipDate(Date shipDate) {
		this.shipDate = shipDate;
	}

	@Override
	public String toString() {
		return "PurchaseOrder [poNumber=" + poNumber + ", orderDate="
				+ orderDate + ", shipDate=" + shipDate + "]";
	}


	
	
}
