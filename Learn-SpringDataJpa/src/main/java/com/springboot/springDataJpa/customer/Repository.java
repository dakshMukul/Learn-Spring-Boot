package com.springboot.springDataJpa.customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface Repository extends JpaRepository<Customer, Long>{

}
