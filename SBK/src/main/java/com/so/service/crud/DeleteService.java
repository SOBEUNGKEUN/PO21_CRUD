package com.so.service.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.so.dto.MultiDelete.MultiDelete;
import com.so.repository.SelectDeleteRepository;

@javax.annotation.Generated(
    value = "com.tmaxsoft.sts4.codegen.service.ServiceGenerator",
    date= "23. 2. 24. 오후 4:45",
    comments= "DeleteService"
)
@Service
public class DeleteService{
    
	@Autowired
	private SelectDeleteRepository deleteRepository;
	
	public MultiDelete deleteService(MultiDelete input) throws Throwable {
		return deleteRepository.deleteService(input);
	 }
    
}

