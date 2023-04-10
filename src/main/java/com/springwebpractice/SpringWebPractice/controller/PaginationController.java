package com.springwebpractice.SpringWebPractice.controller;

import com.springwebpractice.SpringWebPractice.dto.PersonDTO;
import com.springwebpractice.SpringWebPractice.model.Person;
import com.springwebpractice.SpringWebPractice.service.PersonService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/pagination")
public class PaginationController {
    private final PersonService personService;

    public PaginationController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping
    public String goToPaginationTest(Model model) {

        Page<Person> personPage = personService.getPersonPage(0, 10);
        List<Person> personList = personPage.getContent();

        int totalPages = personPage.getTotalPages();

        model.addAttribute("personList", personList);
        model.addAttribute("totalPages", totalPages);
        model.addAttribute("currentPage", 0);
        model.addAttribute("totalItemPerPage", 10);
        return "pagination";
    }

    @GetMapping("/{pageNumber}/{pageSize}")
    public String previousAndNext(@PathVariable int pageNumber,
                                  @PathVariable int pageSize,
                                  Model model) {

        Page<Person> personPage = personService.getPersonPage(pageNumber, pageSize);
        List<Person> personList = personPage.getContent();


        model.addAttribute("personList", personList);
        model.addAttribute("currentPage", pageNumber);
        model.addAttribute("totalItemPerPage", pageSize);
        return "pagination";
    }

    @GetMapping("/{pageNumber}/{pageSize}/{sortProperty}")
    public String previousAndNextWithSort(@PathVariable int pageNumber,
                                          @PathVariable int pageSize,
                                          @PathVariable String sortProperty,
                                          Model model) {

        Page<Person> personPage = personService.getPersonPage(pageNumber, pageSize, Sort.Direction.ASC, sortProperty);
        List<Person> personList = personPage.getContent();

        model.addAttribute("personList", personList);
        model.addAttribute("currentPage", pageNumber);
        model.addAttribute("totalItemPerPage", pageSize);
        return "pagination";
    }


    @PostMapping("/search")
    public String handleSearch(@RequestParam String searchKeyword,
                               Model model) {

        Page<Person> searchResult = personService.searchPersonTableByKeyword(searchKeyword, 0, 3);
        List<Person> personList = searchResult.getContent();

        model.addAttribute("personList", personList);
        model.addAttribute("currentPage", 0);
        model.addAttribute("totalItemPerPage", 10);
        return "pagination";
    }
}

