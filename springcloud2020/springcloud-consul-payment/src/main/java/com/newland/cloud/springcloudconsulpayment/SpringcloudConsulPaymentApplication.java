package com.newland.cloud.springcloudconsulpayment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringcloudConsulPaymentApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudConsulPaymentApplication.class, args);
	}

}
