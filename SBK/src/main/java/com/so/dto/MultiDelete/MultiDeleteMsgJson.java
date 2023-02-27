package com.so.dto.MultiDelete;
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
import java.util.ArrayList;
import java.util.List;

@javax.annotation.Generated(
	value = "com.tmaxsoft.sts4.codegen.message.MessageGenerator",
	date= "23. 2. 24. 오후 1:45"
)

@Message
public class MultiDeleteMsgJson extends AbstractMessage
{
    public byte[] marshal(Object obj) throws MarshalException {
    	MultiDelete _MultiDelete = (MultiDelete)obj;
    	
    	if (_MultiDelete == null)
    		return null;
    	
    	BufferedWriter bw = null;
    	JsonWriter jw = null;
    	
    	try{
    
    		ByteArrayOutputStream out = new ByteArrayOutputStream(); 
    		bw = new BufferedWriter( new OutputStreamWriter( out , this.encoding ) );
    		jw = new JsonWriter( bw );
    		jw.beginObject();
    
    		marshal( _MultiDelete, jw);
    		
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
    
    
    public void marshal(com.so.dto.MultiDelete.MultiDelete _MultiDelete, JsonWriter writer )throws IOException {
    
    	writer.name("DTOLenght");
    	writer.value(_MultiDelete.getDTOLenght());
    	writer.name("IncludeDTO");
    	if (_MultiDelete.getIncludeDTO() == null) {
    		writer.nullValue();
    	} else {
    		int compareSize1 = (Integer)_MultiDelete.getDTOLenght() == null ? 0 : _MultiDelete.getDTOLenght();
    
    		int arraySize1 = _MultiDelete.getIncludeDTO().size() < compareSize1 ? _MultiDelete.getIncludeDTO().size() : compareSize1;
    		com.so.dto.MultiDelete.DeleteDTOMsgJson __IncludeDTO = new com.so.dto.MultiDelete.DeleteDTOMsgJson();
    		writer.beginArray();					
    		for (int i = 0; i < arraySize1; i++) {
    			if (_MultiDelete.getIncludeDTO().get(i) != null) {
    				writer.beginObject();
    				__IncludeDTO.marshal((com.so.dto.MultiDelete.DeleteDTO)_MultiDelete.getIncludeDTO().get(i), writer);
    				writer.endObject();
    			} else {
    				writer.nullValue();
    			}
    		}
    		writer.endArray();
    	}
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
    
    
    public MultiDelete unmarshal(byte[] bytes) throws UnmarshalException {
    	MultiDelete _MultiDelete = new MultiDelete();
    	BufferedReader reader = null;
    	JsonReader jr = null;
    
    	if ( bytes.length <= 0)
    		return new MultiDelete();
    
    	try{
    		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
    		jr = new JsonReader( reader );                
    		jr.beginObject();
    
    		_MultiDelete = (MultiDelete)unmarshal( jr,  _MultiDelete);
    
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
    	return _MultiDelete;
    }
    	
    public Object unmarshal(byte[] bytes, MultiDelete dto) throws UnmarshalException {
    	
    	MultiDelete _MultiDelete = (MultiDelete) dto;
    	BufferedReader reader = null;
    	JsonReader jr = null;
    	
    	if ( bytes.length <= 0)
    		return new MultiDelete();
    	
    	try{
    		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
    		jr = new JsonReader( reader );                
    		jr.beginObject();
    
    		_MultiDelete = (MultiDelete)unmarshal( jr,  _MultiDelete);
    
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
    	                       
        return _MultiDelete;
    }
    
    public MultiDelete unmarshal(JsonReader reader, MultiDelete dto) throws IOException {	
    	
    	while( reader.hasNext() ){
    		String name = reader.nextName();			
    		setField(dto, reader, name);
    	}
    	
    	return dto;
    }
    	 
    protected void setField(MultiDelete dto, JsonReader reader, String name) throws IOException {
    	
    	switch(name) {
    		case "DTOLenght" :
    		{	
    			if (reader.peek() != JsonToken.NULL) {
    				dto.setDTOLenght( reader.nextInt());
    			} else {
    				reader.nextNull();
    			}
    			break;
    		}	
    		case "IncludeDTO" :
    		{
    			if (reader.peek() != JsonToken.NULL) {
    				reader.beginArray();
    				dto.setIncludeDTO(new ArrayList<com.so.dto.MultiDelete.DeleteDTO>());
    				com.so.dto.MultiDelete.DeleteDTOMsgJson __IncludeDTO = new com.so.dto.MultiDelete.DeleteDTOMsgJson();
    				while( reader.hasNext() ){	
    					if (reader.peek() != JsonToken.NULL) {
    						com.so.dto.MultiDelete.DeleteDTO ___DeleteDTO = new com.so.dto.MultiDelete.DeleteDTO();
    						reader.beginObject();
    						dto.getIncludeDTO().add((com.so.dto.MultiDelete.DeleteDTO)__IncludeDTO.unmarshal( reader, ___DeleteDTO ));
    						reader.endObject();
    					} else {
    						reader.nextNull();
    					}
    				}
    				reader.endArray();
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
       return new MultiDelete();
    }
        
}

