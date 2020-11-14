package com.newland.cloud.springcloudpayment9091;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringcloudPayment9091Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudPayment9091Application.class, args);
	}

}
