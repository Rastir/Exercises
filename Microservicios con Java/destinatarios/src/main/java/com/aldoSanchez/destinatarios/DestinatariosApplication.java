package com.aldoSanchez.destinatarios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DestinatariosApplication {

	public static void main(String[] args) {
		SpringApplication.run(DestinatariosApplication.class, args);
	}

}
