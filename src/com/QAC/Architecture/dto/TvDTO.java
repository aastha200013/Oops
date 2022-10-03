package com.QAC.Architecture.dto;

public class TvDTO {
	
	private String BrandName;
	private int price;
	
	public TvDTO() {
		System.out.println("Invoking TV details");
	}
	
	public String getBrandName() {
		return BrandName;
	}
	public void setBrandName(String BrandName) {
		System.out.println("Xaomi ");
		
	}
	
	public int getprice() {
		return price;
	}
	public void setprice(int price) {
		System.out.println(40000);
		
	}

}
