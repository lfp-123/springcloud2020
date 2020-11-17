package com.newland.cloud.springcloudorderhystrixdash;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class SpringcloudOrderHystrixdashApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudOrderHystrixdashApplication.class, args);
	}

}
