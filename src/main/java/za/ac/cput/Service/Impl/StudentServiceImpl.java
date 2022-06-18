package za.ac.cput.Service.Impl;

import za.ac.cput.Domain.Entities.Address;
import za.ac.cput.Domain.Entities.Student;
import za.ac.cput.Repository.Interface.AddressRepository;
import za.ac.cput.Repository.Interface.Impl.AddressRepositoryImpl;
import za.ac.cput.Repository.Interface.Impl.StudentRepositoryImpl;
import za.ac.cput.Repository.Interface.StudentRepository;
import za.ac.cput.Service.Interface.AddressService;
import za.ac.cput.Service.Interface.StudentService;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Optional;

public class StudentServiceImpl implements StudentService {
    private final StudentRepository repo;
    private static StudentService service;

    public StudentServiceImpl(){
        this.repo = StudentRepositoryImpl.getStudentRepository();
    }

    public static StudentService getService(){
        if(service == null){
            service = new StudentServiceImpl();
        }

        return service;
    }

    @Override
    public Student save(Student student) {
        return this.repo.save(student);
    }

    @Override
    public Optional<Student> read(Student student) {
        return this.repo.read(student.getStudentID());
    }

    @Override
    public void delete(Student student) {
        this.repo.delete(student.getStudentID());
    }

    @Override
    public List<Student> readAll() {
        return this.repo.readAll();
    }

    @Override
    public String value() {
        return null;
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }
}
