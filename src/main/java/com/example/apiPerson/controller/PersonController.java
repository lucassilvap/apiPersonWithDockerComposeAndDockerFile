package com.example.apiPerson.controller;

import com.example.apiPerson.entity.PersonEntity;
import com.example.apiPerson.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("{id}")
    public ResponseEntity<?> findPersonById(@RequestParam(name = "id") Long id){
        return ResponseEntity.ok(personService.getPerson(id));
    }
}
