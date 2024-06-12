package com.example.crud.using.mongoDB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "My Demo project for Spring boot CRUD with MongoDB", version = "1.0.0"))
public class CrudUsingMongoDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudUsingMongoDbApplication.class, args);
	}

}
