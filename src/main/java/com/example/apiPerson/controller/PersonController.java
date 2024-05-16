package com.example.apiPerson.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.apiPerson.entity.PersonEntity;
import com.example.apiPerson.service.PersonService;

@RestController
public class PersonController
{
    @Autowired
    private PersonService personService;

    @PostMapping
    public ResponseEntity<?> savePerson(@RequestBody PersonEntity personEntity){
        personService.savePerson(personEntity);
        return ResponseEntity.ok("salvo com sucesso");
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> findPersonById(@PathVariable Long id){
        return ResponseEntity.ok(personService.getPerson(id));
    }
}
