package com.java.MyApp.OOPs.relation;

import com.java.MyApp.OOPs.relation.HasA.Engine;



public class TestBike {

		public static void main(String [] args) {
			
			Engine engine = new Engine();
			engine.setbrandName("BMW");
			engine.setmodelName("rr331");
			engine.setcapacity((byte)312);
			
			 Bike bmwrr310 = new Bike ();
			 bmwrr310.setbrandName("BMW");
			 bmwrr310.setmodelName("rr310");
			 bmwrr310.setcost(300000);
			
			System.out.println(bmwrr310.getbrandName());
			System.out.println(bmwrr310.getmodelName());
			System.out.println(bmwrr310.getcost());
			
			
			System.out.println(engine.getbrandName());
			System.out.println(engine.getmodelName());
			System.out.println(engine.getcapacity());
			
		}
}
