package com.example.thymeleafspringecommerce.models;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name= "students")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotEmpty(message = "User's name cannot be empty.")
    @Size(min = 5, max = 250)
    private String firstName;
    @NotEmpty(message = "User's last name cannot be empty.")
    private String lastName;
    @NotEmpty(message = "User's email cannot be empty.")
    private String email;

    public Student(String firstName, String lastName, String email)
    {
         this.firstName = firstName;
         this.lastName = lastName;
         this.email =email;
    }

}
