package com.springboot.springDataJpa.customer;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customer {

	@Id
	private long id;
	@Column
	private String name;
	@Column
	private String city;
	
	public Customer() {
		
	}

	
	public Customer(long id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}


	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", city=" + city + "]";
	};
	
	
	
	
}
