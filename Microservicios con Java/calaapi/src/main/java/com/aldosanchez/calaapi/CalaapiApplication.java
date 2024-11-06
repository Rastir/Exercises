package com.aldosanchez.calaapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CalaapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalaapiApplication.class, args);
	}

}
