package com.example.demo.controller;
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

import com.etron.springmvcrestful.model.Inscription;
import com.etron.springmvcrestful.model.Person;
import com.example.demo.repositories.inscriptionRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;

@RestController
public class inscriptionController {
	@Autowired
	private inscriptionRepository inscriptionRepository;
	private static Logger logger = LoggerFactory.getLogger(inscriptionController.class);  
	
	  @GetMapping("/inscriptions")
	    public List<Inscription> getAll() {
	        logger.info("Find all users");
	        return (List<Inscription>) inscriptionRepository.findAll();
	    }

	    
	    @GetMapping("/inscriptions/{id}")
	    public ResponseEntity<Inscription> getEmployeeById(@PathVariable(value = "id") Long id) throws ResourceAccessException {
	    	Inscription inscription = inscriptionRepository.findById(id)
	        .orElseThrow(() -> new ResourceAccessException("Person not found for this id :: " + id));
	        
	        logger.info("Find Employee with ID :  {}", id);
	        return ResponseEntity.ok().body(inscription);
	    }
	    
	    
	    @PutMapping("/inscriptions/{id}")
	    public ResponseEntity<Inscription> updateEmployee(@PathVariable("id") Long id, @RequestBody Inscription inscription) throws ResourceAccessException {

	    	Inscription inscriptionData = inscriptionRepository.findById(id)
	                 .orElseThrow(() -> new ResourceAccessException("Employee not found for this id :: " + id));
	        
	        //set data before update
	    	inscriptionData.setNom(inscription.getNom());
	    	inscriptionData.setPrenom(inscription.getPrenom());
	    	inscriptionData.setAbonnement(inscription.getAbonnement());
	    	inscriptionData.setAdresse(inscription.getAdresse());
	    	inscriptionData.setEmail(inscription.getEmail());
	    	inscriptionData.setMdp(inscription.getMdp());
	        
	        Inscription updatedinscription =inscriptionRepository.save(inscriptionData);
	        
	        logger.info("Updated inscription with ID :  {}", id);
	        
	        return new ResponseEntity<>(updatedinscription, HttpStatus.OK);
	    }
	    
	@PostMapping(path="/inscription")
	public ResponseEntity<Inscription> createEmployee(@RequestBody Inscription inscription) throws Exception {
		Inscription newinscription =inscriptionRepository.save(inscription);
        logger.info("Created Person with ID : {}", newinscription.getIdInscription());
        return new ResponseEntity<>(newinscription, HttpStatus.CREATED);
		
	}
}
