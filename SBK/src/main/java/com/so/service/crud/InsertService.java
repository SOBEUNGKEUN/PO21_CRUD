package com.so.service.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.so.dto.MultiInsert.MultiInsert;
import com.so.repository.InsertRepository;

@javax.annotation.Generated(
    value = "com.tmaxsoft.sts4.codegen.service.ServiceGenerator",
    date= "23. 2. 24. 오후 4:45",
    comments= "InsertService"
)
@Service
public class InsertService{
    
	@Autowired
	private InsertRepository insertRepository;
	
	 public MultiInsert insertService(MultiInsert input) throws Throwable {
		 return insertRepository.insertService(input);
	 }
}

