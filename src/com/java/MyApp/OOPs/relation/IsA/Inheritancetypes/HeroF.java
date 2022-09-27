package com.java.MyApp.OOPs.relation.IsA.Inheritancetypes;


public class HeroF extends Child {
	
	public HeroF() {
		System.out.println("class Father");
	}	
	
	public void fatherName() {
		System.out.println("fatherName : Ritesh");
	}
	
 public static void main(String [] args) {
	
	HeroF obj = new HeroF();
	obj.childName();
	obj.fatherName();
	
}

}
