package com.krishna.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.krishna.entity.Learner;
@Repository
public interface LearnerRepository extends CrudRepository<Learner, Integer> {

}
