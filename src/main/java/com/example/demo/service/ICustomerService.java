package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Customer;

public interface ICustomerService {
	Customer saveCustomer(Customer customer);
	List<Customer> findAllCustomers();
	List<Customer> findAllCustomersByCity(String city);
	List<Customer> findAllCustomersByNameAndMobile(String cname,String cmobile);

}
