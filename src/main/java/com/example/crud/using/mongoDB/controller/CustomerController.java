package com.example.crud.using.mongoDB.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.crud.using.mongoDB.entity.Customer;
import com.example.crud.using.mongoDB.service.CustomerService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/customer")
public class CustomerController {

	@Autowired
	private CustomerService service;

	@PostMapping("/create")
	private Customer save(@RequestBody Customer customer) {
		return service.save(customer);
	}

	@GetMapping("/getById/{id}")
	private Optional<Customer> getCustomer(@PathVariable("id") Integer id) {
		return service.getById(id);
	}

	@GetMapping("/getAll")
	private List<Customer> getAll() {
		return service.getALL();
	}

	@PutMapping("/update/customer")
	private Customer updateCustomer(@RequestBody Customer customer) {
		return service.updateCustomer(customer);
	}

	@DeleteMapping("/delete/{id}")
	private String delete(@PathVariable("id") Integer id) {
		return service.deleteById(id);
	}

}
