package com.example.crud.using.mongoDB.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.crud.using.mongoDB.entity.Customer;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, Integer> {

}
