package com.so.dto.MultiSelect;
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
	date= "23. 2. 24. 오후 1:14"
)

@Message
public class MultiSelectMsgJson extends AbstractMessage
{
    public byte[] marshal(Object obj) throws MarshalException {
    	MultiSelect _MultiSelect = (MultiSelect)obj;
    	
    	if (_MultiSelect == null)
    		return null;
    	
    	BufferedWriter bw = null;
    	JsonWriter jw = null;
    	
    	try{
    
    		ByteArrayOutputStream out = new ByteArrayOutputStream(); 
    		bw = new BufferedWriter( new OutputStreamWriter( out , this.encoding ) );
    		jw = new JsonWriter( bw );
    		jw.beginObject();
    
    		marshal( _MultiSelect, jw);
    		
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
    
    
    public void marshal(com.so.dto.MultiSelect.MultiSelect _MultiSelect, JsonWriter writer )throws IOException {
    
    	writer.name("DTOLenght");
    	writer.value(_MultiSelect.getDTOLenght());
    	writer.name("IncludeDTO");
    	if (_MultiSelect.getIncludeDTO() == null) {
    		writer.nullValue();
    	} else {
    		int compareSize1 = (Integer)_MultiSelect.getDTOLenght() == null ? 0 : _MultiSelect.getDTOLenght();
    
    		int arraySize1 = _MultiSelect.getIncludeDTO().size() < compareSize1 ? _MultiSelect.getIncludeDTO().size() : compareSize1;
    		com.so.dto.MultiSelect.SelectDTOMsgJson __IncludeDTO = new com.so.dto.MultiSelect.SelectDTOMsgJson();
    		writer.beginArray();					
    		for (int i = 0; i < arraySize1; i++) {
    			if (_MultiSelect.getIncludeDTO().get(i) != null) {
    				writer.beginObject();
    				__IncludeDTO.marshal((com.so.dto.MultiSelect.SelectDTO)_MultiSelect.getIncludeDTO().get(i), writer);
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
    
    
    public MultiSelect unmarshal(byte[] bytes) throws UnmarshalException {
    	MultiSelect _MultiSelect = new MultiSelect();
    	BufferedReader reader = null;
    	JsonReader jr = null;
    
    	if ( bytes.length <= 0)
    		return new MultiSelect();
    
    	try{
    		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
    		jr = new JsonReader( reader );                
    		jr.beginObject();
    
    		_MultiSelect = (MultiSelect)unmarshal( jr,  _MultiSelect);
    
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
    	return _MultiSelect;
    }
    	
    public Object unmarshal(byte[] bytes, MultiSelect dto) throws UnmarshalException {
    	
    	MultiSelect _MultiSelect = (MultiSelect) dto;
    	BufferedReader reader = null;
    	JsonReader jr = null;
    	
    	if ( bytes.length <= 0)
    		return new MultiSelect();
    	
    	try{
    		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
    		jr = new JsonReader( reader );                
    		jr.beginObject();
    
    		_MultiSelect = (MultiSelect)unmarshal( jr,  _MultiSelect);
    
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
    	                       
        return _MultiSelect;
    }
    
    public MultiSelect unmarshal(JsonReader reader, MultiSelect dto) throws IOException {	
    	
    	while( reader.hasNext() ){
    		String name = reader.nextName();			
    		setField(dto, reader, name);
    	}
    	
    	return dto;
    }
    	 
    protected void setField(MultiSelect dto, JsonReader reader, String name) throws IOException {
    	
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
    				dto.setIncludeDTO(new ArrayList<com.so.dto.MultiSelect.SelectDTO>());
    				com.so.dto.MultiSelect.SelectDTOMsgJson __IncludeDTO = new com.so.dto.MultiSelect.SelectDTOMsgJson();
    				while( reader.hasNext() ){	
    					if (reader.peek() != JsonToken.NULL) {
    						com.so.dto.MultiSelect.SelectDTO ___SelectDTO = new com.so.dto.MultiSelect.SelectDTO();
    						reader.beginObject();
    						dto.getIncludeDTO().add((com.so.dto.MultiSelect.SelectDTO)__IncludeDTO.unmarshal( reader, ___SelectDTO ));
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
       return new MultiSelect();
    }
        
}

