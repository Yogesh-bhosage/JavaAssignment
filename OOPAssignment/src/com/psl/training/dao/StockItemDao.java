package com.psl.training.dao;

import com.psl.training.enums.UnitOfMeasurement;
import com.psl.training.model.StockItem;
import com.psl.training.util.DBConnectionUitl;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StockItemDao {



	Connection cn=DBConnectionUitl.getConnection();
	
	//CRUD
	public void insertStockItem(StockItem si){
		// code to insert Employee
		
		try {
			PreparedStatement	pstmt = cn.prepareStatement("insert into Stockitem values(?,?,?,?,?)");
			
			pstmt.setInt(1, si.getItemNo());
			pstmt.setString(2, si.getItemDesc());
			pstmt.setDouble(3, si.getPrice());
			pstmt.setInt(4, si.getQuantity());
			pstmt.setString(5, si.getUnitOfMeasurement().toString());
			
			pstmt.executeUpdate();
		
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
	}
	
	// Statement PreparedStatement CallableStatement
	
	public StockItem getItemDescriptionBtItemNumber(int id){
		StockItem si=null;
		try{
			Statement stmt=cn.createStatement();
		String qry="select * from Stockitem where itemNo="+id;
		ResultSet rs=stmt.executeQuery(qry);
		if(rs.next()){
			si=new StockItem();
			si.setItemNo(rs.getInt(1));
			si.setItemDesc(rs.getString(2));
			si.setPrice(rs.getDouble(3));
			si.setQuantity(rs.getInt(4));
			 //Enum.valueOf(UnitOfMeasurement.class, rs.getString(5))
			si.setUnitOfMeasurement(UnitOfMeasurement.valueOf(rs.getString(5)));
		}
		
		}catch (Exception ex) {
			ex.printStackTrace();
		}
		return si;
	}
	
	public List<StockItem> getAllStockItems(){
		List<StockItem> siList = new ArrayList<>();
		try{
		Statement stmt=cn.createStatement();
		String qry="select * from StockItem";
		ResultSet rs=stmt.executeQuery(qry);
		if(rs.next()){
			StockItem si=new StockItem();
			si.setItemNo(rs.getInt(1));
			si.setItemDesc(rs.getString(2));
			si.setPrice(rs.getDouble(3));
			si.setQuantity(rs.getInt(4));
			si.setUnitOfMeasurement(UnitOfMeasurement.valueOf(rs.getString(5)));
			
			siList.add(si);
		}
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
		return siList;
	}
	
	public void updateStock(StockItem si){
		try{
			
			String qry="UPDATE Stockitem "
	                + "SET quantity = ?"
	                + "WHERE itemNo = ?";
			
			PreparedStatement stmt=cn.prepareStatement(qry);
			stmt.setInt(1, si.getQuantity());
			stmt.setInt(2, si.getItemNo());
			
			int rs=stmt.executeUpdate(qry);
			
			if(rs==1)
				System.out.println("stock item updated with item no = "+si.getItemNo());
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
	public void deleteStckItemByItemNo(int id){
		// delete employee from DB with matching id
		try{
			Statement stmt=cn.createStatement();
			String qry="delete from Stockitem where itemNo="+id;
			int rs=stmt.executeUpdate(qry);
			if(rs==1)
				System.out.println("StockItem deleted with item no = "+id);
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
				
	}

	public int getPriceOfItem(int itemNo) throws SQLException {
		Statement stmt=cn.createStatement();
		String qry="select itemprice from Stockitem where itemNo="+itemNo;
		ResultSet rs=stmt.executeQuery(qry);
		while(rs.next()){
			return rs.getInt(1);
		}
		return 0;
	}

}
