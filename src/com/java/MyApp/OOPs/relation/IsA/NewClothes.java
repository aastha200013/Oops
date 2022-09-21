package com.java.MyApp.OOPs.relation.IsA;

public class NewClothes extends Clothes {
	byte size;
	int rate;
	String pattern;
	
	NewClothes(String brandName,String material,String color,byte size,int rate,String pattern){
		this.brandName =brandName;
		this.color=color;
		this.material=material;
		this.pattern=pattern;
		this.rate=rate;
		this.size=size;
	}
	
	public static void main(String [] args) {
		
		NewClothes nc = new NewClothes("Zudio","cotton","blue",(byte)8,(int)2599,"Hoodie");
		
		System.out.println(nc.brandName);
		System.out.println(nc.color);
		System.out.println(nc.material);
		System.out.println(nc.pattern);
		System.out.println(nc.rate);
		System.out.println(nc.size);
	}

}
