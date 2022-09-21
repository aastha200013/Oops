package com.java.MyApp.OOPs.relation.IsA.overloading;

public class Library {
	
	String name;
	int noOfBook;
	String location;
	
	public void readingBook(String name) {
		System.out.println("Reading books in library");
	}
	
	public String searchingBook() {
		System.out.println("searching for 2 satates book");
		return "2 states book";
	}

}
