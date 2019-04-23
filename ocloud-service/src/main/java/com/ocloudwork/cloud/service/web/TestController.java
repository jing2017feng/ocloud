package com.ocloudwork.cloud.service.web;

import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ocloudwork.cloud.service.domain.User;
import com.ocloudwork.cloud.service.service.RedisService;
import com.ocloudwork.cloud.service.service.TestService;

@RestController
public class TestController {

	private static final Logger logger = LoggerFactory.getLogger(TestController.class);

	@Autowired
	private DiscoveryClient client;

	@Autowired
	private TestService testService;

	@Autowired
	private RedisService redisService;

	@RequestMapping("/redis")
	public String redis() {
		redisService.redisTest();
		return "ok";
	}

	@RequestMapping("/getAllUsers")
	public List<User> getAllUsers() {
		List<User> result = testService.getAllUsers();
		return result;
	}

	@RequestMapping("/saveUser")
	public User saveUser() {
		User result = testService.saveUser();
		return result;
	}
}
