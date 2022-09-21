package com.java.MyApp.constructor;

public class Vegetable {
 
	String name;
	int size;
	
	public Vegetable(){
		this("lady finger");
		System.out.println("Invocking the vegetable");
	}
	public Vegetable(String name) {
		System.out.println("Carrot");	
	}
	public Vegetable(int size) {
		System.out.println("Medium");
	}
}
