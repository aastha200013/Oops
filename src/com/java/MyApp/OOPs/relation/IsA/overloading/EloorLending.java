package com.java.MyApp.OOPs.relation.IsA.overloading;

public class EloorLending extends Library{
	
	boolean isPublic;
	String timing;
	byte review;
	
	public void readingBook(String name) {
		System.out.println("Reading book online");	
	}
	
	public static void main(String [] args) {
		EloorLending el = new EloorLending();
		el.readingBook("");
		System.out.println("Invisible Book");
		
	}

}
