package com.springboot.jpa.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;



@Component
public class jpaCommandLineRunner implements CommandLineRunner{
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public void run(String... args) throws Exception {
		customerRepository.insert(new Customer(101, "Mukul Singh", "HTML"));
		customerRepository.insert(new Customer(102, "Mukul Singh", "CSS"));
		customerRepository.insert(new Customer(103, "Mukul Singh", "JavaScript"));
		customerRepository.insert(new Customer(105, "Mukul Singh", "AWS"));
		customerRepository.insert(new Customer(104, "Mukul Singh", "React js"));
		
		customerRepository.deleteById(105);
		
		System.out.println(customerRepository.findById(102));
		System.out.println(customerRepository.findById(103));
	}

}
