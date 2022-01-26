package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.etron.springmvcrestful.model.Inscription;

@Repository
public interface inscriptionRepository extends CrudRepository<Inscription, Long> {
	

}
