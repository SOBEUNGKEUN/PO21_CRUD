package com.so.repository;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.so.dto.MultiDelete.DeleteDTO;
import com.so.dto.MultiDelete.MultiDelete;
import com.so.dto.MultiSelect.MultiSelect;
import com.so.dto.MultiSelect.SelectDTO;
import com.so.mapper.mapperBizNonXa.SoBizNonXaA;

@Repository("com.so.mapper.mapperBizNonXa.SoBizNonXaA")	
public class SelectDeleteRepository {
	
	@Autowired
	private SoBizNonXaA soBizNonXaA;
	
	public MultiSelect selectService(MultiSelect multiSelect) throws Throwable {
		
		List<SelectDTO> outlist = new ArrayList<SelectDTO>();
		
		// 결과
		outlist = soBizNonXaA.selectEmp01();	
		
		// 반환용 DTO	
		MultiSelect out = new MultiSelect();
		
		out.setDTOLenght(outlist.size());
		out.setIncludeDTO(outlist);
		
		return out;	
	}
	
	public MultiDelete deleteService(MultiDelete input) throws Throwable {
     	
     	DeleteDTO out = new DeleteDTO();
     	
     	int resultCount = 0;
     	
     	for(int i=0; i < input.sizeIncludeDTO(); i++)
     	{
     		out = input.getIncludeDTO(i);
     		resultCount = soBizNonXaA.deleteEmp04(out);
     	}
     	if (resultCount == 0) {
 			throw new SQLException();
 		}
     	
         return input;
     }
}
