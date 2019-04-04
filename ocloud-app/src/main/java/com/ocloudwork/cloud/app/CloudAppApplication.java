package com.ocloudwork.cloud.app;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import org.springframework.web.client.RestTemplate;

/**
 * 
 * <p>Description: 服务启动类</p>  
 * <p>Copyright: Copyright (c) 2018</p>  
 * <p>Company: www.ocloudwork.com</p>  
 * @author minghui
 * @datetime 2018年8月17日-上午11:00:17
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker
@EnableHystrix
@EnableRedisHttpSession
@EnableScheduling
public class CloudAppApplication {
	private static Logger log = LoggerFactory.getLogger(CloudAppApplication.class);

	/**
	 * 定义restful接口调用模板对象
	 * @return RestTemplate
	 */
	@Bean
	@LoadBalanced
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

	/**
	 * 在servletcontext设置系统属性
	 * @return
	 */
	@Bean
	public ServletContextInitializer initializer() {
		return new ServletContextInitializer() {
			@Override
			public void onStartup(ServletContext servletContext) throws ServletException {
				servletContext.setAttribute("jsVer", "1.0");
			}
		};
	}

	/**
	 * 服务启动main方法
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(CloudAppApplication.class, args);
		log.info("config server startup OK!");
	}

}
