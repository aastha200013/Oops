package com.QAC.Architecture.dao;

import com.QAC.Architecture.dto.SmartWatchDTO;

public class WatchDAO {
	
	private SmartWatchDTO []smartwatch = new SmartWatchDTO[10];
	
	public void save(SmartWatchDTO watch) {
		smartwatch[0]=watch;
	}
	
	public String deleteByBrandName(String brandName) {
		
		for(int i=0; i<smartwatch.length;i++) {
			if(smartwatch[i] != null && smartwatch[i].getBrandName().equals(brandName)) {
				smartwatch[i]=null;
				return "Deleted"+brandName;
				
			}
		}
		return "brandName "+brandName +" not present";
	}

}
