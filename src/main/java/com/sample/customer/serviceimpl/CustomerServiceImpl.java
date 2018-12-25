package com.sample.customer.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.customer.model.Customer;
import com.sample.customer.repository.CustomerRepository;
import com.sample.customer.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public Customer findByCustomerId(int customerId) {
		
		Customer customer = customerRepository.findByCustomerId(customerId);
		
		return customer;
	}

}
