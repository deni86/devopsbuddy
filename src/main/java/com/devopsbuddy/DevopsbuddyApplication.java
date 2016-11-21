package com.devopsbuddy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//Da izbjegnemp da springboot skenira cijeli projekat u potrazi za repozitorijem sto poboljsava performanse
@EnableJpaRepositories(basePackages = "com.devopsbuddy.backend.persistance.repositories")
public class DevopsbuddyApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevopsbuddyApplication.class, args);
	}
}
