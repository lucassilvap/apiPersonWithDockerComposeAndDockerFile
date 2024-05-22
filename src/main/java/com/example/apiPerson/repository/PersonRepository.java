package com.example.apiPerson.repository;

import com.example.apiPerson.entity.PersonEntity;
import com.example.apiPerson.expcetions.PersonIdNotFoundException;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PersonRepository extends CrudRepository<PersonEntity, Long> {

    public Optional<PersonEntity> findByNameIgnoreCase(String name);
}
