package com.example.apiPerson.expcetions;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.server.ResponseStatusException;

public class PersonIdNotFoundException extends ResponseStatusException {
    public PersonIdNotFoundException() {
        super(HttpStatus.BAD_REQUEST, "Id of person not found !!");
    }
}
