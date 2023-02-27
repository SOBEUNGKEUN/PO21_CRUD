package com.so.repository;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.so.dto.MultiInsert.InsertDTO;
import com.so.dto.MultiInsert.MultiInsert;
import com.so.mapper.mapperBizXa1.SoBizXa1A;

@Repository("com.so.mapper.mapperBizXa1.SoBizXa1A")
public class InsertRepository {
	
	@Autowired
	private SoBizXa1A soBizXa1A;
	
    public MultiInsert insertService(MultiInsert input) throws Throwable {
    	
    	InsertDTO out = new InsertDTO();
    	
    	int resultcount = 0;
    	
    	// MultiInsert 는 입력건 여러개
    	for(int i=0; i < input.sizeIncludeDTO(); i ++)
    	{
    		out = input.getIncludeDTO(i);
    		resultcount = soBizXa1A.insertEmp02(out);
    	}
      		
		if (resultcount == 0) {
			throw new SQLException();
		}
    	
        return input;
    }   	   
}
