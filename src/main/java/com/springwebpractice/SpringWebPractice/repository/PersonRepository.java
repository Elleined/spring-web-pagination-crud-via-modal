package com.springwebpractice.SpringWebPractice.repository;

import com.springwebpractice.SpringWebPractice.model.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person, Long> {
    @Query(value = "SELECT p.* FROM tbl_person p WHERE MATCH (p.person_name) AGAINST (:searchKeyword)",
            countQuery = "SELECT COUNT(*) FROM tbl_person p WHERE MATCH (p.person_name) AGAINST (:searchKeyword)",
            nativeQuery = true)
    Page<Person> fetchPersonByKeyword(@Param("searchKeyword") String searchKeyword, Pageable pageable);
}