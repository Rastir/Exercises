package com.aldoSanchez.envios.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfiguration {
    
    @Bean("apiConsumir")
    public RestTemplate registrarRestTemplate(){
        return new RestTemplate();
    }
}
