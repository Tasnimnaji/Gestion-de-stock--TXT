package tn.esprit.spring;

import java.util.stream.Stream;


import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;



import tn.esprit.spring.repositories.VenteRepository;



@SpringBootApplication
@EnableEurekaClient
public class DeliveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeliveryApplication.class, args);
	}
	@Bean
	 ApplicationRunner init(VenteRepository repository){
		
			repository.findAll().forEach(System.out::println);
			return null;
		};
	}

