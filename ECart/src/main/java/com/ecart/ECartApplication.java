package com.ecart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ECartApplication {

	public static void main(String[] args) {
		SpringApplication.run(ECartApplication.class, args);
		System.out.println("Application Running");
	}
}