package com.so.dto.MultiDelete;

import jeus.proobject.core2.annotation.DataObject;
import java.io.Serializable;
import java.lang.Cloneable;
import java.util.ArrayList;
import java.util.List;

@javax.annotation.Generated(
	value = "com.tmaxsoft.sts4.codegen.dto.DtoGenerator",
	date= "23. 2. 24. 오후 1:45"
)

@DataObject
public class MultiDelete implements Serializable, Cloneable
{
    
    private static final long serialVersionUID = 1L;
    
    public String getLogicalName() {
    	return "다건 delete";
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
    private List<com.so.dto.MultiDelete.DeleteDTO> IncludeDTO =  null;
    
    public void clearIncludeDTO() {
    	if (IncludeDTO != null)
    		IncludeDTO.clear();
    }
    
    public void ensureCapacityIncludeDTO(int minCapacity) {
    	if (IncludeDTO == null)
    		IncludeDTO = new ArrayList<com.so.dto.MultiDelete.DeleteDTO>(minCapacity);
    	else
    		((ArrayList<com.so.dto.MultiDelete.DeleteDTO>)IncludeDTO).ensureCapacity(minCapacity);
    }
    		
    public MultiDelete fillIncludeDTO(int _index) {
    	ensureCapacityIncludeDTO(_index+1);
    	for (int i = sizeIncludeDTO(); i < _index + 1; i++) {
    		this.IncludeDTO.add(i, new com.so.dto.MultiDelete.DeleteDTO());
    	}
    	return this;
    }
    	
    public int sizeIncludeDTO() {
    	if (IncludeDTO == null)
    		return 0;
    		
    	return IncludeDTO.size();
    }
    
    public List<com.so.dto.MultiDelete.DeleteDTO> getIncludeDTO() {
    	if (this.IncludeDTO == null)
    		return null;
    
    	return this.IncludeDTO;
    }
    
    public com.so.dto.MultiDelete.DeleteDTO getIncludeDTO(int _index) {
    	return (com.so.dto.MultiDelete.DeleteDTO)IncludeDTO.get(_index);
    }
    
    
    public void setIncludeDTO(List<com.so.dto.MultiDelete.DeleteDTO> IncludeDTO) {
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
    	MultiDelete copyObj = new MultiDelete();
    	copyObj.clone(this);
    	return copyObj;
    }
    
    public void clone(Object _multiDelete){
    	if (this == _multiDelete)
    		return;
    		
    	MultiDelete __multiDelete = (MultiDelete) _multiDelete;
    	this.setDTOLenght(__multiDelete.getDTOLenght());
    	this.clearIncludeDTO();
    	if (this.getIncludeDTO() == null && __multiDelete.getIncludeDTO() != null)
    		this.ensureCapacityIncludeDTO(__multiDelete.sizeIncludeDTO());
    		
    	for (int index = 0; index < __multiDelete.sizeIncludeDTO(); index++) {
    		com.so.dto.MultiDelete.DeleteDTO _value1 = __multiDelete.getIncludeDTO(index);
    		if (_value1 == null) {
    			this.getIncludeDTO().add(index, null);
    		} else{
    			this.getIncludeDTO().add(index, (com.so.dto.MultiDelete.DeleteDTO)_value1.clone());
    		}
    	}
    }
}

