package com.newland.cloud.springcloudorderopenfen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringcloudOrderOpenfenApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudOrderOpenfenApplication.class, args);
	}

}
