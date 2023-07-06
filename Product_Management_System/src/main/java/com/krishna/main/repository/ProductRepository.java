package com.krishna.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.krishna.main.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
