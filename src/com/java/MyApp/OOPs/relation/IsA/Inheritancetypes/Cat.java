package com.java.MyApp.OOPs.relation.IsA.Inheritancetypes;

import com.java.MyApp.OOPs.relation.IsA.Inheritancetypes.Animal;

public class Cat extends Animal {
	
	public void meow() {
		System.out.println("meow meow ...");
	}



public static void main(String [] args) {
	Cat c = new Cat();
	c.eat();
	c.meow();
}

}
