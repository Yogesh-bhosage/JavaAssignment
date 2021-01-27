package com.psl.training.dao;

import com.psl.training.model.OrderItem;
import com.psl.training.model.PurchaseOrder;
import com.psl.training.model.StockItem;
import com.psl.training.util.DBConnectionUitl;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OrderItemDao {




	Connection cn=DBConnectionUitl.getConnection();
	
	StockItemDao sdao  = new StockItemDao();
	
	//CRUD
	public void insertOrderItem(OrderItem oi){
		// code to insert Employee
		
		try {
			PreparedStatement	pstmt = cn.prepareStatement("insert into OrderItem values(?,?,?)");
			
			int stItem = oi.getStockItem();
			
			pstmt.setInt(1, oi.getStockItem());
//			pstmt.setInt(2, stItem.getItemNumber());
//			pstmt.setInt(3, oi.getNumberOfItems());
			pstmt.setLong(2, oi.getTotal());
//			pstmt.setInt(3, po.getPoNumber());
			
			pstmt.executeUpdate();
		
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
	}
	
	// Statement PreparedStatement CallableStatement
	
	public OrderItem getOrderItemByItemNumber(int id){
		OrderItem oi=null;
		try{
			Statement stmt=cn.createStatement();
		String qry="select * from OrderItem where orderItemNo="+id;
		ResultSet rs=stmt.executeQuery(qry);
		if(rs.next()){
			oi=new OrderItem();
			oi.setStockItem((rs.getInt(1)));
//			oi.setStockItem(sdao.getItemDescriptionBtItemNumber(rs.getInt(2)));
//			oi.setNumberOfItems(rs.getInt(3));;
			oi.setTotal(rs.getLong(4));
			// add purchase order no
		}
		
		}catch (Exception ex) {
			ex.printStackTrace();
		}
		return oi;
	}
	
	public List<OrderItem> getAllOrderItems(){
		List<OrderItem> oiList = new ArrayList<>();
		try{
		Statement stmt=cn.createStatement();
		String qry="select * from OrderItem";
		ResultSet rs=stmt.executeQuery(qry);
		if(rs.next()){
			OrderItem oi=new OrderItem();
			oi.setStockItem(rs.getInt(1));
//			oi.setStockItem(sdao.getItemDescriptionBtItemNumber(rs.getInt(2)));
			oi.setOrderedQuntity(rs.getInt(2));
//			oi.setTotal(rs.getLong(3));
			// add purchase order no
			
			oiList.add(oi);
		}
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
		return oiList;
	}
	
	
	public void deleteOrderItemByOrderItemNo(int id){
		// delete employee from DB with matching id
		try{
			Statement stmt=cn.createStatement();
			String qry="delete from OrderItem where orderItemNo="+id;
			int rs=stmt.executeUpdate(qry);
			if(rs==1)
				System.out.println("Order item deleted with order item no = "+id);
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
				
	}


}
