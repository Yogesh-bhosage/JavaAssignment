package com.psl.training.model;

public class OrderItem {
	private int stockItem;
	private int orderedQuntity;
	private long total; // derived field

	public OrderItem() {
		// TODO Auto-generated constructor stub
	}

	public OrderItem(int stockItem, int orderedQuntity, long total) {
		super();
		this.stockItem = stockItem;
		this.orderedQuntity = orderedQuntity;
		this.total = total;
	}

	public int getStockItem() {
		return stockItem;
	}

	public void setStockItem(int stockItem) {
		this.stockItem = stockItem;
	}

	public int getOrderedQuntity() {
		return orderedQuntity;
	}

	public void setOrderedQuntity(int orderedQuntity) {
		this.orderedQuntity = orderedQuntity;
	}

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "OrderItem [stockItem=" + stockItem + ", orderedQuntity="
				+ orderedQuntity + ", total=" + total + "]";
	}
	
	

}
