package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Customer;
import com.example.demo.service.ICustomerService;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController {
	
	@Autowired
	private ICustomerService cservice;
	
	@GetMapping(value = "/")
	public String welcome()
	{
		return "<h1 style='text-align:center'>Welcome To Customer Management System<h1>";
	}
	
	/*
	 * Http Method: POST
	 * http://localhost:8080/customers/saveCustomer
	 * Returns : Status Code : 201 : CREATED
	 */
	
	@PostMapping(value = "/saveCustomer")
	public ResponseEntity<Customer> saveCustomer(@RequestBody Customer customer)
	{
		Customer cus=cservice.saveCustomer(customer);
		return new ResponseEntity<Customer>(cus,HttpStatus.CREATED);
	}
	
	
	/*
	 * Http Method : GET
	 * http://localhost:8080/customers/Hyderabad
	 */
	@GetMapping(value = "/{city}")
	public ResponseEntity<List<Customer>> getAllCustomersByCity(@PathVariable String city)
	{
		List<Customer> allCustomersByCity=cservice.findAllCustomersByCity(city);
		return new ResponseEntity<List<Customer>>(allCustomersByCity,HttpStatus.OK);
	}
	
	/*
	 * Http Method : GET
	 * http://localhost:8080/customers/Raj/9346465451
	 */
	@GetMapping(value = "/{cname}/{mobile}")
	public ResponseEntity<List<Customer>> getAllCustomersByNameAndMobile(@PathVariable String cname,@PathVariable String mobile)
	{
		List<Customer> allCustomersByNameAndMobile=cservice.findAllCustomersByNameAndMobile(cname,mobile);
		return new ResponseEntity<List<Customer>>(allCustomersByNameAndMobile,HttpStatus.OK);
	}
	

}
