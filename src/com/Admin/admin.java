package com.Admin;

public class admin {
	
	private int id;
	private String name;
	private String phone;
	private String bus_name;
	private String bus_type;
	private String seatNo;
	private String date ;
	private String destination;
	
	public admin() {
		
	}

	public admin(int id, String name, String phone, String bus_name, String bus_type, String seatNo, String date,String destination) {
		
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.bus_name = bus_name;
		this.bus_type = bus_type;
		this.seatNo = seatNo;
		this.date = date;
		this.destination = destination;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getBus_name() {
		return bus_name;
	}

	public void setBus_name(String bus_name) {
		this.bus_name = bus_name;
	}

	public String getBus_type() {
		return bus_type;
	}

	public void setBus_type(String bus_type) {
		this.bus_type = bus_type;
	}

	public String getSeatNo() {
		return seatNo;
	}

	public void setSeatNo(String seatNo) {
		this.seatNo = seatNo;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	
	
	
	

}
