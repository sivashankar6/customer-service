package com.sample.customer.service;

import com.sample.customer.model.Customer;

public interface CustomerService {

	public Customer findByCustomerId(int customerId);

}
