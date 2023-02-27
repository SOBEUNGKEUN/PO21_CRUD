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
import java.util.ArrayList;
import java.util.List;

@javax.annotation.Generated(
	value = "com.tmaxsoft.sts4.codegen.message.MessageGenerator",
	date= "23. 2. 24. 오후 1:45"
)

@Message
public class MultiUpdateMsgJson extends AbstractMessage
{
    public byte[] marshal(Object obj) throws MarshalException {
    	MultiUpdate _MultiUpdate = (MultiUpdate)obj;
    	
    	if (_MultiUpdate == null)
    		return null;
    	
    	BufferedWriter bw = null;
    	JsonWriter jw = null;
    	
    	try{
    
    		ByteArrayOutputStream out = new ByteArrayOutputStream(); 
    		bw = new BufferedWriter( new OutputStreamWriter( out , this.encoding ) );
    		jw = new JsonWriter( bw );
    		jw.beginObject();
    
    		marshal( _MultiUpdate, jw);
    		
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
    
    
    public void marshal(com.so.dto.MultiUpdate.MultiUpdate _MultiUpdate, JsonWriter writer )throws IOException {
    
    	writer.name("DTOLenght");
    	writer.value(_MultiUpdate.getDTOLenght());
    	writer.name("IncludeDTO");
    	if (_MultiUpdate.getIncludeDTO() == null) {
    		writer.nullValue();
    	} else {
    		int compareSize1 = (Integer)_MultiUpdate.getDTOLenght() == null ? 0 : _MultiUpdate.getDTOLenght();
    
    		int arraySize1 = _MultiUpdate.getIncludeDTO().size() < compareSize1 ? _MultiUpdate.getIncludeDTO().size() : compareSize1;
    		com.so.dto.MultiUpdate.UpdateDTOMsgJson __IncludeDTO = new com.so.dto.MultiUpdate.UpdateDTOMsgJson();
    		writer.beginArray();					
    		for (int i = 0; i < arraySize1; i++) {
    			if (_MultiUpdate.getIncludeDTO().get(i) != null) {
    				writer.beginObject();
    				__IncludeDTO.marshal((com.so.dto.MultiUpdate.UpdateDTO)_MultiUpdate.getIncludeDTO().get(i), writer);
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
    
    
    public MultiUpdate unmarshal(byte[] bytes) throws UnmarshalException {
    	MultiUpdate _MultiUpdate = new MultiUpdate();
    	BufferedReader reader = null;
    	JsonReader jr = null;
    
    	if ( bytes.length <= 0)
    		return new MultiUpdate();
    
    	try{
    		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
    		jr = new JsonReader( reader );                
    		jr.beginObject();
    
    		_MultiUpdate = (MultiUpdate)unmarshal( jr,  _MultiUpdate);
    
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
    	return _MultiUpdate;
    }
    	
    public Object unmarshal(byte[] bytes, MultiUpdate dto) throws UnmarshalException {
    	
    	MultiUpdate _MultiUpdate = (MultiUpdate) dto;
    	BufferedReader reader = null;
    	JsonReader jr = null;
    	
    	if ( bytes.length <= 0)
    		return new MultiUpdate();
    	
    	try{
    		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
    		jr = new JsonReader( reader );                
    		jr.beginObject();
    
    		_MultiUpdate = (MultiUpdate)unmarshal( jr,  _MultiUpdate);
    
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
    	                       
        return _MultiUpdate;
    }
    
    public MultiUpdate unmarshal(JsonReader reader, MultiUpdate dto) throws IOException {	
    	
    	while( reader.hasNext() ){
    		String name = reader.nextName();			
    		setField(dto, reader, name);
    	}
    	
    	return dto;
    }
    	 
    protected void setField(MultiUpdate dto, JsonReader reader, String name) throws IOException {
    	
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
    				dto.setIncludeDTO(new ArrayList<com.so.dto.MultiUpdate.UpdateDTO>());
    				com.so.dto.MultiUpdate.UpdateDTOMsgJson __IncludeDTO = new com.so.dto.MultiUpdate.UpdateDTOMsgJson();
    				while( reader.hasNext() ){	
    					if (reader.peek() != JsonToken.NULL) {
    						com.so.dto.MultiUpdate.UpdateDTO ___UpdateDTO = new com.so.dto.MultiUpdate.UpdateDTO();
    						reader.beginObject();
    						dto.getIncludeDTO().add((com.so.dto.MultiUpdate.UpdateDTO)__IncludeDTO.unmarshal( reader, ___UpdateDTO ));
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
       return new MultiUpdate();
    }
        
}

