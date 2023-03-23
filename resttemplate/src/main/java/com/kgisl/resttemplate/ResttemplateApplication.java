package com.kgisl.resttemplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class ResttemplateApplication {
//webclient
	@Bean
	public  WebClient.Builder getwebClient(){
		return WebClient.builder(); 
		
	}
	public static void main(String[] args) {
		SpringApplication.run(ResttemplateApplication.class, args);
	}

}
