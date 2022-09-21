package com.java.MyApp.OOPs.relation.IsA;

public class GulabJamun extends Sweets {
	String texture="soft";
	byte price=20;
	
	
	 public String gettexture() {
			return texture;
		}
	    public void settexture(String texture) {
	    	this.texture=texture;
	    }
	    
	    public byte getprice() {
			return price;
		}
	    public void setprice(byte price) {
	    	this.price=price;
	    }
	  
	    
	    public static void mains(String [] args) {
	    	
	    	GulabJamun gj = new GulabJamun();
	    	gj.getcolour();
	    	gj.getname();
	    	gj.getprice();
	    	gj.gettexture();
	    	gj.getweight();
	    	
	    	System.out.println(gj.getcolour());
	    	System.out.println(gj.getname());
	    	System.out.println(gj.getprice());
	    	System.out.println(gj.gettexture());
	    	System.out.println(gj.getweight());
	    }

}
