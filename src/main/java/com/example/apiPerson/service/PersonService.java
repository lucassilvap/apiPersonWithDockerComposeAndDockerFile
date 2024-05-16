package com.example.apiPerson.service;

import com.example.apiPerson.entity.PersonEntity;
import com.example.apiPerson.expcetions.PersonIdNotFoundException;
import com.example.apiPerson.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public void savePerson(PersonEntity personEntity){
      personRepository.save(personEntity);
    }

    public PersonEntity getPerson(Long id){
        Optional<PersonEntity> personEntity = personRepository.findById(id);
        if(personEntity.isPresent())
            return personEntity.get();
           throw new PersonIdNotFoundException();
    }

}
