package com.example.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.ResourceAccessException;

import com.etron.springmvcrestful.model.Abonnement;
import com.etron.springmvcrestful.model.Inscription;
import com.example.demo.repositories.abonnementRepository;

@RestController
public class abonnementController {
	@Autowired
	private abonnementRepository abonnementRepository;
	private static Logger logger = LoggerFactory.getLogger(inscriptionController.class);  
	
	  @GetMapping("/abonnements")
	    public List<Abonnement> getAll() {
	        logger.info("Find all Abonnements");
	        return (List<Abonnement>) abonnementRepository.findAll();
	    }


	    @GetMapping("/abonnements/{id}")
	    public ResponseEntity<Abonnement> getEmployeeById(@PathVariable(value = "id") Long id) throws ResourceAccessException {
	    	Abonnement abonnement = abonnementRepository.findById(id)
	        .orElseThrow(() -> new ResourceAccessException("Abonnement not found for this id :: " + id));
	        
	        logger.info("Find Employee with ID :  {}", id);
	        return ResponseEntity.ok().body(abonnement);
	    }
	    
	    
	    @PutMapping("/abonnements/{id}")
	    public ResponseEntity<Abonnement> updateEmployee(@PathVariable("id") Long id, @RequestBody Abonnement abonnement) throws ResourceAccessException {

	    	Abonnement abonnementData = abonnementRepository.findById(id)
	                 .orElseThrow(() -> new ResourceAccessException("Employee not found for this id :: " + id));
	        
	        //set data before update
	    	abonnementData.setFormule(abonnement.getFormule());
	    	abonnementData.setDateFin(abonnement.getDateFin());
	        
	    	Abonnement updatedabonnement =abonnementRepository.save(abonnementData);
	        
	        logger.info("Updated inscription with ID :  {}", id);
	        
	        return new ResponseEntity<>(updatedabonnement, HttpStatus.OK);
	    }
	    
	@PostMapping(path="/abonnement")
	public ResponseEntity<Abonnement> createEmployee(@RequestBody Abonnement abonnement) throws Exception {
		Abonnement newabonnement =abonnementRepository.save(abonnement);
        logger.info("Created Person with ID : {}", newabonnement.getIdAbonnement());
        return new ResponseEntity<>(newabonnement, HttpStatus.CREATED);
		
	}
	
}
