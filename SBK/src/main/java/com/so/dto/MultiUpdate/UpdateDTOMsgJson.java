package com.so.dto.MultiUpdate;
import jeus.proobject.model.message.AbstractMessage;
import jeus.proobject.model.message.exception.UnmarshalException;
import jeus.proobject.model.message.exception.MarshalException;
import jeus.proobject.core2.annotation.Message;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import jext.proobject.com.google.gson.stream.JsonReader;
import jext.proobject.com.google.gson.stream.JsonWriter;
import jext.proobject.com.google.gson.stream.JsonToken;

@javax.annotation.Generated(
	value = "com.tmaxsoft.sts4.codegen.message.MessageGenerator",
	date= "23. 2. 24. 오후 1:20"
)

@Message
public class UpdateDTOMsgJson extends AbstractMessage
{
    public byte[] marshal(Object obj) throws MarshalException {
    	UpdateDTO _UpdateDTO = (UpdateDTO)obj;
    	
    	if (_UpdateDTO == null)
    		return null;
    	
    	BufferedWriter bw = null;
    	JsonWriter jw = null;
    	
    	try{
    
    		ByteArrayOutputStream out = new ByteArrayOutputStream(); 
    		bw = new BufferedWriter( new OutputStreamWriter( out , this.encoding ) );
    		jw = new JsonWriter( bw );
    		jw.beginObject();
    
    		marshal( _UpdateDTO, jw);
    		
    		jw.endObject();
    		jw.close();
    		return out.toByteArray();
       	} catch(Exception e) {
       		throw new MarshalException(e);
       	} finally{
       		try {
       			if ( jw != null )
    				try {
    					jw.close();
    				} catch (IOException e) {
    					throw new MarshalException(e);
    				}
    		} finally {
    			if ( bw != null )
    				try {
    					bw.close();
    				} catch (IOException e) {
    					throw new MarshalException(e);
    				}
    		}
    	}
    }
    
    
    public void marshal(com.so.dto.MultiUpdate.UpdateDTO _UpdateDTO, JsonWriter writer )throws IOException {
    
    	writer.name("ename"); 
    	if (_UpdateDTO.getEname() != null) {
    		writer.value(_UpdateDTO.getEname());
    	} else {
    		writer.nullValue();
    	}
    	writer.name("empno");
    	writer.value(_UpdateDTO.getEmpno());
    }
    
    public String removeNullChar(String charString) {
    	if ( charString == null )
        	return "";
        
    	StringBuffer sb = new StringBuffer();
    	for (int i = 0 ; i<charString.length(); i++) {
    		if (charString.charAt(i) == (char)0) {
    			sb.append("");
    		} else {
    			sb.append(charString.charAt(i));
    		}
    	}
    	return sb.toString();
    }
    
    
    public UpdateDTO unmarshal(byte[] bytes) throws UnmarshalException {
    	UpdateDTO _UpdateDTO = new UpdateDTO();
    	BufferedReader reader = null;
    	JsonReader jr = null;
    
    	if ( bytes.length <= 0)
    		return new UpdateDTO();
    
    	try{
    		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
    		jr = new JsonReader( reader );                
    		jr.beginObject();
    
    		_UpdateDTO = (UpdateDTO)unmarshal( jr,  _UpdateDTO);
    
    		jr.endObject();
    		jr.close();
    
    	} catch(Exception e) {
    	    throw new UnmarshalException(e);
    	}finally{
    		try{
    			if ( jr != null )
    				try {
    					jr.close();
    				} catch (IOException e) {
    					throw new UnmarshalException(e);
    				}
    		} finally {
    			if ( reader != null )
    				try {
    					reader.close();
    				} catch (IOException e) {
    					throw new UnmarshalException(e);
    				}
    		}
    	}
    	return _UpdateDTO;
    }
    	
    public Object unmarshal(byte[] bytes, UpdateDTO dto) throws UnmarshalException {
    	
    	UpdateDTO _UpdateDTO = (UpdateDTO) dto;
    	BufferedReader reader = null;
    	JsonReader jr = null;
    	
    	if ( bytes.length <= 0)
    		return new UpdateDTO();
    	
    	try{
    		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
    		jr = new JsonReader( reader );                
    		jr.beginObject();
    
    		_UpdateDTO = (UpdateDTO)unmarshal( jr,  _UpdateDTO);
    
    		jr.endObject();
    		jr.close();
    	
    	} catch(Exception e) {
    		throw new UnmarshalException(e);
    	} finally {
    		try{
    			if ( jr != null ) 
    				try{
    					jr.close();
    				} catch (IOException e) {
    					throw new UnmarshalException(e);
    				}
    		} finally {
    			if ( reader != null )
    				try {
    					reader.close();
    				} catch (IOException e) {
    					throw new UnmarshalException(e);
    				}
    			
    		}
    	}
    	                       
        return _UpdateDTO;
    }
    
    public UpdateDTO unmarshal(JsonReader reader, UpdateDTO dto) throws IOException {	
    	
    	while( reader.hasNext() ){
    		String name = reader.nextName();			
    		setField(dto, reader, name);
    	}
    	
    	return dto;
    }
    	 
    protected void setField(UpdateDTO dto, JsonReader reader, String name) throws IOException {
    	
    	switch(name) {
    		case "ename" :
    		{	
    			if (reader.peek() != JsonToken.NULL) {
    				dto.setEname( reader.nextString());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "empno" :
    		{	
    			if (reader.peek() != JsonToken.NULL) {
    				dto.setEmpno( reader.nextInt());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		default :
    		reader.skipValue();
    			break;
    	}
    }
    
    @Override
    public Object getDtoInstance() {        
       return new UpdateDTO();
    }
        
}

