package ru.kors.springstudents.service.Impl;

import org.springframework.stereotype.Service;
import ru.kors.springstudents.model.Student;
import ru.kors.springstudents.model.repository.InMemoryStudentDAO;
import ru.kors.springstudents.service.StudentService;

import java.util.List;

@Service
public class InMemoryStudentServiceImpl implements StudentService {

    private final InMemoryStudentDAO repository;

    public InMemoryStudentServiceImpl(InMemoryStudentDAO repository) {
        this.repository = repository;
    }

    @Override
    public List<Student> findAllStudent() {
        return repository.findAllStudent();
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
