package com.krishna.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.krishna.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
