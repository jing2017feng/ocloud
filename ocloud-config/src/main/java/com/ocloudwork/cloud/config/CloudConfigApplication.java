package com.ocloudwork.cloud.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CloudConfigApplication {
	
	private static Logger log=LoggerFactory.getLogger(CloudConfigApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(CloudConfigApplication.class, args);
		log.error("启动完成！");
	}
}
