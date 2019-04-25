package com.ocloudwork.cloud.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@EnableEurekaClient
@EnableHystrixDashboard
@SpringBootApplication
@EnableTurbine
public class CloudHystrixApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudHystrixApplication.class, args);
	}
}
