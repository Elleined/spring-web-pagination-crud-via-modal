package com.springwebpractice.SpringWebPractice.controller;

import com.springwebpractice.SpringWebPractice.dto.PersonDTO;
import com.springwebpractice.SpringWebPractice.service.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/dynamic-modal")
public class DynamicModalController {

    private final PersonService personService;

    public DynamicModalController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping
    public String showModalPage() {
        return "dynamic-modal";
    }

    @GetMapping("/{id}")
    @ResponseBody
    public PersonDTO findOne(@PathVariable long id) {
        return personService.getPersonById(id);
    }
}

