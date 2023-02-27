package com.so.service.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.so.dto.MultiUpdate.MultiUpdate;
import com.so.repository.UpdateRepository;

@javax.annotation.Generated(
    value = "com.tmaxsoft.sts4.codegen.service.ServiceGenerator",
    date= "23. 2. 24. 오후 4:45",
    comments= "UpdateService"
)
@Service
public class UpdateService{
    
	@Autowired
	private UpdateRepository updateRepository;
	
	public MultiUpdate updateService(MultiUpdate input) throws Throwable {
		return updateRepository.updateService(input);
	}
    
}

