package com.financial;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class FinancialDBUtil {
	private static Connection con = null;
	private static Statement stmt = null;
	
	public static boolean insertPayment(String id,String name,String phone,String method,String noTiket,String price,String amount) {
		boolean isSucess=false;
		

		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql="Insert into hotel.financial values('"+id+"','"+name+"','"+phone+"','"+method+"','"+noTiket+"','"+price+"','"+amount+"');";
			int rs=stmt.executeUpdate(sql);
			
			
			if(rs>0) {
				isSucess= true;
			}else {
				isSucess= false;
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return isSucess;
	}
	
public static ArrayList<financial> getfinancial(){
		
		ArrayList <financial> ver = new ArrayList<>();
		
		try {
			con = DBConnect.getConnection(); 
			String sql = " select * from financial";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				System.out.println("runsqldan");
				financial v = new financial();
				
				v.setId(rs.getString(1));
				v.setName(rs.getString(2));
				v.setPhone(rs.getString(3));
				v.setMethod(rs.getString(4));
				v.setNoTiket(rs.getString(5));
				v.setPrice(rs.getString(6));
				v.setAmount(rs.getString(7));
				
                ver.add(v);
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return ver;

	}

public static boolean updatefinancial(String id,String name,String phone,String method,String noTiket,String price,String amount) {
	
	boolean isSuccess = false;
	
	try {
		con = DBConnect.getConnection();
		stmt = con.createStatement();
		String sql = "update hotel.financial set id='"+id+"',pname='"+name+"',no='"+phone+"',method='"+method+"',noticket='"+noTiket+"',price='"+price+"',amount='"+amount+"' where id='"+id+"'";
		
		int rs =  stmt.executeUpdate(sql);
		
		if(rs > 0) {
			isSuccess = true;
		}else
			isSuccess = false;
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	
	return isSuccess;
	
	}

public static boolean deletefinancial(String id) {
	
	boolean isSuccess = false;
	
	
	
	try {
		
		con = DBConnect.getConnection();
		stmt =con.createStatement();
		String sql = "delete from financial where id ='"+id+"'";
		int r = stmt.executeUpdate(sql);
		
		if(r>0) {
			isSuccess = true;
		}
		else {
			isSuccess = false;
		}
		
	}
	catch (Exception e) {
		
		e.printStackTrace();
	}
	
	
	return isSuccess;
}

}
