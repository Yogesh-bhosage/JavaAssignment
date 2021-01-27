package com.psl.training.dao;

import com.psl.training.model.Customer;
import com.psl.training.model.PurchaseOrder;
import com.psl.training.util.DBConnectionUitl;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PurchaseOrderDao {





	Connection cn=DBConnectionUitl.getConnection();
	
	StockItemDao sdao  = new StockItemDao();
	
	//CRUD
	public void insertPurchaseOrder(PurchaseOrder po, Customer c){
		// code to insert Employee
		
		try {
			PreparedStatement	pstmt = cn.prepareStatement("insert into PurchaseOrder values(?,?,?,?,?,?)");
			
			pstmt.setInt(1, po.getPoNumber());
			pstmt.setDate(2, po.getOrderDate());
			pstmt.setDate(3, po.getShipDate());
			pstmt.setInt(4,po.getItemno());
			pstmt.setInt(5, c.getCustId());
			pstmt.setInt(6,po.getOrderQnty());
			
			pstmt.executeUpdate();
		
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
	}
	
	// Statement PreparedStatement CallableStatement
	
	public PurchaseOrder getPurchaseOrderByPurchaseOrderNumber(int id){
		PurchaseOrder po=null;
		try{
			Statement stmt=cn.createStatement();
		String qry="select * from PurchaseOrder where poNumber="+id;
		ResultSet rs=stmt.executeQuery(qry);
		if(rs.next()){
			po=new PurchaseOrder();
			po.setPoNumber(rs.getInt(1));
			po.setOrderDate(rs.getDate(2));
			po.setShipDate(rs.getDate(3));;
		}
		
		}catch (Exception ex) {
			ex.printStackTrace();
		}
		return po;
	}
	
	public List<PurchaseOrder> getAllPurchaseOrders(){
		List<PurchaseOrder> poList = new ArrayList<>();
		try{
		Statement stmt=cn.createStatement();
		String qry="select * from PurchaseOrder";
		ResultSet rs=stmt.executeQuery(qry);
		if(rs.next()){
			PurchaseOrder po=new PurchaseOrder();
			po.setPoNumber(rs.getInt(1));
			po.setOrderDate(rs.getDate(2));
			po.setShipDate(rs.getDate(3));
			
			poList.add(po);
		}
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
		return poList;
	}
	
	public void updatePurchaseOrder(PurchaseOrder po){
		try{
			
			String qry="UPDATE PurchaseOrder "
	                + "SET shipdate = ?"
	                + "WHERE poNumber = ?";
			
			PreparedStatement stmt=cn.prepareStatement(qry);
			stmt.setDate(1, po.getShipDate());
			stmt.setInt(2, po.getPoNumber());
			
			int rs=stmt.executeUpdate(qry);
			
			if(rs==1)
				System.out.println("Purchase order updated with po no = "+po.getPoNumber());
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
	public void deletePurchaseOrderByPoNo(int id){
		try{
			Statement stmt=cn.createStatement();
			String qry="delete from PurchaseOrder where poNumber="+id;
			int rs=stmt.executeUpdate(qry);
			if(rs==1)
				System.out.println("Purchase Order deleted with purchase order no = "+id);
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
				
	}


	public static void printShipperOrderLastMonth(){
		Connection cn=DBConnectionUitl.getConnection();
		PurchaseOrder po=null;
		try{
			Statement stmt=cn.createStatement();
			String qry="select * from purchaseorder where shipdate between add_months(trunc(sysdate,'mm'),-1) and last_day(add_months(trunc(sysdate,'mm'),-1))";
			ResultSet rs=stmt.executeQuery(qry);
			if(rs.next()){
				po=new PurchaseOrder();
				po.setPoNumber(rs.getInt(1));
				po.setOrderDate(rs.getDate(2));
				po.setShipDate(rs.getDate(3));;

				System.out.println(po);
			}

		}catch (Exception ex) {
			ex.printStackTrace();
		}

	}



}
