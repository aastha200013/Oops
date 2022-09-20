package com.java.MyApp.Encapsulation;

public class TestShop {
	
	public static void  main(String [] args) {
		Shop sh = new Shop();
		sh.setshopName("Gautam dresses");
		sh.setaddress("Mahaveer circle");
		sh.settime("9'clck");
		sh.setrent(20000);
		
		System.out.println(sh.getshopName());
		System.out.println(sh.getaddress());
		System.out.println(sh.gettime());
		System.out.println(sh.getrent());
		
	}

}
