package com.java.MyApp.OOPs.relation.IsA;

public class Whirlpool extends Fridge {
	
	private short energyEfficiency;
	private String temperature;
	
	public Whirlpool(){
		System.out.println("Invoking whirlpool constructor");
	}
	
	public short getenergyEfficiency() {
		return energyEfficiency;
	}
    public void setenergyEfficiency(short energyEfficiency) {
    	this.energyEfficiency=energyEfficiency;
    }
    
    public String gettemperature() {
		return temperature;
	}
    public void settemperature(String temperature) {
    	this.temperature=temperature;
    }
}
