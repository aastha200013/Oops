package com.java.MyApp.OOPs.relation.IsA.overloading;

public class Person extends HumanBeing{
	
	String caste;
	String location;
	String DOB;
	
	public void IsmakingCoffee() {
		System.out.println("Coffee is ready");
	}
	
	public String caste() {
		System.out.println("Hindu");
		return("Hindu");
	}
	
	public String location() {
		System.out.println("Banglore");
		return("Banglore");
	}
	

}
