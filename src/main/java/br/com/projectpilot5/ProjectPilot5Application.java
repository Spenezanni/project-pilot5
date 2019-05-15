package br.com.projectpilot5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class ProjectPilot5Application {

	public static void main(String[] args) {
		SpringApplication.run(ProjectPilot5Application.class, args);
	}

}
