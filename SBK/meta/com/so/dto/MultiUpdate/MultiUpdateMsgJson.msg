<proobject:message
    xmlns:proobject="http://www.tmax.co.kr/proobject/message"
    logicalName="다건 updateMsgJson"
    resourceId="81bd22ddc0a8d0a82662650888f82e45"
    resourceName="MultiUpdateMsgJson"
    resourcePackage="com.so.dto.MultiUpdate"
    resourcePath="com/so/dto/MultiUpdate"
    resourceType="MESSAGE"
    status="DEV"
    arraySizeCheck="true"
    dtoId="81a63dd7c0a8d0a81ce991d7d095f343"
    dtoName="MultiUpdate"
    dtoPath="com/so/dto/MultiUpdate"
    messageType="JSON">
  <proobject:messageField
      align="None"
      array=""
      attributeTag=""
      bitmapNo=""
      comments=""
      dateFormat="yyyy.MM.dd HH.mm.ss"
      decimal="-1"
      delimiter=""
      dtoArray=""
      encodeOption="Char"
      fieldControlTag=""
      fieldType="int"
      fill=""
      handler=""
      includeMessageName=""
      includeMessagePath=""
      length="20"
      logicalName="DTOLenght"
      maskingEndIndex="-1"
      maskingRange=""
      maskingStartIndex="-1"
      metaId=""
      physicalName="DTOLenght"
      point="true"
      referenceFieldId=""
      sign="false"/>
  <proobject:messageField
      align="None"
      array="DTOLenght"
      attributeTag=""
      bitmapNo=""
      comments=""
      dateFormat="yyyy.MM.dd HH.mm.ss"
      decimal="-1"
      delimiter=""
      dtoArray="DTOLenght"
      encodeOption="Char"
      fieldControlTag=""
      fieldType="include"
      fill=""
      handler=""
      includeMessageName="UpdateDTOMsgJson"
      includeMessagePath="com/so/dto/MultiUpdate"
      length=""
      logicalName="IncludeDTO"
      maskingEndIndex="-1"
      maskingRange=""
      maskingStartIndex="-1"
      metaId=""
      physicalName="IncludeDTO"
      point="true"
      referencedtoName="UpdateDTO"
      referenceFieldId=""
      sign="false"/>
</proobject:message>