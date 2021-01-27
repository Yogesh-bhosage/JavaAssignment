package com.psl.training.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public final class DBConnectionUitl {
	static Connection cn=null;

	public DBConnectionUitl(){
		
	}
	static String driverClass="oracle.jdbc.driver.OracleDriver";
	static String url="jdbc:oracle:thin:@localhost:1521:xe";
	static String username="inventory";
	static String password="yogesh";
	
	
	public static Connection getConnection(){
		if(cn==null){
			// Optional
			try {
				Class.forName(driverClass);
				cn=DriverManager.getConnection(url,username,password);
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
					}
		
		return cn;
		
	
	}
	
	public void closeConnection(){
		try {
			cn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
