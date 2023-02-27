package com.so.dto.MultiUpdate;

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
public class MultiUpdate implements Serializable, Cloneable
{
    
    private static final long serialVersionUID = 1L;
    
    public String getLogicalName() {
    	return "다건 update";
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
    private List<com.so.dto.MultiUpdate.UpdateDTO> IncludeDTO =  null;
    
    public void clearIncludeDTO() {
    	if (IncludeDTO != null)
    		IncludeDTO.clear();
    }
    
    public void ensureCapacityIncludeDTO(int minCapacity) {
    	if (IncludeDTO == null)
    		IncludeDTO = new ArrayList<com.so.dto.MultiUpdate.UpdateDTO>(minCapacity);
    	else
    		((ArrayList<com.so.dto.MultiUpdate.UpdateDTO>)IncludeDTO).ensureCapacity(minCapacity);
    }
    		
    public MultiUpdate fillIncludeDTO(int _index) {
    	ensureCapacityIncludeDTO(_index+1);
    	for (int i = sizeIncludeDTO(); i < _index + 1; i++) {
    		this.IncludeDTO.add(i, new com.so.dto.MultiUpdate.UpdateDTO());
    	}
    	return this;
    }
    	
    public int sizeIncludeDTO() {
    	if (IncludeDTO == null)
    		return 0;
    		
    	return IncludeDTO.size();
    }
    
    public List<com.so.dto.MultiUpdate.UpdateDTO> getIncludeDTO() {
    	if (this.IncludeDTO == null)
    		return null;
    
    	return this.IncludeDTO;
    }
    
    public com.so.dto.MultiUpdate.UpdateDTO getIncludeDTO(int _index) {
    	return (com.so.dto.MultiUpdate.UpdateDTO)IncludeDTO.get(_index);
    }
    
    
    public void setIncludeDTO(List<com.so.dto.MultiUpdate.UpdateDTO> IncludeDTO) {
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
    	MultiUpdate copyObj = new MultiUpdate();
    	copyObj.clone(this);
    	return copyObj;
    }
    
    public void clone(Object _multiUpdate){
    	if (this == _multiUpdate)
    		return;
    		
    	MultiUpdate __multiUpdate = (MultiUpdate) _multiUpdate;
    	this.setDTOLenght(__multiUpdate.getDTOLenght());
    	this.clearIncludeDTO();
    	if (this.getIncludeDTO() == null && __multiUpdate.getIncludeDTO() != null)
    		this.ensureCapacityIncludeDTO(__multiUpdate.sizeIncludeDTO());
    		
    	for (int index = 0; index < __multiUpdate.sizeIncludeDTO(); index++) {
    		com.so.dto.MultiUpdate.UpdateDTO _value1 = __multiUpdate.getIncludeDTO(index);
    		if (_value1 == null) {
    			this.getIncludeDTO().add(index, null);
    		} else{
    			this.getIncludeDTO().add(index, (com.so.dto.MultiUpdate.UpdateDTO)_value1.clone());
    		}
    	}
    }
}

