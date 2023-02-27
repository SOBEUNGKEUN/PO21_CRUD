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
import org.springframework.stereotype.Component;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import jeus.proobject.model.network.context.RequestContext;
import jeus.proobject.core2.service.ServiceName;
import jeus.proobject.core2.annotation.ProObjectController;
import jeus.proobject.model.context.Header;
import jeus.proobject.model.promapper.ProMapperMessageType;
import com.tmax.proobject.runtime.ProObjectControllerInput;
import com.tmax.proobject.service.util.ProObjectControllerUtil;
import com.tmax.proobject.runtime.context.ServiceContextHolder;
import jeus.proobject.model.message.AbstractMessage;

@javax.annotation.Generated(
    value = "com.tmaxsoft.sts4.codegen.controller.POControllerGenerator",
    date= "23. 2. 27. 오후 4:29",
    comments= "ServiceGroupController"
)

@Component(value="ProObjectServiceGroupController")
@EnableAutoConfiguration
@ProObjectController
public class ProObjectServiceGroupController
{
    @Autowired
    SelectService _SelectService;
    
    @Autowired
    InsertService _InsertService;
    
    @Autowired
    UpdateService _UpdateService;
    
    @Autowired
    DeleteService _DeleteService;
    
    public Object executeSelectService_service(ProObjectControllerInput controllerInput) throws Throwable {
        ServiceName serviceName = controllerInput.getServiceName();
        RequestContext requestContext = controllerInput.getRequestContext();
    
        ServiceContextHolder.getServiceContext().setRequestContext(requestContext);
    
        boolean fromDispatcher = (controllerInput.getServiceInputObject() == null);
        MultiSelect svcInput;
        Header header = null;
        
        
        if (fromDispatcher) {
            AbstractMessage headerMsg = new jeus.proobject.model.context.HeaderMsgJson();
            header = (Header) headerMsg.unmarshal(controllerInput.getHeaderBytes());
            requestContext.getRequest().setHeader(header);
            AbstractMessage msg = new MultiSelectMsgJson();
            svcInput = (MultiSelect) msg.unmarshal(controllerInput.getServiceInputBytes());
        } else {
            svcInput = (MultiSelect) controllerInput.getServiceInputObject();
        }
        
        ProObjectControllerUtil.handlePreService(serviceName, requestContext, svcInput); // getTransaction
        
        MultiSelect svcOutput = null;
        try {
            svcOutput = _SelectService.selectService(svcInput);
            ProObjectControllerUtil.handlePostService(serviceName, requestContext, svcInput, svcOutput, fromDispatcher); // commit
        } catch (Throwable e) {
            ProObjectControllerUtil.handleServiceError(serviceName, requestContext, svcInput, e, fromDispatcher); // rollback
            ServiceContextHolder.removeServiceContext();
            throw e;
        }
        
        ServiceContextHolder.removeServiceContext();
        
        if (fromDispatcher) {
            AbstractMessage msg = new MultiSelectMsgJson();
            return msg.marshal(svcOutput);
        } else {
            return svcOutput;
        }
    }
    public Object executeInsertService_service(ProObjectControllerInput controllerInput) throws Throwable {
        ServiceName serviceName = controllerInput.getServiceName();
        RequestContext requestContext = controllerInput.getRequestContext();
    
        ServiceContextHolder.getServiceContext().setRequestContext(requestContext);
    
        boolean fromDispatcher = (controllerInput.getServiceInputObject() == null);
        MultiInsert svcInput;
        Header header = null;
        
        
        if (fromDispatcher) {
            AbstractMessage headerMsg = new jeus.proobject.model.context.HeaderMsgJson();
            header = (Header) headerMsg.unmarshal(controllerInput.getHeaderBytes());
            requestContext.getRequest().setHeader(header);
            AbstractMessage msg = new MultiInsertMsgJson();
            svcInput = (MultiInsert) msg.unmarshal(controllerInput.getServiceInputBytes());
        } else {
            svcInput = (MultiInsert) controllerInput.getServiceInputObject();
        }
        
        ProObjectControllerUtil.handlePreService(serviceName, requestContext, svcInput); // getTransaction
        
        MultiInsert svcOutput = null;
        try {
            svcOutput = _InsertService.insertService(svcInput);
            ProObjectControllerUtil.handlePostService(serviceName, requestContext, svcInput, svcOutput, fromDispatcher); // commit
        } catch (Throwable e) {
            ProObjectControllerUtil.handleServiceError(serviceName, requestContext, svcInput, e, fromDispatcher); // rollback
            ServiceContextHolder.removeServiceContext();
            throw e;
        }
        
        ServiceContextHolder.removeServiceContext();
        
        if (fromDispatcher) {
            AbstractMessage msg = new MultiInsertMsgJson();
            return msg.marshal(svcOutput);
        } else {
            return svcOutput;
        }
    }
    public Object executeUpdateService_service(ProObjectControllerInput controllerInput) throws Throwable {
        ServiceName serviceName = controllerInput.getServiceName();
        RequestContext requestContext = controllerInput.getRequestContext();
    
        ServiceContextHolder.getServiceContext().setRequestContext(requestContext);
    
        boolean fromDispatcher = (controllerInput.getServiceInputObject() == null);
        MultiUpdate svcInput;
        Header header = null;
        
        
        if (fromDispatcher) {
            AbstractMessage headerMsg = new jeus.proobject.model.context.HeaderMsgJson();
            header = (Header) headerMsg.unmarshal(controllerInput.getHeaderBytes());
            requestContext.getRequest().setHeader(header);
            AbstractMessage msg = new MultiUpdateMsgJson();
            svcInput = (MultiUpdate) msg.unmarshal(controllerInput.getServiceInputBytes());
        } else {
            svcInput = (MultiUpdate) controllerInput.getServiceInputObject();
        }
        
        ProObjectControllerUtil.handlePreService(serviceName, requestContext, svcInput); // getTransaction
        
        MultiUpdate svcOutput = null;
        try {
            svcOutput = _UpdateService.updateService(svcInput);
            ProObjectControllerUtil.handlePostService(serviceName, requestContext, svcInput, svcOutput, fromDispatcher); // commit
        } catch (Throwable e) {
            ProObjectControllerUtil.handleServiceError(serviceName, requestContext, svcInput, e, fromDispatcher); // rollback
            ServiceContextHolder.removeServiceContext();
            throw e;
        }
        
        ServiceContextHolder.removeServiceContext();
        
        if (fromDispatcher) {
            AbstractMessage msg = new MultiUpdateMsgJson();
            return msg.marshal(svcOutput);
        } else {
            return svcOutput;
        }
    }
    public Object executeDeleteService_service(ProObjectControllerInput controllerInput) throws Throwable {
        ServiceName serviceName = controllerInput.getServiceName();
        RequestContext requestContext = controllerInput.getRequestContext();
    
        ServiceContextHolder.getServiceContext().setRequestContext(requestContext);
    
        boolean fromDispatcher = (controllerInput.getServiceInputObject() == null);
        MultiDelete svcInput;
        Header header = null;
        
        
        if (fromDispatcher) {
            AbstractMessage headerMsg = new jeus.proobject.model.context.HeaderMsgJson();
            header = (Header) headerMsg.unmarshal(controllerInput.getHeaderBytes());
            requestContext.getRequest().setHeader(header);
            AbstractMessage msg = new MultiDeleteMsgJson();
            svcInput = (MultiDelete) msg.unmarshal(controllerInput.getServiceInputBytes());
        } else {
            svcInput = (MultiDelete) controllerInput.getServiceInputObject();
        }
        
        ProObjectControllerUtil.handlePreService(serviceName, requestContext, svcInput); // getTransaction
        
        MultiDelete svcOutput = null;
        try {
            svcOutput = _DeleteService.deleteService(svcInput);
            ProObjectControllerUtil.handlePostService(serviceName, requestContext, svcInput, svcOutput, fromDispatcher); // commit
        } catch (Throwable e) {
            ProObjectControllerUtil.handleServiceError(serviceName, requestContext, svcInput, e, fromDispatcher); // rollback
            ServiceContextHolder.removeServiceContext();
            throw e;
        }
        
        ServiceContextHolder.removeServiceContext();
        
        if (fromDispatcher) {
            AbstractMessage msg = new MultiDeleteMsgJson();
            return msg.marshal(svcOutput);
        } else {
            return svcOutput;
        }
    }
}
