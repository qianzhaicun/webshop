package com.wego.webstore.domain.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.wego.webstore.domain.Customer;
import com.wego.webstore.domain.repository.CustomerRepository;

@Repository
public class InMemoryCustomerRepository implements CustomerRepository {
	private List<Customer> listOfCustormers = new ArrayList<Customer>();
	
	InMemoryCustomerRepository()
	{
		Customer Customer1 = new Customer("cust1", "custname1", "custaddress1",true);
		Customer Customer2 = new Customer("cust2", "custname2", "custaddress2",true);
		Customer Customer3 = new Customer("cust3", "custname3", "custaddress3",true);
		listOfCustormers.add(Customer1);
		listOfCustormers.add(Customer2);
		listOfCustormers.add(Customer3);
	}
	public List<Customer> getAllCustomers() {
		return listOfCustormers;
	}
}
