package com.Login;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnectr {
	private static String url = "jdbc:mysql://localhost:3306/hotel";
	private static String user ="root";
	private static String pass =""; 
	private static Connection  con;
	
	public static Connection getConnection(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, user, pass);
		}catch(Exception e) {
			System.out.println("Database Connection Falier");
		}
		
		return con;
	}
}
