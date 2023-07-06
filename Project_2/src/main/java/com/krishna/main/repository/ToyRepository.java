package com.krishna.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.krishna.main.beans.Toy;

@Repository
public interface ToyRepository extends JpaRepository<Toy, Integer>{

}
