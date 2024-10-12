package com.todocodeacademy.clinica_veterinaria;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedOrigins("https://rastir.github.io/CalaWeb/modificarAqualovers.html","http://127.0.0.1:5500/modificarAqualovers.html")
                        .allowedMethods("GET", "POST", "PUT", "DELETE")
                        .allowedHeaders("*")
                        .allowCredentials(true);
            }
        };
    }

}

// Se está trabajando en cambiar unas cosas para que se pueda consumir una api desde un html tanto en casero desde local host como desde un github pages, por hoy creo que encontramos el fallo

