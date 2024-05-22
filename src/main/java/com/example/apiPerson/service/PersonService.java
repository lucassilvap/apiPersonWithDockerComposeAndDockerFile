package com.example.apiPerson.service;

import com.example.apiPerson.entity.PersonEntity;
import com.example.apiPerson.expcetions.PersonIdNotFoundException;
import com.example.apiPerson.expcetions.PersonNameMustBeUnique;
import com.example.apiPerson.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public void savePerson(PersonEntity personEntity){
      validateName(personEntity.getName());
      personRepository.save(personEntity);
    }

    public PersonEntity getPerson(Long id){
        Optional<PersonEntity> personEntity = personRepository.findById(id);
        if(personEntity.isPresent())
            return personEntity.get();
           throw new PersonIdNotFoundException();
    }
    public void validateName(String name){
        Optional<PersonEntity> personEntity = personRepository.findByNameIgnoreCase(name);
        if (personEntity.isPresent())
            throw new PersonNameMustBeUnique();
    }

}
