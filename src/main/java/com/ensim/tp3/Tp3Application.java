package com.ensim.tp3;

import com.ensim.tp3.model.FeatureCollection;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;
import org.springframework.web.client.RestTemplate;
import org.thymeleaf.spring5.view.ThymeleafView;

@SpringBootApplication
public class Tp3Application {

	public static void main(String[] args) {

		SpringApplication.run(Tp3Application.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}


}
