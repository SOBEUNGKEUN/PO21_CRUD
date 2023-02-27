package com.so.controller;

import com.so.service.crud.SelectService;
import com.so.dto.MultiSelect.MultiSelect;
import com.so.dto.MultiSelect.MultiSelectMsgJson;
import com.so.service.crud.InsertService;
import com.so.dto.MultiInsert.MultiInsert;
import com.so.dto.MultiInsert.MultiInsertMsgJson;
import com.so.service.crud.UpdateService;
import com.so.dto.MultiUpdate.MultiUpdate;
import com.so.dto.MultiUpdate.MultiUpdateMsgJson;
import com.so.service.crud.DeleteService;
import com.so.dto.MultiDelete.MultiDelete;
import com.so.dto.MultiDelete.MultiDeleteMsgJson;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.google.common.base.Throwables;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.http.HttpStatus;
import jeus.proobject.model.context.Header;
import jeus.proobject.model.network.ProObjectRequest;
import jeus.proobject.model.network.context.RequestContext;
import jeus.proobject.network.protocol.ProObjectHttpProtocol;
import jeus.proobject.core2.service.ServiceName;
import jeus.proobject.network.protocol.ExceptionInfo;
import jeus.proobject.model.message.AbstractMessage;
import jeus.proobject.model.promapper.ProMapperMessageType;
import com.tmax.proobject.service.util.SpringControllerUtil;
import com.tmax.proobject.runtime.context.ServiceContextHolder;

@javax.annotation.Generated(
    value = "com.tmaxsoft.sts4.codegen.controller.SpringControllerGenerator",
    date= "23. 2. 27. 오후 4:29",
    comments= "ServiceGroupController"
)

@Controller
public class SpringServiceGroupController
{
    @Autowired
    SelectService _SelectService;
    
    @Autowired
    InsertService _InsertService;
    
    @Autowired
    UpdateService _UpdateService;
    
    @Autowired
    DeleteService _DeleteService;
    
    @RequestMapping(value="/SBK/ServiceGroup/SelectService_service", method=RequestMethod.POST)
    public void executeSelectService_service(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        ProMapperMessageType msgType = null;
        try {
            if(request.getContentType().equals("application/json")) {
                msgType = ProMapperMessageType.JSON;
                response.setContentType("application/json");
            } else if (request.getContentType().equals("text/plain")) {
                if(request.getHeader("Message-Type") != null && request.getHeader("Message-Type").equals("Delimiter")) {
                    msgType = ProMapperMessageType.DELIMITER;
                    response.setContentType("text/plain");
                    response.setHeader("Message-Type", "Delimiter");
                } else {
                    throw new Exception("Unsupported MessageType");
                }
            }
        } catch (Throwable e) {
            response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
            String errorMsg = "{\"exception\" : \" MessageType Error : " + Throwables.getStackTraceAsString(e) + "\"}";
            response.getOutputStream().write(errorMsg.getBytes());
            return;
        }
        ProObjectHttpProtocol protocol;
        ServiceName serviceName = new ServiceName("SBK.ServiceGroup.SelectService_service");
        
        RequestContext requestContext = SpringControllerUtil.createRequestContext(serviceName);
        ServiceContextHolder.getServiceContext().setRequestContext(requestContext);
                
        AbstractMessage headerMsg = new jeus.proobject.model.context.HeaderMsgJson();
        {
            AbstractMessage msg = new MultiSelectMsgJson();
            protocol = SpringControllerUtil.unmarshalRequestBody(request.getInputStream(), msg, headerMsg, msgType);
        }
        
        SpringControllerUtil.setHeaderInformation(requestContext, protocol.getHeader());
        
        MultiSelect svcInput = (MultiSelect)protocol.getDto();
        MultiSelect svcOutput = null;
        
        SpringControllerUtil.handlePreService(serviceName, requestContext, svcInput);
        
        try {
            svcOutput = _SelectService.selectService(svcInput);
        } catch (Throwable e) {
            try {
                SpringControllerUtil.handleServiceError(serviceName, requestContext, svcInput, e);
            } catch (Throwable e1) {
                response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
                String errorMsg = "{\"exception\" : \"ServiceError Handling Failed : " + Throwables.getStackTraceAsString(e1) + "\"}";
                response.getOutputStream().write(errorMsg.getBytes());
                ServiceContextHolder.removeServiceContext();
                return;
            }
            response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
            ProObjectHttpProtocol responseErrorProtocol = new ProObjectHttpProtocol();
            ProObjectRequest requestInfo = requestContext.getRequest();
            Header header = requestInfo.getHeader();
            responseErrorProtocol.setHeader(header);
            
            ExceptionInfo exception = new ExceptionInfo();
            exception.setCode(requestInfo.getResponseCode());
            exception.setName(requestInfo.getResponseDetailMsgCode());
            exception.setMessage("exception : Service Failed : " + e.getMessage());
            exception.setStackTrace(Throwables.getStackTraceAsString(e));
            responseErrorProtocol.setException(exception);
            byte[] errorMsg =  SpringControllerUtil.marshalErrorResponseBody(responseErrorProtocol, headerMsg, msgType);
            response.getOutputStream().write(errorMsg);
            ServiceContextHolder.removeServiceContext();
            return;
        }
        
        SpringControllerUtil.handlePostService(serviceName, requestContext, svcInput, svcOutput);
        ServiceContextHolder.removeServiceContext();
        
        int statusCode = requestContext.getRequest().getStatusCode();
        if(statusCode != 0) {
            response.setStatus(statusCode);
        } else {
            response.setStatus(HttpStatus.OK.value());
        }
        
        protocol.setDto(svcOutput);
        byte[] outputProtocolBytes;
        {
            AbstractMessage msg = new MultiSelectMsgJson();
            outputProtocolBytes = SpringControllerUtil.marshalResponseBody(protocol, msg, headerMsg, msgType);
        }
        response.getOutputStream().write(outputProtocolBytes);
        
        return;
    }
    
