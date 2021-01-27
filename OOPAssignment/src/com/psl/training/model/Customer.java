package com.psl.training.model;

import java.util.Arrays;

public class Customer {
private int custId;
private String customerName;
private String city;


public Customer() {
	// TODO Auto-generated constructor stub
}

public Customer(int custId, String customerName, String city) {
	super();
	this.custId = custId;
	this.customerName = customerName;
	this.city = city;

}

public int getCustId() {
	return custId;
}

public void setCustId(int custId) {
	this.custId = custId;
}

public String getCustomerName() {
	return customerName;
}

public void setCustomerName(String customerName) {
	this.customerName = customerName;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}


@Override
public String toString() {
	return "Customer [custId=" + custId + ", customerName=" + customerName
			+ ", city=" + city + ", po=" + "]";
}


}
