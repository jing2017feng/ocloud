package com.ocloudwork.cloud.service;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.alibaba.druid.pool.DruidDataSource;

@SpringBootApplication
@EnableDiscoveryClient
@EnableScheduling
//@ServletComponentScan//这行是为了避免扫描不到Druid的Servlet
public class CloudServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(CloudServiceApplication.class, args);
	}

	@Bean("duridDatasource")
	public DataSource druidDataSource() {
		return new DruidDataSource();
	}
}
