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
        return repository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return repository.save(student);
    }

    @Override
    public Student findById(Long id) {
        return repository.findById(id).get();
    }


    @Override
    public Student updateStudent(Student student) {
        return repository.save(student);
    }

    @Override
    public void deleteStudent(Long id) {
        repository.deleteById(id);
    }
}
