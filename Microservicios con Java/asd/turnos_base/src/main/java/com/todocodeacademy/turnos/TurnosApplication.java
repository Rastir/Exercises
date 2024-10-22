package com.todocodeacademy.turnos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class TurnosApplication {

	public static void main(String[] args) {
		SpringApplication.run(TurnosApplication.class, args);
	}

}
