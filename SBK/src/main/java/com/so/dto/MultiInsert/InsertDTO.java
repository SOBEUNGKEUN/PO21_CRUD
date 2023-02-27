package com.so.dto.MultiInsert;

import jeus.proobject.core2.annotation.DataObject;
import java.io.Serializable;
import java.lang.Cloneable;

@javax.annotation.Generated(
	value = "com.tmaxsoft.sts4.codegen.dto.DtoGenerator",
	date= "23. 2. 24. 오후 1:18"
)

@DataObject
public class InsertDTO implements Serializable, Cloneable
{
    
    private static final long serialVersionUID = 1L;
    
    public String getLogicalName() {
    	return "insert";
    }
    
    private String ename = null;
    
    public String getEname() {
    	return ename;
    }	
    
    public void setEname(String ename) {
    	if (ename == null) {
    		this.ename = null;
    	} else {
    		this.ename = ename;
    	}
    }
    private int empno = 0;
    
    public int getEmpno() {
    	return empno;
    }	
    
    public void setEmpno(int empno) {
    	this.empno = empno;
    }
    public void setEmpno(Integer empno) {
    	if ( empno == null) {
    		this.empno = 0;
    	} else{
    		this.empno = empno.intValue();
    	}
    }
    public void setEmpno(String empno) {
    	if  (empno==null || empno.length() == 0) {
    		this.empno = 0;
    	} else {
    		this.empno = Integer.parseInt(empno);
    	}
    }
    
    public String toString() {
    	StringBuilder buffer = new StringBuilder();
    	
    	buffer.append("ename : ").append(ename).append("\n");   
    	buffer.append("empno : ").append(empno).append("\n");   
    	return buffer.toString();
    }
    
    @Override
    public Object clone() {
    	InsertDTO copyObj = new InsertDTO();
    	copyObj.clone(this);
    	return copyObj;
    }
    
    public void clone(Object _insertDTO){
    	if (this == _insertDTO)
    		return;
    		
    	InsertDTO __insertDTO = (InsertDTO) _insertDTO;
    	this.setEname(__insertDTO.getEname());
    	this.setEmpno(__insertDTO.getEmpno());
    }
}

