package ru.kors.springstudents.controller;

import org.springframework.web.bind.annotation.*;
import ru.kors.springstudents.model.Student;
import ru.kors.springstudents.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController  {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @GetMapping
    public List<Student> fundAllStudent() {
        return service.findAllStudent();
    }

    @PostMapping("/save_student")
    public String saveStudent(@RequestBody Student student) {
        service.saveStudent(student);
        return "Student successfully saved";
    }

    @GetMapping("/{id}")
    public Student findById(@PathVariable(value = "id") Long id) {
        return service.findById(id);
    }

    @PutMapping("/update_student")
    public Student updateStudent(@RequestBody Student student) {
        return service.updateStudent(student);
    }

    @DeleteMapping("/delete_mapping/{id}")
    public void deleteStudent(@PathVariable(value = "id") Long id) {
        service.deleteStudent(id);
    }
}
