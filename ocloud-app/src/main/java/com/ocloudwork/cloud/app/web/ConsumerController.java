package com.ocloudwork.cloud.app.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;

import com.ocloudwork.cloud.app.service.TestService;
import com.ocloudwork.cloud.app.service.impl.PushService;

@RestController
public class ConsumerController {

    @Autowired
    private TestService testService;
    @Autowired
    private PushService pushService;

    @RequestMapping(value = "/getAllUsers", method = RequestMethod.GET)
    public List getAllUsers() {
        return testService.getAllUsers();
    }
    
    @RequestMapping(value = "/saveUser", method = RequestMethod.GET)
    public int saveUser() {
        return testService.saveUser();
    }
    @RequestMapping(value = "/defer", method = RequestMethod.GET)
    public DeferredResult<String> deferredCall(){
    	return pushService.getAsyncUpdate();
    }
}
