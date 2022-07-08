package com.jia.junit;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author jjsai
 * @date 2022/6/9 16:38
 **/
@Slf4j
@EnableFeignClients(basePackages = {"com.jia.junit"})
@EnableDiscoveryClient
@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class OrderApplication {
	public static void main(String[] args) {
		SpringApplication.run(OrderApplication.class,args);
	}
}
