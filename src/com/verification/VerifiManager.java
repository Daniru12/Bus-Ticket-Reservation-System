package com.verification;
public class VerifiManager {
	private int id;
	private String bname;
	private String btype;
	private String maxs;
	private String spoint; 
	private String stime; 
	private String dpoint;
	private String dtime;
	
	public VerifiManager() {
		
	}

	public VerifiManager(int id,String bname, String btype, String maxs, String spoint, String stime, String dpoint,String dtime) {
		this.id=id;
		this.bname = bname;
		this.btype = btype;
		this.maxs = maxs;
		this.spoint = spoint;
		this.stime = stime;
		this.dpoint = dpoint;
		this.dtime = dtime;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getBtype() {
		return btype;
	}

	public void setBtype(String btype) {
		this.btype = btype;
	}

	public String getMaxs() {
		return maxs;
	}

	public void setMaxs(String maxs) {
		this.maxs = maxs;
	}

	public String getSpoint() {
		return spoint;
	}

	public void setSpoint(String spoint) {
		this.spoint = spoint;
	}

	public String getStime() {
		return stime;
	}

	public void setStime(String stime) {
		this.stime = stime;
	}

	public String getDpoint() {
		return dpoint;
	}

	public void setDpoint(String dpoint) {
		this.dpoint = dpoint;
	}

	public String getDtime() {
		return dtime;
	}

	public void setDtime(String dtime) {
		this.dtime = dtime;
	}
	
	
}
