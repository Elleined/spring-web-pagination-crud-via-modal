package com.springwebpractice.SpringWebPractice.controller;


import com.springwebpractice.SpringWebPractice.dto.PersonDTO;
import com.springwebpractice.SpringWebPractice.service.PersonService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class AjaxController {

    private final PersonService personService;

    public AjaxController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping("/create")
    public ResponseEntity<?> saveRequestBody(@RequestBody PersonDTO personDTO) {
        personService.save( personDTO );
        return ResponseEntity.ok("PersonDTO successfully saved in database");
    }

    @GetMapping("/read")
    public @ResponseBody PersonDTO getPersonById(@RequestParam Long id) {
        System.out.println(id);
        return personService.getPersonById(id);
    }
}
