package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.etron.springmvcrestful.model.Person;

@Repository
public interface inscriptionRepository extends CrudRepository<Person, Long> {
	

}
