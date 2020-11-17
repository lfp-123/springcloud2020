package com.newland.cloud.springcloudgetway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringcloudGetwayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudGetwayApplication.class, args);
	}

}
