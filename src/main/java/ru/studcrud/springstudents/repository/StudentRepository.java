package ru.studcrud.springstudents.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ru.studcrud.springstudents.model.Student;

public interface StudentRepository extends JpaRepository<Student,Long>{
        
    void deleteByEmail(String email);

    Student findStudentByEmail(String email);
}
