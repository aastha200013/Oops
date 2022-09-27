package com.QAC.Architecture.dto;

public class WatchDTO {
	
	private String BrandName;
	private String modelName;
	private int price;
	
	public WatchDTO() {
		System.out.println("Invoking watch details");
	}

	public String getBrandName() {
		return BrandName;
	}
	public void setBrandName(String BrandName) {
		System.out.println("BOAT ");
	}
	
	public String getmodelName() {
		return modelName;
	}
	public void setmodelName(String modelName) {
		System.out.println("Extra Bass ");
	}
	
	public int getprice() {
		return price;
	}
	public void setprice(int price) {
		System.out.println( 2000);
	}

}
