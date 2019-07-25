package com.microserviciob;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication

@EnableDiscoveryClient
public class MicroservicioBApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioBApplication.class, args);
	}

}
