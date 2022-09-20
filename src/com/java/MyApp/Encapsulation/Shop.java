package com.java.MyApp.Encapsulation;

public class Shop {
	
	private String shopName;
	private String address;
	private int rent;
	private String time;
	
	public String getshopName() {
		return shopName;
	}
	public void setshopName(String shopName) {
		this.shopName=shopName;
	}
	
	public String getaddress() {
		return address;
	}
	public void setaddress(String address) {
		this.address=address;
	}

	public String gettime() {
		return time;
	}
	public void settime(String time) {
		this.time=time;
	}
	
	public int getrent() {
		return rent;
	}
	public void setrent (int rent) {
		this.rent= rent;
	}
	
}
