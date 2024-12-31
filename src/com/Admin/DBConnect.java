package com.Admin;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	
	private static String url =  "jdbc:mysql://localhost:3306/hotel";
	private static String username = "root";
	private static String password = "";
	private static Connection con;
	
	public static Connection getConnection() {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection(url,username,password);
		}
		catch(Exception e) {
			System.out.println("Database conection is not success !!");
		}
		
		return con;
		
	}
}