    @RequestMapping(value="/SBK/ServiceGroup/InsertService_service", method=RequestMethod.POST)
    public void executeInsertService_service(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        ProMapperMessageType msgType = null;
        try {
            if(request.getContentType().equals("application/json")) {
                msgType = ProMapperMessageType.JSON;
                response.setContentType("application/json");
            } else if (request.getContentType().equals("text/plain")) {
                if(request.getHeader("Message-Type") != null && request.getHeader("Message-Type").equals("Delimiter")) {
                    msgType = ProMapperMessageType.DELIMITER;
                    response.setContentType("text/plain");
                    response.setHeader("Message-Type", "Delimiter");
                } else {
                    throw new Exception("Unsupported MessageType");
                }
            }
        } catch (Throwable e) {
            response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
            String errorMsg = "{\"exception\" : \" MessageType Error : " + Throwables.getStackTraceAsString(e) + "\"}";
            response.getOutputStream().write(errorMsg.getBytes());
            return;
        }
        ProObjectHttpProtocol protocol;
        ServiceName serviceName = new ServiceName("SBK.ServiceGroup.InsertService_service");
        
        RequestContext requestContext = SpringControllerUtil.createRequestContext(serviceName);
        ServiceContextHolder.getServiceContext().setRequestContext(requestContext);
                
        AbstractMessage headerMsg = new jeus.proobject.model.context.HeaderMsgJson();
        {
            AbstractMessage msg = new MultiInsertMsgJson();
            protocol = SpringControllerUtil.unmarshalRequestBody(request.getInputStream(), msg, headerMsg, msgType);
        }
        
        SpringControllerUtil.setHeaderInformation(requestContext, protocol.getHeader());
        
        MultiInsert svcInput = (MultiInsert)protocol.getDto();
        MultiInsert svcOutput = null;
        
        SpringControllerUtil.handlePreService(serviceName, requestContext, svcInput);
        
        try {
            svcOutput = _InsertService.insertService(svcInput);
        } catch (Throwable e) {
            try {
                SpringControllerUtil.handleServiceError(serviceName, requestContext, svcInput, e);
            } catch (Throwable e1) {
                response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
                String errorMsg = "{\"exception\" : \"ServiceError Handling Failed : " + Throwables.getStackTraceAsString(e1) + "\"}";
                response.getOutputStream().write(errorMsg.getBytes());
                ServiceContextHolder.removeServiceContext();
                return;
            }
            response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
            ProObjectHttpProtocol responseErrorProtocol = new ProObjectHttpProtocol();
            ProObjectRequest requestInfo = requestContext.getRequest();
            Header header = requestInfo.getHeader();
            responseErrorProtocol.setHeader(header);
            
            ExceptionInfo exception = new ExceptionInfo();
            exception.setCode(requestInfo.getResponseCode());
            exception.setName(requestInfo.getResponseDetailMsgCode());
            exception.setMessage("exception : Service Failed : " + e.getMessage());
            exception.setStackTrace(Throwables.getStackTraceAsString(e));
            responseErrorProtocol.setException(exception);
            byte[] errorMsg =  SpringControllerUtil.marshalErrorResponseBody(responseErrorProtocol, headerMsg, msgType);
            response.getOutputStream().write(errorMsg);
            ServiceContextHolder.removeServiceContext();
            return;
        }
        
        SpringControllerUtil.handlePostService(serviceName, requestContext, svcInput, svcOutput);
        ServiceContextHolder.removeServiceContext();
        
        int statusCode = requestContext.getRequest().getStatusCode();
        if(statusCode != 0) {
            response.setStatus(statusCode);
        } else {
            response.setStatus(HttpStatus.OK.value());
        }
        
        protocol.setDto(svcOutput);
        byte[] outputProtocolBytes;
        {
            AbstractMessage msg = new MultiInsertMsgJson();
            outputProtocolBytes = SpringControllerUtil.marshalResponseBody(protocol, msg, headerMsg, msgType);
        }
        response.getOutputStream().write(outputProtocolBytes);
        
        return;
    }
    
