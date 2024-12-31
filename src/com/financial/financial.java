package com.financial;

public class financial {
	
	private String id;
	private String name;
	private String phone;
	private String method;
	private String noTiket;
	private String price;
	private String amount;
	
	public financial() {
		
	}

	public financial(String id, String name, String phone, String method, String noTiket, String price, String amount) {
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.method = method;
		this.noTiket = noTiket;
		this.price = price;
		this.amount = amount;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getNoTiket() {
		return noTiket;
	}

	public void setNoTiket(String noTiket) {
		this.noTiket = noTiket;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}
	
	
}
