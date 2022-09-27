package com.QAC.Architecture.dto;

public class SmartWatchDTO extends WatchDTO {
	
	private String color;
	private String Warranty;

	
	public SmartWatchDTO() {
		System.out.println("Invoking smartwatch details");
	}
	
	public String getcolor() {
		return color;
	}
	public void setcolor(String color) {
		System.out.println(" Olive ");
	}
	
	public String getWarranty() {
		return Warranty;
	}
	public void setWarranty(String Warranty) {
		System.out.println(" 1 year ");
	}

	
}
