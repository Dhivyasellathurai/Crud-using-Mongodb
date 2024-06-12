package com.example.crud.using.mongoDB.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collation = "customer")
@Data
public class Customer {

	@Id
	private int id;
	private String name;
	private String mobileNo;
	private String drop;
	private String pickup;

}
