package com.QAC.Architecture;

import com.QAC.Architecture.dao.TvDAO;
import com.QAC.Architecture.dto.SmartTvDTO;

public class TestTv {
	
public static void main(String [] args) {
	
	SmartTvDTO dto = new SmartTvDTO();
	
	dto.setBrandName("Xaomi");
	dto.setcolor("Black");
	dto.setmodelName("Andriod");
	dto.setprice(40000);
	
	SmartTvDTO dto1 = new SmartTvDTO();
	
	dto1.setBrandName("Sony");
	dto1.setcolor("Black");
	dto1.setmodelName("Andriod");
	dto1.setprice(50000);
	
	TvDAO dao= new TvDAO();
	dao.save(dto);
	dao.save(dto1);
	
	String response = dao.deleteByBrandName("Xaomi");
	System.out.println(response);	
}

}
