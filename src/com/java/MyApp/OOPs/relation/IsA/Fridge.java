package com.java.MyApp.OOPs.relation.IsA;

public class Fridge {
	
	private String modelName;
	private String brandName;
	private int cost;
	private String colour;
	private byte noOfdoor;
	
	public Fridge(){
		System.out.println("Invocking fridge constructor");
	}

    public String getmodelName() {
		return modelName;
	}
    public void setmodelName(String modelName) {
    	this.modelName=modelName;
    }
    
    public String getbrandName() {
		return brandName;
	}
    public void setbrandName(String brandName) {
    	this.brandName=brandName;
    }
    
    public String getcolour() {
		return colour;
	}
    public void setcolour(String colour) {
    	this.colour=colour;
    }
    
    public int getcost() {
		return cost;
	}
    public void setcost(int cost) {
    	this.cost=cost;
    }
    
    public byte getnoOfdoor() {
		return noOfdoor;
	}
    public void setnoOfdoor(byte noOfdoor) {
    	this.noOfdoor=noOfdoor;
    }
}
