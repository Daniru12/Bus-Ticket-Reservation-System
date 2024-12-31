package com.customer;

public class Custommer {
	
	private int id;
	private String fname;
	private String lname;
	private String email;
	private String phone;
	private String city;
	private String qnt;
	private String date;
	
	
	
	public Custommer() {
		
	}



	public Custommer(int id,String fname,String lname,String email,String phone,String city,String qnt,String date) {
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.phone = phone;
		this.city = city;
		this.qnt = qnt;
		this.date = date;
	}

	
	
	public void setId(int id) {
		this.id = id;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setQnt(String qnt) {
		this.qnt = qnt;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public String getFname() {
		return fname;
	}

	public String getLname() {
		return lname;
	}

	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return phone;
	}

	public String getCity() {
		return city;
	}

	public String getQnt() {
		return qnt;
	}

	public String getDate() {
		return date;
	}

	
}
