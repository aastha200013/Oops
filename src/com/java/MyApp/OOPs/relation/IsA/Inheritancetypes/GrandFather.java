package com.java.MyApp.OOPs.relation.IsA.Inheritancetypes;

public class GrandFather {

	public void grandF() {
		System.out.println("He is grandfather.");
	}
}

 class Father extends GrandFather{
	
	public void showf() {
		System.out.println("He is father.");
	}
}

 class Son extends Father{
	
	public void showS() {
		System.out.println("He is Son.");
	}
}

 class Daughter extends Father{
	
	public void showD() {
		System.out.println("She is Daughter.");
	}


  public static void main(String [] args) {
	  
	Son obj = new Son();
	obj.grandF();
	obj.showf();
	obj.showS();
	
	
	Daughter obj2 = new Daughter();
	obj2.grandF();
	obj2.showD();
	obj2.showf();
}
 }

