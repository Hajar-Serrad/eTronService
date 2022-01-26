package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.etron.springmvcrestful.model.Abonnement;

@Repository
public interface abonnementRepository extends CrudRepository<Abonnement, Long> {
	

}
