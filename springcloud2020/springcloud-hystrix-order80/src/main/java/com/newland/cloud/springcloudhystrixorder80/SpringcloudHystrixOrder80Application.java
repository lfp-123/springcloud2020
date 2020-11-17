package com.newland.cloud.springcloudhystrixorder80;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableHystrix
public class SpringcloudHystrixOrder80Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudHystrixOrder80Application.class, args);
	}

}
