package com.Login;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class loginDBUtil {
	
	private static boolean isSuccess;
	private static Connection con=null;
	private static Statement stmt=null;
	private static ResultSet rs = null;
	
	public static boolean validate(String username,String password) {
		
		try {
			con = DBConnectr.getConnection();
			stmt = con.createStatement();
			String sql = "select * from login where username='"+username+"'AND  password='"+password+"'";
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
}
