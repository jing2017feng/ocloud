package com.ocloudwork.cloud.service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

@Service
public class RedisService {
	@Autowired
	RedisTemplate<String, String> redisTemplate;

	public void redisTest() {
		String key = "redisTestKey";
		String value = "I am test value";

		ValueOperations<String, String> opsForValue = redisTemplate.opsForValue();

		// 数据插入测试：
		opsForValue.set(key, value);
		String valueFromRedis = opsForValue.get(key);
		System.out.println("redis value after set: {}" + valueFromRedis);
		System.out.println(value.equals(valueFromRedis));

		// 数据删除测试：
		// redisTemplate.delete(key);
		// valueFromRedis = opsForValue.get(key);
		// System.out.println("redis value after delete: {}"+valueFromRedis);
		// System.out.println(valueFromRedis==null);
	}
}
