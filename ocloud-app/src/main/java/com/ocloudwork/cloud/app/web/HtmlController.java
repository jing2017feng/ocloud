package com.ocloudwork.cloud.app.web;



import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ocloudwork.cloud.app.service.TestService;

@Controller
public class HtmlController {

    @Autowired
    private TestService testService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ModelAndView list(HttpSession session) {
    	session.setAttribute("test", "赵辉");
    	System.out.println("sessionId="+session.getId()+"赵明辉666");
    	//查看：hkeys spring:session:sessions:9c0962b1-bd80-4079-9613-73d1bfc0135c
        return new ModelAndView("list","users",testService.getAllUsers());
    }
}
