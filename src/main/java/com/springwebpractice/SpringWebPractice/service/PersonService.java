package com.springwebpractice.SpringWebPractice.service;

import com.springwebpractice.SpringWebPractice.dto.PersonDTO;
import com.springwebpractice.SpringWebPractice.model.Person;
import com.springwebpractice.SpringWebPractice.repository.PersonRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Page<Person> searchPersonTableByKeyword(String searchKeyword, int pageNumber, int pageSize) {
        Pageable pageable = PageSorter.getPage(pageNumber, pageSize);
        return personRepository.fetchPersonByKeyword(searchKeyword, pageable);
    }

    public Page<Person> searchPersonTableByKeyword(String searchKeyword,
                                                         int pageNumber,
                                                         int pageSize,
                                                         Sort.Direction direction,
                                                         String sortProperty) {

        Pageable pageable = PageSorter.getPage(pageNumber, pageSize, direction, sortProperty);
        return personRepository.fetchPersonByKeyword(searchKeyword, pageable);
    }

    public PersonDTO getPersonById(Long id) {
        Person person = personRepository.findById(id).orElseThrow();
        return PersonDTO.builder()
                .id(person.getPersonId())
                .name(person.getName())
                .gender(person.getGender())
                .age(person.getAge())
                .build();
    }

    public Page<Person> getPersonPage(int pageNumber,
                                      int pageSize,
                                      Sort.Direction direction,
                                      String sortProperty) {

        Pageable pageable = PageSorter.getPage(pageNumber, pageSize, direction, sortProperty);
        return personRepository.findAll(pageable);
    }

    public Page<Person> getPersonPage(int pageNumber, int pageSize) {
        Pageable pageable = PageSorter.getPage(pageNumber, pageSize);
        return personRepository.findAll(pageable);
    }

    public PersonDTO getOne(long id) {
        Person person = personRepository.findById(id).orElseThrow();
        return PersonDTO.builder()
                .id(person.getPersonId())
                .name(person.getName())
                .gender(person.getGender())
                .age(person.getAge())
                .build();
    }

    public List<Person> getAllPerson() {
        return personRepository.findAll();
    }

    public void delete(long id) {
        personRepository.deleteById(id);
    }

    public void save(PersonDTO personDTO) {
        Person person = Person.builder()
                .personId(personDTO.id())
                .name(personDTO.name())
                .gender(personDTO.gender())
                .age(personDTO.age())
                .build();
        personRepository.save(person);
    }
}
