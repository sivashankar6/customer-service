package com.sample.customer.resource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.customer.model.Customer;
import com.sample.customer.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerResource {
	
	@Autowired
	private CustomerService customerService;

	@GetMapping("/get/{customerId}")
	public Customer findByCustomerId(@PathVariable int customerId) {

		Customer customer = customerService.findByCustomerId(customerId);

		return customer;
	}

}
