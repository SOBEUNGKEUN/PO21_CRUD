<proobject:message
    xmlns:proobject="http://www.tmax.co.kr/proobject/message"
    logicalName="다건 selectMsgJson"
    resourceId="81a16cc9c0a8d0a85a0d61864d4ace3b"
    resourceName="MultiSelectMsgJson"
    resourcePackage="com.so.dto.MultiSelect"
    resourcePath="com/so/dto/MultiSelect"
    resourceType="MESSAGE"
    status="DEV"
    arraySizeCheck="true"
    dtoId="819d79c0c0a8d0a87f6ea8665726d43f"
    dtoName="MultiSelect"
    dtoPath="com/so/dto/MultiSelect"
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
      includeMessageName="SelectDTOMsgJson"
      includeMessagePath="com/so/dto/MultiSelect"
      length=""
      logicalName="IncludeDTO"
      maskingEndIndex="-1"
      maskingRange=""
      maskingStartIndex="-1"
      metaId=""
      physicalName="IncludeDTO"
      point="true"
      referencedtoName="SelectDTO"
      referenceFieldId=""
      sign="false"/>
</proobject:message>