package ru.studcrud.springstudents.model;
import java.time.LocalDate;
import java.time.Period;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.Data;


@Data
@Entity
@Table(name="students")
public class Student {
    @Id
    @GeneratedValue
    private Long id;
    
    private String firstName;

    private String LastName;

    private LocalDate DateOfBirth;

    @Column(unique = true)
    private String email;

    @Transient
    private int age;

    public int getAge()
    {
        return Period.between(DateOfBirth, LocalDate.now()).getYears();
    }

}