    @RequestMapping(value="/SBK/ServiceGroup/UpdateService_service", method=RequestMethod.POST)
    public void executeUpdateService_service(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        ProMapperMessageType msgType = null;
        try {
            if(request.getContentType().equals("application/json")) {
                msgType = ProMapperMessageType.JSON;
                response.setContentType("application/json");
            } else if (request.getContentType().equals("text/plain")) {
                if(request.getHeader("Message-Type") != null && request.getHeader("Message-Type").equals("Delimiter")) {
                    msgType = ProMapperMessageType.DELIMITER;
                    response.setContentType("text/plain");
                    response.setHeader("Message-Type", "Delimiter");
                } else {
                    throw new Exception("Unsupported MessageType");
                }
            }
        } catch (Throwable e) {
            response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
            String errorMsg = "{\"exception\" : \" MessageType Error : " + Throwables.getStackTraceAsString(e) + "\"}";
            response.getOutputStream().write(errorMsg.getBytes());
            return;
        }
        ProObjectHttpProtocol protocol;
        ServiceName serviceName = new ServiceName("SBK.ServiceGroup.UpdateService_service");
        
        RequestContext requestContext = SpringControllerUtil.createRequestContext(serviceName);
        ServiceContextHolder.getServiceContext().setRequestContext(requestContext);
                
        AbstractMessage headerMsg = new jeus.proobject.model.context.HeaderMsgJson();
        {
            AbstractMessage msg = new MultiUpdateMsgJson();
            protocol = SpringControllerUtil.unmarshalRequestBody(request.getInputStream(), msg, headerMsg, msgType);
        }
        
        SpringControllerUtil.setHeaderInformation(requestContext, protocol.getHeader());
        
        MultiUpdate svcInput = (MultiUpdate)protocol.getDto();
        MultiUpdate svcOutput = null;
        
        SpringControllerUtil.handlePreService(serviceName, requestContext, svcInput);
        
        try {
            svcOutput = _UpdateService.updateService(svcInput);
        } catch (Throwable e) {
            try {
                SpringControllerUtil.handleServiceError(serviceName, requestContext, svcInput, e);
            } catch (Throwable e1) {
                response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
                String errorMsg = "{\"exception\" : \"ServiceError Handling Failed : " + Throwables.getStackTraceAsString(e1) + "\"}";
                response.getOutputStream().write(errorMsg.getBytes());
                ServiceContextHolder.removeServiceContext();
                return;
            }
            response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
            ProObjectHttpProtocol responseErrorProtocol = new ProObjectHttpProtocol();
            ProObjectRequest requestInfo = requestContext.getRequest();
            Header header = requestInfo.getHeader();
            responseErrorProtocol.setHeader(header);
            
            ExceptionInfo exception = new ExceptionInfo();
            exception.setCode(requestInfo.getResponseCode());
            exception.setName(requestInfo.getResponseDetailMsgCode());
            exception.setMessage("exception : Service Failed : " + e.getMessage());
            exception.setStackTrace(Throwables.getStackTraceAsString(e));
            responseErrorProtocol.setException(exception);
            byte[] errorMsg =  SpringControllerUtil.marshalErrorResponseBody(responseErrorProtocol, headerMsg, msgType);
            response.getOutputStream().write(errorMsg);
            ServiceContextHolder.removeServiceContext();
            return;
        }
        
        SpringControllerUtil.handlePostService(serviceName, requestContext, svcInput, svcOutput);
        ServiceContextHolder.removeServiceContext();
        
        int statusCode = requestContext.getRequest().getStatusCode();
        if(statusCode != 0) {
            response.setStatus(statusCode);
        } else {
            response.setStatus(HttpStatus.OK.value());
        }
        
        protocol.setDto(svcOutput);
        byte[] outputProtocolBytes;
        {
            AbstractMessage msg = new MultiUpdateMsgJson();
            outputProtocolBytes = SpringControllerUtil.marshalResponseBody(protocol, msg, headerMsg, msgType);
        }
        response.getOutputStream().write(outputProtocolBytes);
        
        return;
    }
    
