package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Customer;
import com.example.demo.repo.ICustomerRepository;

@Service
public class CustomerServiceImpl implements ICustomerService {

	@Autowired
	private ICustomerRepository crepo;
	
	@Override
	public Customer saveCustomer(Customer customer) {
	    Customer cus=crepo.save(customer);
	    System.out.println(cus);
		return cus;
	}

	@Override
	public List<Customer> findAllCustomers() {
		List<Customer> allCustomers=crepo.findAll();
		System.out.println(allCustomers);
		return allCustomers;
	}

	@Override
	public List<Customer> findAllCustomersByCity(String city) {
		List<Customer> allCustomersByCity=crepo.findByCcity(city);
		System.out.println(allCustomersByCity);
		return allCustomersByCity;
	}

	@Override
	public List<Customer> findAllCustomersByNameAndMobile(String cname, String cmobile) {
		List<Customer> allCustomersByNameAndMobile=crepo.findByCnameAndCmobile(cname, cmobile);
		System.out.println(allCustomersByNameAndMobile);
		return allCustomersByNameAndMobile;
	}

}
