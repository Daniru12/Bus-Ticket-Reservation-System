package com.customer;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class CustommerDButil {
	
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;

	public static List<Custommer> validate(String em){
		
		
		ArrayList<Custommer> cus = new ArrayList<Custommer>();
		
		//validate
		try {
			con = DBConnectr.getConnection();
			stmt = con.createStatement();
			System.out.println("run2");
			String sql ="select * from hotel.bookticket where Email='"+em+"'";
			rs = stmt.executeQuery(sql);
			System.out.println("run3");
			
			if(rs.next()== true) {
				int id =rs.getInt(1);
				String fname = rs.getString(2);
				String lname = rs.getString(3);
				String email = rs.getString(4);
				String phone = rs.getString(5);
				String city = rs.getString(6);
				String qnt = rs.getString(7);
				String date = rs.getString(8);
				
				Custommer c = new Custommer(id,fname,lname,email,phone,city,qnt,date);
				cus.add(c);
			
			
				System.out.println("run final");
			}
			
		}catch (Exception e) {
			e.getStackTrace();
		}
		
		return cus;
	}
	
	public static boolean insertcustomer(String frist,String last,String email,String no,String city,String qnt, String date) {
		
		boolean isSuccess = false;
		

		
		try {
			con = DBConnectr.getConnection();
			stmt = con.createStatement(); 
			String sql ="insert into hotel.bookticket values (0,'"+frist+"','"+last+"','"+email+"','"+no+"','"+city+"','"+qnt+"','"+date+"')";
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
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
	
	public static boolean updatecustommer(String id,String frist,String last,String email,String no,String city,String qnt, String date){
		boolean isSuccess = false;
		
		try {
			con = DBConnectr.getConnection();
			stmt = con.createStatement(); 
			String sql = "UPDATE hotel.bookticket SET FName='" + frist + "', Lname='" + last + "', Email='" + email + 
                    "', phoneno='" + no + "', city='" + city + "', qnt='" + qnt + "', date='" + date + 
                    "' WHERE id='" + id + "'";
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
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
	
	public static ArrayList<Custommer> getCustomers(){
		
		ArrayList<Custommer> cus = new ArrayList<>();
		
		try {
			con = DBConnectr.getConnection(); 
			String sql = " select * from hotel.bookticket";
			PreparedStatement ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				System.out.println("runsqldan");
				Custommer c = new Custommer();
                c.setId(rs.getInt(1));
                c.setFname(rs.getString(2));
                c.setLname(rs.getString(3));
                c.setEmail(rs.getString(4));
                c.setPhone(rs.getString(5));
                c.setCity(rs.getString(6));
                c.setQnt(rs.getString(7));
                c.setDate(rs.getString(8)); 
                cus.add(c);
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return cus;
		
	}
	
	
	public static boolean deleteCustomer(String id) {
		boolean isSuccess=false;
		
		int conId = Integer.parseInt(id); 
		
		 try {
			 con=DBConnectr.getConnection();
			 stmt = con.createStatement();
			 String sql="delete from hotel.bookticket where id='"+conId+"'";
			 int rs = stmt.executeUpdate(sql);
			 
			 if(rs > 0) {
				isSuccess = true;
			}
			else{
				isSuccess = false;
			} 
			 
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
		
		return isSuccess;
	}
}
