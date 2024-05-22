package com.example.apiPerson.expcetions;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.server.ResponseStatusException;

public class PersonNameMustBeUnique extends ResponseStatusException{

    public PersonNameMustBeUnique() {
        super(HttpStatus.BAD_REQUEST, "Name must be unique!!");
    }
}
