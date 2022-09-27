package com.QAC.Architecture;

import com.QAC.Architecture.dto.SmartWatchDTO;
import com.QAC.Architecture.dao.WatchDAO;

public class Test {
	
	public static void main(String [] args) {
		
		
		SmartWatchDTO watch = new SmartWatchDTO();
		
		watch.setBrandName("BOAT");
		watch.setcolor("Olive");
		watch.setmodelName("Extra Bass");
		watch.setprice(2000);
		watch.setWarranty("1 Year");
		
		WatchDAO dao= new WatchDAO();
		dao.save(watch);
		
		String response = dao.deleteByBrandName("BOAT");
		System.out.println(response);			
		
	}

}
