package com.springboot.springDataJpa.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SpringDataJpaCommandLineRunner implements CommandLineRunner{
	

	@Autowired
	private Repository repository;
	
	@Override
	public void run(String... args) throws Exception {
		repository.save(new Customer(101, "Mukul Singh", "HTML"));
		repository.save(new Customer(102, "Mukul Singh", "CSS"));
		repository.save(new Customer(103, "Mukul Singh", "JavaScript"));
		repository.save(new Customer(105, "Mukul Singh", "AWS"));
		repository.save(new Customer(104, "Mukul Singh", "React js"));
		
		repository.deleteById(105l);
		
		System.out.println(repository.findById(102l));
		System.out.println(repository.findById(103l));
		
	}

}
