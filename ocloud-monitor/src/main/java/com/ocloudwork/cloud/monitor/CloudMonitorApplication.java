package com.ocloudwork.cloud.monitor;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableHystrixDashboard
//@EnableCircuitBreaker
@EnableAdminServer
public class CloudMonitorApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudMonitorApplication.class, args);
	}
}
