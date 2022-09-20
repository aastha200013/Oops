package com.java.MyApp.constructor;

public class Vegetable {
 
	String name;
	int size;
	
	public Vegetable(){
		System.out.println("Invocking the vegetable");
	}
	public Vegetable(String name) {
		this();
		System.out.println("Carrot");	
	}
	public Vegetable(int size) {
		System.out.println("Medium");
	}
}
