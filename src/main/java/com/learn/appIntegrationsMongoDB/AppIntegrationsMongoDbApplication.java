package com.learn.appIntegrationsMongoDB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories({"com.learn.appIntegrationsMongoDB.repository"})

public class AppIntegrationsMongoDbApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {

		SpringApplication.run(AppIntegrationsMongoDbApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(AppIntegrationsMongoDbApplication.class);
	}

}




