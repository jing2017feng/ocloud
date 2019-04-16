package com.ocloudwork.cloud.service.web;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ocloudwork.cloud.service.domain.User;
import com.ocloudwork.cloud.service.service.RedisService;
import com.ocloudwork.cloud.service.service.TestService;

@RestController
public class TestController {
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
	public List<User> getAllUsers(HttpSession session) {
		List<User> result = testService.getAllUsers();
		return result;
	}

	@RequestMapping("/saveUser")
	public User saveUser() {
		User result = testService.saveUser();
		return result;
	}
}
