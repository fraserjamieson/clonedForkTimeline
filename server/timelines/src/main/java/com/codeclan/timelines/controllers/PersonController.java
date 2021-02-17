package com.codeclan.timelines.controllers;

import com.codeclan.timelines.models.Person;
import com.codeclan.timelines.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class PersonController {

    @Autowired
    PersonRepository personRepository;

    @GetMapping("/persons")
    public ResponseEntity<List<Person>> getAllPersons(){
        return new ResponseEntity<>(personRepository.findAll(), HttpStatus.OK);
    }


    @GetMapping("/persons/{id}")
    public ResponseEntity<Optional<Person>> getPersonById(@PathVariable Long id){
        return new ResponseEntity<>(personRepository.findById(id), HttpStatus.OK);
    }


    @PostMapping("/persons")
    public ResponseEntity<Person> createPerson(@RequestBody Person person){
        personRepository.save(person);
        return new ResponseEntity<>(person, HttpStatus.OK);
    }
}