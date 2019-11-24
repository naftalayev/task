package com.spring.task.restApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.task.models.Customers;
import com.spring.task.repositories.CustomersRepository;

@RestController
@RequestMapping("/customers")
public class CustomersController {

	/*
	 * @Autowired annotation creates an instance of CustomersRepository
	 */

	@Autowired
	private CustomersRepository repository;

	
	//	http://localhost:8080/customers
	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<Customers> getAllCustomers() {
		return repository.findAll();
	}
	
	
}
