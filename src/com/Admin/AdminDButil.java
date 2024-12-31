package com.Admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class AdminDButil {
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	
	
	 public static boolean InsertAdmin(String name,String phone, String bus_name,String bus_type,String seatNo,String date,String destination) {
		 
		 boolean isSuccess =  false;
		 
		 try {
			 con = DBConnect.getConnection();
			 stmt = con.createStatement();
			 String sql = "insert into admin values (0,'"+name+"','"+phone+"','"+bus_name+"','"+bus_type+"','"+seatNo+"','"+date+"','"+ destination+"')";
			 int rs = stmt.executeUpdate(sql);
			 
			 if(rs > 0) {
				 isSuccess = true;
			 } else {
				 isSuccess = false;
			 }
					 
		 }
		 catch(Exception e){
			 e.printStackTrace();
		 }
		
		 
		 return isSuccess;
	 }
	 
	 public static ArrayList<admin> getAdmin(){
			
			ArrayList<admin> cus = new ArrayList<>();
			
			try {
				con = DBConnect.getConnection(); 	
				String sql = " select * from hotel.admin";
				PreparedStatement ps = con.prepareStatement(sql);
				rs = ps.executeQuery();
				
				while(rs.next()) {
					System.out.println("runsqldan");
					admin c = new admin();
	                c.setId(rs.getInt(1));
	                c.setName(rs.getString(2));
	                c.setPhone(rs.getString(3));
	                c.setBus_name(rs.getString(4));
	                c.setBus_type(rs.getString(5));
	                c.setSeatNo(rs.getString(6));
	                c.setDate(rs.getString(7));
	                c.setDestination(rs.getString(8)); 
	                cus.add(c);
				}
				
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			return cus;
			
		}
	 
	 public static boolean updateadmin(String id, String name,String phone, String bus_name,String bus_type, String seatNo,String date,String destination) {
		 
		 try {
			 
			 con = DBConnect.getConnection();
			 stmt = con.createStatement();
			 String sql = "update admin set name='"+name+"',phone='"+phone+"',bus_name='"+bus_name+"',bus_type='"+bus_type+"',seatNo='"+seatNo+"',date='"+date+"',destination='"+destination+"'"
					 		+"where id ='"+id+"'";
			 
			 int rs = stmt.executeUpdate(sql);
			 
			 if(rs > 0) {
				 isSuccess = true;
			 }
			 else {
				 isSuccess = false;
			 }
		 }
		 catch(Exception e) {
			 e.printStackTrace();
		 }
		 
		 return isSuccess;
	 }
	 
	 public static boolean deleteAdmin(String id) {
		 
		 int convId = Integer.parseInt(id);
		 
		 try {
			 
			 con = DBConnect.getConnection();
			 stmt = con.createStatement();
			 String sql = "delete from admin where id = '"+convId+"'";
			 int r = stmt.executeUpdate(sql);
			 
			 if (r > 0) {
				 isSuccess = true;
			 }
			 else {
				 isSuccess = false;
			 }
			 
;		 }
		 catch(Exception e) {
			 e.printStackTrace();
		 }
		 
		 
		 
		 return isSuccess;
		 
	 }

}
