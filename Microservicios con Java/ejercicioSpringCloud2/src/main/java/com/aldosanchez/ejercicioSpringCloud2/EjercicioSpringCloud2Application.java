package com.aldosanchez.ejercicioSpringCloud2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class EjercicioSpringCloud2Application {

	public static void main(String[] args) {
		SpringApplication.run(EjercicioSpringCloud2Application.class, args);
	}

}
