package com.so.dto.MultiSelect;

import jeus.proobject.core2.annotation.DataObject;
import java.io.Serializable;
import java.lang.Cloneable;
import java.util.ArrayList;
import java.util.List;

@javax.annotation.Generated(
	value = "com.tmaxsoft.sts4.codegen.dto.DtoGenerator",
	date= "23. 2. 24. 오후 1:14"
)

@DataObject
public class MultiSelect implements Serializable, Cloneable
{
    
    private static final long serialVersionUID = 1L;
    
    public String getLogicalName() {
    	return "다건 select";
    }
    
    private int DTOLenght = 0;
    
    public int getDTOLenght() {
    	return DTOLenght;
    }	
    
    public void setDTOLenght(int DTOLenght) {
    	this.DTOLenght = DTOLenght;
    }
    public void setDTOLenght(Integer DTOLenght) {
    	if ( DTOLenght == null) {
    		this.DTOLenght = 0;
    	} else{
    		this.DTOLenght = DTOLenght.intValue();
    	}
    }
    public void setDTOLenght(String DTOLenght) {
    	if  (DTOLenght==null || DTOLenght.length() == 0) {
    		this.DTOLenght = 0;
    	} else {
    		this.DTOLenght = Integer.parseInt(DTOLenght);
    	}
    }
    private List<com.so.dto.MultiSelect.SelectDTO> IncludeDTO =  null;
    
    public void clearIncludeDTO() {
    	if (IncludeDTO != null)
    		IncludeDTO.clear();
    }
    
    public void ensureCapacityIncludeDTO(int minCapacity) {
    	if (IncludeDTO == null)
    		IncludeDTO = new ArrayList<com.so.dto.MultiSelect.SelectDTO>(minCapacity);
    	else
    		((ArrayList<com.so.dto.MultiSelect.SelectDTO>)IncludeDTO).ensureCapacity(minCapacity);
    }
    		
    public MultiSelect fillIncludeDTO(int _index) {
    	ensureCapacityIncludeDTO(_index+1);
    	for (int i = sizeIncludeDTO(); i < _index + 1; i++) {
    		this.IncludeDTO.add(i, new com.so.dto.MultiSelect.SelectDTO());
    	}
    	return this;
    }
    	
    public int sizeIncludeDTO() {
    	if (IncludeDTO == null)
    		return 0;
    		
    	return IncludeDTO.size();
    }
    
    public List<com.so.dto.MultiSelect.SelectDTO> getIncludeDTO() {
    	if (this.IncludeDTO == null)
    		return null;
    
    	return this.IncludeDTO;
    }
    
    public com.so.dto.MultiSelect.SelectDTO getIncludeDTO(int _index) {
    	return (com.so.dto.MultiSelect.SelectDTO)IncludeDTO.get(_index);
    }
    
    
    public void setIncludeDTO(List<com.so.dto.MultiSelect.SelectDTO> IncludeDTO) {
    	if (IncludeDTO == null) {
    		this.IncludeDTO = null;
    	} else {
    		this.IncludeDTO = IncludeDTO;
    	}
    }
    
    
    public String toString() {
    	StringBuilder buffer = new StringBuilder();
    	
    	buffer.append("DTOLenght : ").append(DTOLenght).append("\n");   
    	buffer.append("IncludeDTO[");
    	for (int index = 0; index < sizeIncludeDTO(); index++) {
    		buffer.append("(").append(index).append(") : ").append(getIncludeDTO(index)).append(" ");
    	}
    	buffer.append("]");
    	buffer.append("\n");
    	return buffer.toString();
    }
    
    @Override
    public Object clone() {
    	MultiSelect copyObj = new MultiSelect();
    	copyObj.clone(this);
    	return copyObj;
    }
    
    public void clone(Object _multiSelect){
    	if (this == _multiSelect)
    		return;
    		
    	MultiSelect __multiSelect = (MultiSelect) _multiSelect;
    	this.setDTOLenght(__multiSelect.getDTOLenght());
    	this.clearIncludeDTO();
    	if (this.getIncludeDTO() == null && __multiSelect.getIncludeDTO() != null)
    		this.ensureCapacityIncludeDTO(__multiSelect.sizeIncludeDTO());
    		
    	for (int index = 0; index < __multiSelect.sizeIncludeDTO(); index++) {
    		com.so.dto.MultiSelect.SelectDTO _value1 = __multiSelect.getIncludeDTO(index);
    		if (_value1 == null) {
    			this.getIncludeDTO().add(index, null);
    		} else{
    			this.getIncludeDTO().add(index, (com.so.dto.MultiSelect.SelectDTO)_value1.clone());
    		}
    	}
    }
}

