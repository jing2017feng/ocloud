package com.ocloudwork.cloud.app.web;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;

import com.ocloudwork.cloud.app.service.TestService;
import com.ocloudwork.cloud.app.service.impl.PushService;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
public class ConsumerController {

    @Autowired
    private TestService testService;
    @Autowired
    private PushService pushService;

    @RequestMapping(value = "/getAllUsers", method = RequestMethod.GET)
    public List getAllUsers(HttpSession session) {
        LoggerFactory.getLogger(ConsumerController.class).info(session.getId());
        return testService.getAllUsers();
    }
    
    @RequestMapping(value = "/saveUser", method = RequestMethod.GET)
    public int saveUser(HttpSession session) {
        LoggerFactory.getLogger(ConsumerController.class).info(session.getId());
        return testService.saveUser();
    }
    @RequestMapping(value = "/defer", method = RequestMethod.GET)
    public DeferredResult<String> deferredCall(){
    	return pushService.getAsyncUpdate();
    }
}
