package com.verification;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class VerificationDButil {
	private static Connection con = null;
	private static Statement stmt = null;
	
	
	public static boolean insertScheduler(String bname,String btype,String maxs,String spoint,String stime,String dpoint,String dtime){
		
		boolean isSuccess = false;
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			System.out.println("run2");
			String sql = "insert into customer values (0,'"+bname+"','"+btype+"','"+maxs+"','"+spoint+"','"+stime+"','"+dpoint+"','"+dtime+"')";
			int rs = stmt.executeUpdate(sql);
			System.out.println("run3");
			if(rs>0) {
				isSuccess = true;
			}else {
				isSuccess = false;
			}
			
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	public static ArrayList<VerifiManager> getVerifi(){
		
		ArrayList <VerifiManager> ver = new ArrayList<>();
		
		try {
			con = DBConnect.getConnection(); 
			String sql = " select * from customer";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				System.out.println("runsqldan");
				VerifiManager v = new VerifiManager();
				
				v.setId(rs.getInt(1));
				v.setBname(rs.getString(2));
				v.setBtype(rs.getString(3));
				v.setMaxs(rs.getString(4));
				v.setSpoint(rs.getString(5));
				v.setStime(rs.getString(6));
				v.setDpoint(rs.getString(7));
				v.setDtime(rs.getString(8));
                ver.add(v);
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return ver;

	}
	
	public static boolean updateScheduler(String id,String bname, String bType, String maxs, String Spoint, String Stime, String Dpoint, String Dtime) {
		
		boolean isSuccess = false;
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "update hotel.customer set BusName='"+bname+"',BusType='"+bType+"',MaxSeat='"+maxs+"',StatPoint='"+Spoint+"',StartTime='"+Stime+"',DropPoint='"+Dpoint+"',DropTime='"+Dtime+"' where id='"+id+"'";
			
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
	
	public static boolean deleteScheduler(String id) {
		
		boolean isSuccess = false;
		
		int convId = Integer.parseInt(id);
		
		try {
			
			con = DBConnect.getConnection();
			stmt =con.createStatement();
			String sql = "delete from customer where id = '"+convId+"'";
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
