package com.schooltech.genpro;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GenproApplication {

	public static void main(String[] args) {
		SpringApplication.run(GenproApplication.class, args);
	}


	/* @Bean
	CommandLineRunner start(ContractRepo contractRepo){
		return args -> {
			Stream.of("A", "B", "C").forEach(cn -> {
				contractRepo.save(new Contract("CDI", 3));
				contractRepo.findAll().forEach(System.out::println);
			});
			
		};
		
	} */

}
