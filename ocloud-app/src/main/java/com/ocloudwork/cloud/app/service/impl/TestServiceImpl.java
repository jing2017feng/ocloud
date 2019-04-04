package com.ocloudwork.cloud.app.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.ocloudwork.cloud.app.service.TestService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "addServiceFallback")
    @Override
    public List getAllUsers() {
        return restTemplate.getForObject("http://OCLOUD-SERVICE/getAllUsers", List.class);
    }

    public List addServiceFallback() {
        return new ArrayList();
    }
    
    public int saveUser() {
        return restTemplate.getForObject("http://OCLOUD-SERVICE/saveUser", Integer.class);
    }
}
