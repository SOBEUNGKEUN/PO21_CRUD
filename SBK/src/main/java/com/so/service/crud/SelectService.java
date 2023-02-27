package com.so.service.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.so.dto.MultiSelect.MultiSelect;
import com.so.repository.SelectDeleteRepository;

@javax.annotation.Generated(
    value = "com.tmaxsoft.sts4.codegen.service.ServiceGenerator",
    date= "23. 2. 24. 오후 4:45",
    comments= "SelectService"
)
@Service
public class SelectService{
    
	@Autowired
	private SelectDeleteRepository selectRepository;
	
	public MultiSelect selectService(MultiSelect multiSelect) throws Throwable {
		return selectRepository.selectService(multiSelect);
	}
    
}

