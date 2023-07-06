package com.krishna.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.krishna.entity.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

}
