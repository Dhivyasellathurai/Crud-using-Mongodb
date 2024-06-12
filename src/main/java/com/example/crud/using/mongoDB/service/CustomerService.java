package com.example.crud.using.mongoDB.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crud.using.mongoDB.entity.Customer;
import com.example.crud.using.mongoDB.repo.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository repository;

	public Customer save(Customer customer) {
		repository.save(customer);
		return customer;
	}

	public Optional<Customer> getById(Integer id) {
		return repository.findById(id);

	}

	public List<Customer> getALL() {
		return repository.findAll();
	}

	public Customer updateCustomer(Customer customer) {
		repository.save(customer);
		return customer;
	}

	public String deleteById(Integer id) {
		repository.deleteById(id);
		return "Customer Deleted Successfully";
	}

}
