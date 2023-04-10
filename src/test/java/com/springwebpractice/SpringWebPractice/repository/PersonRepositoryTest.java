package com.springwebpractice.SpringWebPractice.repository;

import com.springwebpractice.SpringWebPractice.model.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.List;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class PersonRepositoryTest {

    @Autowired
    private PersonRepository personRepository;

    @Test
    void fetchPersonByKeyword() {
        Pageable pageable = PageRequest.of(0 ,3);
        Page<Person> baranggayPage = personRepository.fetchPersonByKeyword("Edward", pageable);

        int totalPages = baranggayPage.getTotalPages();
        long totalElements = baranggayPage.getTotalElements();

        System.out.println("====Total Pages====\n" + totalPages);
        System.out.println("====Total Elements====\n" + totalElements);

        List<Person> returnedPersonList = baranggayPage.getContent();
        System.out.println("=====Search Result=====");
        returnedPersonList.stream()
                .map(Person::getName)
                .forEach(System.out::println);
    }

}