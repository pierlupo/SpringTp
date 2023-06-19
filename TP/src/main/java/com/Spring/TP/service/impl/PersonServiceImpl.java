package com.Spring.TP.service.impl;

import com.Spring.TP.entity.Person;
import com.Spring.TP.service.PersonService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {
    @Override
    public List<Person> getAllPersons() {
        Person person =  new Person(1L, "Michel", "Louise");
        Person person1 = new Person(2L, "Blanqui ", "Auguste");
        Person person2 = new Person(3L, "Saint-Just", "Louis");

        List<Person> personList = Arrays.asList(person, person1, person2);


        return personList;
    }

    @Override
    public Person getPerson() {
        Person person =  new Person(1L, "Louise", "Michel");
        return person;
    }
}
