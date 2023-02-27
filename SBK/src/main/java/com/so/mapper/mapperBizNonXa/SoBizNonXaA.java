package com.so.mapper.mapperBizNonXa;

import java.util.List;

import com.so.dto.MultiDelete.DeleteDTO;
import com.so.dto.MultiSelect.SelectDTO;

public interface SoBizNonXaA{

	public List<SelectDTO> selectEmp01() throws Exception;
	
	public Integer deleteEmp04(DeleteDTO deleteDTO) throws Exception;
}