package com.ocloudwork.cloud.service.config;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.pool.DruidDataSource;

@Configuration
public class DruidConfig {
    
    
    //生成密码：java -cp druid-1.0.26.jar com.alibaba.druid.filter.config.ConfigTools jingfeng>password.txt
    @Bean
    public DataSource druidDataSource(
                     @Value("${spring.datasource.driver-class-name}") String driver,
                     @Value("${spring.datasource.url}") String url,
                     @Value("${spring.datasource.username}") String username,
                     @Value("${spring.datasource.password}") String password,
                     @Value("${spring.datasource.filters}") String filters,
                     @Value("${spring.datasource.connectionProperties}") String connectionProperties) {
            DruidDataSource druidDataSource = new DruidDataSource();
            druidDataSource.setDriverClassName(driver);
            druidDataSource.setUrl(url);
            druidDataSource.setUsername(username);
            druidDataSource.setPassword(password);
            druidDataSource.setConnectionProperties(connectionProperties);
            try {
                druidDataSource.setFilters(filters);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return druidDataSource;
    }
}