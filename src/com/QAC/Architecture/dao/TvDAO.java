package com.QAC.Architecture.dao;

import com.QAC.Architecture.dto.SmartTvDTO;

public class TvDAO {
	
	private SmartTvDTO [] smarttv = new SmartTvDTO[2];
	
	public void save (SmartTvDTO watchtv) {
		smarttv[0]= watchtv;
	}
	
public String deleteByBrandName(String brandName) {
		
		for(int i=0; i<smarttv.length;i++) {
			if(smarttv[i] != null && smarttv[i].getBrandName().equals(brandName)) {
				smarttv[i]=null;
			}
				return "Deleted"+brandName;
		}
		return "brandName "+brandName +" not present";
}

		public void print() {
			for(int i=0;i<smarttv.length;i++) {
				System.out.println(smarttv[i].getBrandName());
				System.out.println(smarttv[i].getcolor());
				System.out.println(smarttv[i].getmodelName());
				System.out.println(smarttv[i].getprice());
				
			}
		}

}