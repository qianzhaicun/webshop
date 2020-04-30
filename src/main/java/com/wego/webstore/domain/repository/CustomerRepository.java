package com.wego.webstore.domain.repository;

import java.util.List;

import com.wego.webstore.domain.Customer;

public interface CustomerRepository {
	public List<Customer> getAllCustomers();
}
