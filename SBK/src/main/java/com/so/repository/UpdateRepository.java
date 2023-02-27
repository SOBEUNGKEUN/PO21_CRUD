package com.so.repository;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.so.dto.MultiUpdate.MultiUpdate;
import com.so.dto.MultiUpdate.UpdateDTO;
import com.so.mapper.mapperBizXa2.SoBizXa2A;

@Repository("com.so.mapper.mapperBizXa2.SoBizXa2A")
public class UpdateRepository {
	@Autowired
	private SoBizXa2A sobizXa2A;
	
	public MultiUpdate updateService(MultiUpdate input) throws Throwable {
		
		UpdateDTO out = new UpdateDTO();
		 
		int resultCount = 0;
		
		for(int i=0; i < input.sizeIncludeDTO(); i++)
		{
			out = input.getIncludeDTO(i);
			resultCount = sobizXa2A.updateEmp03(out);
		}
		if (resultCount == 0) {
			throw new SQLException();
		}
    	
        return input;
	}
}
