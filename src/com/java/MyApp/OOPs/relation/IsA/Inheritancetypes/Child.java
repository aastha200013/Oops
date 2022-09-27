package com.java.MyApp.OOPs.relation.IsA.Inheritancetypes;

public class Child {
	
	public Child() {
		System.out.println("Multi level inheritance");
	}
	
	public void childName() {
		System.out.println("childName : Adrithi");
	}
	
	public class Mother extends Child {
		public Mother() {
		System.out.println("class Mother");
	}
	
	public void motherName() {
		System.out.println("motherName : Neha");
	}
	
	public void motherSurname() {
		System.out.println("motherSurname : Aagarwal");
	}
	}
}
  
	

