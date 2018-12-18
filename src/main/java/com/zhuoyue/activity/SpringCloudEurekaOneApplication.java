package com.zhuoyue.activity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudEurekaOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEurekaOneApplication.class, args);
	}
}
