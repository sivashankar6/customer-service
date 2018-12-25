package com.sample.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.customer.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	public Customer findByCustomerId(int customerId);

}
