package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Customer;

public interface ICustomerRepository extends JpaRepository<Customer, Long> {
	
	List<Customer> findByCcity(String ccity);
	List<Customer> findByCnameAndCmobile(String cname,String cmobile);
	

}
