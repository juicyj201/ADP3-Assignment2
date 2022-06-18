package za.ac.cput.Service.Impl;

import za.ac.cput.Domain.Entities.Student;
import za.ac.cput.Domain.Entities.StudentAddress;
import za.ac.cput.Repository.Interface.Impl.StudentAddressRepositoryImpl;
import za.ac.cput.Repository.Interface.Impl.StudentRepositoryImpl;
import za.ac.cput.Repository.Interface.StudentAddressRepository;
import za.ac.cput.Repository.Interface.StudentRepository;
import za.ac.cput.Service.Interface.StudentAddressService;
import za.ac.cput.Service.Interface.StudentService;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Optional;

public class StudentAddressServiceImpl implements StudentAddressService {
    private final StudentAddressRepository repo;
    private static StudentAddressService service;

    public StudentAddressServiceImpl(){
        this.repo = StudentAddressRepositoryImpl.getStudentRepository();
    }

    public static StudentAddressService getService(){
        if(service == null){
            service = new StudentAddressServiceImpl();
        }

        return service;
    }

    @Override
    public StudentAddress save(StudentAddress studentAddress) {
        return this.repo.save(studentAddress);
    }

    @Override
    public Optional<StudentAddress> read(StudentAddress studentAddress) {
        return this.repo.read(studentAddress.getStudentID());
    }

    @Override
    public void delete(StudentAddress studentAddress) {
        this.repo.delete(studentAddress.getStudentID());
    }

    @Override
    public List<StudentAddress> readAll() {
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
