package com.aldosanchez.proyectoSpringCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ProyectoSpringCloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoSpringCloudApplication.class, args);
	}

}
