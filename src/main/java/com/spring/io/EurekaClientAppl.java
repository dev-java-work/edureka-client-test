package com.spring.io;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EurekaClientAppl {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientAppl.class, args);
	}

}
