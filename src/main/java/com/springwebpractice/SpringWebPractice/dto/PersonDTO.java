package com.springwebpractice.SpringWebPractice.dto;

import lombok.Builder;

@Builder
public record PersonDTO(long id, String name, String gender, int age) {
}
