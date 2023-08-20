package com.springboot.jpa.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CustomerRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	public void insert(Customer customer) {
		entityManager.merge(customer);
	}
	
	public Customer findById(long id) {
		return entityManager.find(Customer.class, id);
	}
	
	public void deleteById(long id) {
		Customer customer = entityManager.find(Customer.class, id);
		entityManager.remove(customer);
		System.out.println("entry deleted" + customer);
	}
}