    @RequestMapping(value="/SBK/ServiceGroup/DeleteService_service", method=RequestMethod.POST)
    public void executeDeleteService_service(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        ProMapperMessageType msgType = null;
        try {
            if(request.getContentType().equals("application/json")) {
                msgType = ProMapperMessageType.JSON;
                response.setContentType("application/json");
            } else if (request.getContentType().equals("text/plain")) {
                if(request.getHeader("Message-Type") != null && request.getHeader("Message-Type").equals("Delimiter")) {
                    msgType = ProMapperMessageType.DELIMITER;
                    response.setContentType("text/plain");
                    response.setHeader("Message-Type", "Delimiter");
                } else {
                    throw new Exception("Unsupported MessageType");
                }
            }
        } catch (Throwable e) {
            response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
            String errorMsg = "{\"exception\" : \" MessageType Error : " + Throwables.getStackTraceAsString(e) + "\"}";
            response.getOutputStream().write(errorMsg.getBytes());
            return;
        }
        ProObjectHttpProtocol protocol;
        ServiceName serviceName = new ServiceName("SBK.ServiceGroup.DeleteService_service");
        
        RequestContext requestContext = SpringControllerUtil.createRequestContext(serviceName);
        ServiceContextHolder.getServiceContext().setRequestContext(requestContext);
                
        AbstractMessage headerMsg = new jeus.proobject.model.context.HeaderMsgJson();
        {
            AbstractMessage msg = new MultiDeleteMsgJson();
            protocol = SpringControllerUtil.unmarshalRequestBody(request.getInputStream(), msg, headerMsg, msgType);
        }
        
        SpringControllerUtil.setHeaderInformation(requestContext, protocol.getHeader());
        
        MultiDelete svcInput = (MultiDelete)protocol.getDto();
        MultiDelete svcOutput = null;
        
        SpringControllerUtil.handlePreService(serviceName, requestContext, svcInput);
        
        try {
            svcOutput = _DeleteService.deleteService(svcInput);
        } catch (Throwable e) {
            try {
                SpringControllerUtil.handleServiceError(serviceName, requestContext, svcInput, e);
            } catch (Throwable e1) {
                response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
                String errorMsg = "{\"exception\" : \"ServiceError Handling Failed : " + Throwables.getStackTraceAsString(e1) + "\"}";
                response.getOutputStream().write(errorMsg.getBytes());
                ServiceContextHolder.removeServiceContext();
                return;
            }
            response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
            ProObjectHttpProtocol responseErrorProtocol = new ProObjectHttpProtocol();
            ProObjectRequest requestInfo = requestContext.getRequest();
            Header header = requestInfo.getHeader();
            responseErrorProtocol.setHeader(header);
            
            ExceptionInfo exception = new ExceptionInfo();
            exception.setCode(requestInfo.getResponseCode());
            exception.setName(requestInfo.getResponseDetailMsgCode());
            exception.setMessage("exception : Service Failed : " + e.getMessage());
            exception.setStackTrace(Throwables.getStackTraceAsString(e));
            responseErrorProtocol.setException(exception);
            byte[] errorMsg =  SpringControllerUtil.marshalErrorResponseBody(responseErrorProtocol, headerMsg, msgType);
            response.getOutputStream().write(errorMsg);
            ServiceContextHolder.removeServiceContext();
            return;
        }
        
        SpringControllerUtil.handlePostService(serviceName, requestContext, svcInput, svcOutput);
        ServiceContextHolder.removeServiceContext();
        
        int statusCode = requestContext.getRequest().getStatusCode();
        if(statusCode != 0) {
            response.setStatus(statusCode);
        } else {
            response.setStatus(HttpStatus.OK.value());
        }
        
        protocol.setDto(svcOutput);
        byte[] outputProtocolBytes;
        {
            AbstractMessage msg = new MultiDeleteMsgJson();
            outputProtocolBytes = SpringControllerUtil.marshalResponseBody(protocol, msg, headerMsg, msgType);
        }
        response.getOutputStream().write(outputProtocolBytes);
        
        return;
    }
    
}
