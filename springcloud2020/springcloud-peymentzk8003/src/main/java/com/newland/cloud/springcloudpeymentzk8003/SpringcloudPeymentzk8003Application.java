package com.newland.cloud.springcloudpeymentzk8003;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringcloudPeymentzk8003Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudPeymentzk8003Application.class, args);
	}

}
