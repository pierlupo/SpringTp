package com.Spring.TP.controller;

import com.Spring.TP.entity.Person;
import com.Spring.TP.service.impl.PersonServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class PersonController {
private PersonServiceImpl personService;

    public PersonController(PersonServiceImpl personService) {
        this.personService = personService;
    }

    @GetMapping("/get/person")
    public Person getOnePerson(){
        return personService.getPerson();
    }

    @PostMapping("/post/person")
    public Person postOnePerson(@RequestBody Person person){
        return person;
    }

    @GetMapping("/get/persons")
    public String getPersonsList(){
        return personService.getAllPersons().toString();
    }
}
