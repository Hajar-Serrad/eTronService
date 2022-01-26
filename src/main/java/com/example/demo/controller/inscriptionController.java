package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.ResourceAccessException;

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
	    public List<Person> getAll() {
	        logger.info("Find all users");
	        return (List<Person>) inscriptionRepository.findAll();
	    }

	    /**
	     * @param id
	     * @return employee
	     */
	    @GetMapping("/inscriptions/{id}")
	    public ResponseEntity<Person> getEmployeeById(@PathVariable(value = "id") Long id) throws ResourceAccessException {
	        Person personne = inscriptionRepository.findById(id)
	        .orElseThrow(() -> new ResourceAccessException("Person not found for this id :: " + id));
	        
	        logger.info("Find Employee with ID :  {}", id);
	        return ResponseEntity.ok().body(personne);
	    }
	    
	@PostMapping(path="/inscription")
	public ResponseEntity<Person> createEmployee(@RequestBody Person personne) throws Exception {
		Person newPerson =inscriptionRepository.save(personne);
        logger.info("Created Person with ID : {}", newPerson.getIdPerson());
        return new ResponseEntity<>(newPerson, HttpStatus.CREATED);
		
	}
}
