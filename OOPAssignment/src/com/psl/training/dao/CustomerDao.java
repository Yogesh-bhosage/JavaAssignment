package com.psl.training.dao;

import com.psl.training.model.Customer;
import com.psl.training.util.DBConnectionUitl;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerDao {


	Connection cn=DBConnectionUitl.getConnection();
	
	//CRUD
	public void insertCustomer(Customer c){
		// code to insert Employee
		
		try {
			PreparedStatement	pstmt = cn.prepareStatement("insert into customer values(?,?,?)");
			
			pstmt.setInt(1, c.getCustId());
			pstmt.setString(2, c.getCustomerName());

			pstmt.setString(7, c.getCity());

			pstmt.executeUpdate();
		
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
	}
	
	// Statement PreparedStatement CallableStatement
	
	public Customer getCustomerById(int id){
		Customer c=null;
		try{
			Statement stmt=cn.createStatement();
		String qry="select * from customer where customerNo="+id;
		ResultSet rs=stmt.executeQuery(qry);
		if(rs.next()){
			c=new Customer();
			c.setCustId(rs.getInt(1));
			c.setCustomerName(rs.getString(2));
			c.setCity(rs.getString(7));
			}
		
		}catch (Exception ex) {
			ex.printStackTrace();
		}
		return c;
	}
	
	public List<Customer> getCustomer(){
		List<Customer> clist = new ArrayList<>();
		try{
		Statement stmt=cn.createStatement();
		String qry="select * from customer";
		ResultSet rs=stmt.executeQuery(qry);
		if(rs.next()){
			Customer c=new Customer();
			c.setCustId(rs.getInt(1));
			c.setCustomerName(rs.getString(2));
			c.setCity(rs.getString(7));

			clist.add(c);
		}
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
		return clist;
	}
	
	public void updateCustomer(Customer c){
		try{
			
			String qry="UPDATE customer "
	                + "SET name = ?"
	                + "WHERE customerNo = ?";
			
			PreparedStatement stmt=cn.prepareStatement(qry);
			stmt.setString(1, c.getCustomerName());
			stmt.setInt(2, c.getCustId());
			
			int rs=stmt.executeUpdate(qry);
			
			if(rs==1)
				System.out.println("Customer updated with id no = "+c.getCustId());
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
	public void deleteCustomerById(int id){
		// delete employee from DB with matching id
		try{
			Statement stmt=cn.createStatement();
			String qry="delete from customer where customerNo="+id;
			int rs=stmt.executeUpdate(qry);
			if(rs==1)
				System.out.println("Customer deleted with id no = "+id);
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
				
	}
}
