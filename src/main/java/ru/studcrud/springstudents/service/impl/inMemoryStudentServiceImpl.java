package ru.studcrud.springstudents.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import ru.studcrud.springstudents.model.Student;
import ru.studcrud.springstudents.repository.InMemoryStudentDAO;
import ru.studcrud.springstudents.service.StudentService;

@Service
@AllArgsConstructor
public class inMemoryStudentServiceImpl implements StudentService {

    private final InMemoryStudentDAO repository;

    @Override
    public List<Student> findAllStudents() {
        
        return repository.findAllStudents();
    }

    @Override
    public Student saveStudent(Student student) {
        return repository.saveStudent(student);
    }

    @Override
    public Student findByEmail(String email) {
        return repository.findByEmail(email);
    }

    @Override
    public Student updateStudent(Student student) {
        return repository.updateStudent(student);
    }

    @Override
    public void deleteStudent(String email) {
       repository.deleteStudent(email);
    }
    
}
