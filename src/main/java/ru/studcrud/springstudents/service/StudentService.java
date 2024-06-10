package ru.studcrud.springstudents.service;

import java.util.List;

import ru.studcrud.springstudents.model.Student;


public interface StudentService {

    Student saveStudent(Student student);

    Student findByEmail(String email);

    Student updateStudent(Student student);

    void deleteStudent(String email);

    List<Student> findAllStudents();
}
