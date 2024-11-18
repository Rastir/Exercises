package com.aldosanchez.convertidor_metros;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConvertidorMetrosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConvertidorMetrosApplication.class, args);
	}

}
