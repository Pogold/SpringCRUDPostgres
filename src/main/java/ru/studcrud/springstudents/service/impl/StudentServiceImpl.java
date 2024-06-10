package ru.studcrud.springstudents.service.impl;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import ru.studcrud.springstudents.model.Student;
import ru.studcrud.springstudents.repository.StudentRepository;
import ru.studcrud.springstudents.service.StudentService;

@Service
@AllArgsConstructor
@Primary
public class StudentServiceImpl implements StudentService{

    private final StudentRepository repository;

 @Override
    public List<Student> findAllStudents() {
        
        return repository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return repository.save(student);
    }

    @Override
    public Student findByEmail(String email) {
        return repository.findStudentByEmail(email);
    }

    @Override
    public Student updateStudent(Student student) {
        return repository.save(student);
    }

    @Override
    @Transactional
    public void deleteStudent(String email) {
       repository.deleteByEmail(email);
    }
}
