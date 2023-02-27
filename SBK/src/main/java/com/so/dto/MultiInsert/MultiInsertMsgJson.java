package com.so.dto.MultiInsert;
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
	date= "23. 2. 24. 오후 1:44"
)

@Message
public class MultiInsertMsgJson extends AbstractMessage
{
    public byte[] marshal(Object obj) throws MarshalException {
    	MultiInsert _MultiInsert = (MultiInsert)obj;
    	
    	if (_MultiInsert == null)
    		return null;
    	
    	BufferedWriter bw = null;
    	JsonWriter jw = null;
    	
    	try{
    
    		ByteArrayOutputStream out = new ByteArrayOutputStream(); 
    		bw = new BufferedWriter( new OutputStreamWriter( out , this.encoding ) );
    		jw = new JsonWriter( bw );
    		jw.beginObject();
    
    		marshal( _MultiInsert, jw);
    		
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
    
    
    public void marshal(com.so.dto.MultiInsert.MultiInsert _MultiInsert, JsonWriter writer )throws IOException {
    
    	writer.name("DTOLenght");
    	writer.value(_MultiInsert.getDTOLenght());
    	writer.name("IncludeDTO");
    	if (_MultiInsert.getIncludeDTO() == null) {
    		writer.nullValue();
    	} else {
    		int compareSize1 = (Integer)_MultiInsert.getDTOLenght() == null ? 0 : _MultiInsert.getDTOLenght();
    
    		int arraySize1 = _MultiInsert.getIncludeDTO().size() < compareSize1 ? _MultiInsert.getIncludeDTO().size() : compareSize1;
    		com.so.dto.MultiInsert.InsertDTOMsgJson __IncludeDTO = new com.so.dto.MultiInsert.InsertDTOMsgJson();
    		writer.beginArray();					
    		for (int i = 0; i < arraySize1; i++) {
    			if (_MultiInsert.getIncludeDTO().get(i) != null) {
    				writer.beginObject();
    				__IncludeDTO.marshal((com.so.dto.MultiInsert.InsertDTO)_MultiInsert.getIncludeDTO().get(i), writer);
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
    
    
    public MultiInsert unmarshal(byte[] bytes) throws UnmarshalException {
    	MultiInsert _MultiInsert = new MultiInsert();
    	BufferedReader reader = null;
    	JsonReader jr = null;
    
    	if ( bytes.length <= 0)
    		return new MultiInsert();
    
    	try{
    		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
    		jr = new JsonReader( reader );                
    		jr.beginObject();
    
    		_MultiInsert = (MultiInsert)unmarshal( jr,  _MultiInsert);
    
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
    	return _MultiInsert;
    }
    	
    public Object unmarshal(byte[] bytes, MultiInsert dto) throws UnmarshalException {
    	
    	MultiInsert _MultiInsert = (MultiInsert) dto;
    	BufferedReader reader = null;
    	JsonReader jr = null;
    	
    	if ( bytes.length <= 0)
    		return new MultiInsert();
    	
    	try{
    		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
    		jr = new JsonReader( reader );                
    		jr.beginObject();
    
    		_MultiInsert = (MultiInsert)unmarshal( jr,  _MultiInsert);
    
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
    	                       
        return _MultiInsert;
    }
    
    public MultiInsert unmarshal(JsonReader reader, MultiInsert dto) throws IOException {	
    	
    	while( reader.hasNext() ){
    		String name = reader.nextName();			
    		setField(dto, reader, name);
    	}
    	
    	return dto;
    }
    	 
    protected void setField(MultiInsert dto, JsonReader reader, String name) throws IOException {
    	
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
    				dto.setIncludeDTO(new ArrayList<com.so.dto.MultiInsert.InsertDTO>());
    				com.so.dto.MultiInsert.InsertDTOMsgJson __IncludeDTO = new com.so.dto.MultiInsert.InsertDTOMsgJson();
    				while( reader.hasNext() ){	
    					if (reader.peek() != JsonToken.NULL) {
    						com.so.dto.MultiInsert.InsertDTO ___InsertDTO = new com.so.dto.MultiInsert.InsertDTO();
    						reader.beginObject();
    						dto.getIncludeDTO().add((com.so.dto.MultiInsert.InsertDTO)__IncludeDTO.unmarshal( reader, ___InsertDTO ));
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
       return new MultiInsert();
    }
        
}

