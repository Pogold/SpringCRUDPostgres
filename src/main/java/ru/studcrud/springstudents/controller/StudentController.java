package ru.studcrud.springstudents.controller;

import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import ru.studcrud.springstudents.model.Student;
import ru.studcrud.springstudents.service.StudentService;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("api/v1/students")
@AllArgsConstructor
public class StudentController {

   
    private final StudentService service;
    
    @GetMapping
    public List<Student> findAllStidents() {
        return service.findAllStudents();
    }

    @PostMapping("save_student")
    public String saveStudent(@RequestBody Student student){
        service.saveStudent(student);
        return "Student saved";
    }

    @GetMapping("/{email}")
    public Student findByEmail(@PathVariable String email){
        return service.findByEmail(email);
    }

   @PutMapping("update_student")
   public Student updateStudent(@RequestBody  Student student) {
       return service.updateStudent(student);
   }

   @DeleteMapping("delete_student/{email}")
   public void deleteStudent(@PathVariable String email) {
         service.deleteStudent(email);
   }
}
