package com.wego.webstore.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wego.webstore.domain.Customer;
import com.wego.webstore.domain.repository.CustomerRepository;
import com.wego.webstore.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerRepository customerRepository;
	
	public List<Customer> getAllCustomers()
	{
		List<Customer> allCustomer = customerRepository.getAllCustomers();
		return allCustomer;
	}
}


