package za.ac.cput.Repository.Interface.Impl;

import za.ac.cput.Domain.Entities.Student;
import za.ac.cput.Repository.Interface.StudentRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 *
 * Keziah Robinson
 * 219113149
 * Student Repository Implementation
 *
 */

public class StudentRepositoryImpl implements StudentRepository {
    private List<Student> studentList;
    private static StudentRepository repo;

    private StudentRepositoryImpl() {
        this.studentList = new ArrayList<>();
    }

    public static StudentRepository getStudentRepository() {
        if (repo == null) {
            repo = new StudentRepositoryImpl();
            return repo;
        }

        return null;
    }

    @Override
    public Student save(Student student) {
        Optional<Student> read = read(student.getStudentID());

        if(read.isPresent()) {
            delete(read.get().getStudentID());
        }

        this.studentList.add(student);
        return student;
    }

    @Override
    public Optional<Student> read(String id) {
        return this.studentList
                .stream()
                .filter(a -> a.getStudentID().equals(id))
                .findFirst();
    }

    @Override
    public List<Student> readAll() {
        return this.studentList.stream().toList();
    }

    @Override
    public void delete(String id) {
        studentList.remove(id);
    }
}
