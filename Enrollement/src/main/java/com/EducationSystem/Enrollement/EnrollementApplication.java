package com.EducationSystem.Enrollement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class EnrollementApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnrollementApplication.class, args);
	}

}
