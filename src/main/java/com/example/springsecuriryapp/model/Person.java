package com.example.springsecuriryapp.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@Table(name = "Person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotEmpty(message = "Name must not be empty")
    @Size(min = 2,max = 100,message = "The name must then be 2 characters long")
    @Column(name = "user_name")
    private String username;

    @Min(value = 1990,message = "The year must not be greater than 1900")
    @Column(name = "year_of_birth")
    private String yearOfBirth;

    @Column(name = "password")
    private String password;

    public Person(String username, String yearOfBirth) {
        this.username = username;
        this.yearOfBirth = yearOfBirth;
    }
}
