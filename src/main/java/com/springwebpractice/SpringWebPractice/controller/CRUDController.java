package com.springwebpractice.SpringWebPractice.controller;

import com.springwebpractice.SpringWebPractice.dto.PersonDTO;
import com.springwebpractice.SpringWebPractice.service.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class CRUDController {

    private final PersonService personService;

    public CRUDController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/update/{id}")
    @ResponseBody
    public PersonDTO getOne(@PathVariable long id) {
        return personService.getOne(id);
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable long id) {
        personService.delete(id);
        return "redirect:/pagination";
    }

    @PostMapping("/save-person")
    public String save(@RequestParam long id,
                       @RequestParam String name,
                       @RequestParam String gender,
                       @RequestParam int age) {

        PersonDTO personDTO = PersonDTO.builder()
                .id(id)
                .name(name)
                .gender(gender)
                .age(age)
                .build();

        personService.save(personDTO);
        System.out.println("!!!!!!!!!!!!");
        return "redirect:/pagination";
    }
}
