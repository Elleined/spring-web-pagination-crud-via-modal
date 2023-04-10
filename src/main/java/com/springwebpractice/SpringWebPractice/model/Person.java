package com.springwebpractice.SpringWebPractice.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tbl_person")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "person_id")
    private long personId;

    @Column(name = "person_name")
    private String name;

    @Column(name = "gender")
    private String gender;

    @Column(name = "person_age")
    private int age;
}
