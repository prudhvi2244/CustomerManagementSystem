package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "customers")
public class Customer {
	
	@Id
	@GeneratedValue	
	@Column(name = "customer_id")
	private Long cid;
	@Column(name = "customer_name")
	private String cname;
	@Column(name = "customer_email")
	private String email;
	@Column(name = "customer_mobile")
	private String cmobile;
	@Column(name = "customer_city")
	private String ccity;

}
