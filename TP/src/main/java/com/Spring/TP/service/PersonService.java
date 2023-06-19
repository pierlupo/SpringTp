package com.Spring.TP.service;

import com.Spring.TP.entity.Person;

import java.util.List;

public interface PersonService {

     List<Person> getAllPersons();
     Person getPerson();
}
