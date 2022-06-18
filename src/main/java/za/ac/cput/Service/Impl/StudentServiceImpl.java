package za.ac.cput.Service.Impl;

import org.springframework.stereotype.Service;
import za.ac.cput.Domain.Entities.Country;
import za.ac.cput.Domain.Entities.Employee;
import za.ac.cput.Domain.Entities.Lookup.EmployeeAddress;
import za.ac.cput.Domain.Entities.Student;
import za.ac.cput.Domain.Entities.StudentAddress;
import za.ac.cput.Repository.Interface.StudentAddressRepository;
import za.ac.cput.Repository.Interface.StudentRepository;
import za.ac.cput.Service.Interface.StudentService;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 *
 * Keziah Robinson
 * 219113149
 * Student Service Implementation
 *
 */

@Service
public class StudentServiceImpl implements StudentService {
    private static StudentRepository studentRepository;
    private List<Student> studentList;
    private static StudentService service;
    private StudentAddressRepository studentAddressRepository;

    public StudentServiceImpl(){//StudentRepository studentRepository) {
        this.studentRepository = StudentServiceImpl.studentRepository;
    }

    public static StudentService getService(){
        if(service == null){
            service = new StudentServiceImpl();
        }

        return service;
    }

    @Override
    public Student save(Student student) {
        return this.studentRepository.save(student);
    }

    @Override
    public Optional<Student> read(Student student) {
        return this.studentList
                .stream()
                .filter(a -> a.getStudentID().equals(student))
                .findFirst();
    }

    @Override
    public void delete(Student student) {
        this.studentRepository.delete(student.getStudentID());
    }

    @Override
    public List<Student> readAll() {
        return this.studentRepository.readAll();
    }

    @Override
    public List<Student> studentLastNameByCountryId(String countryId){
        List<StudentAddress> studAddr = this.studentAddressRepository.readAll();
        List<Student> newStud = this.studentRepository.readAll();
        //studentList
        for(StudentAddress stud : studAddr){
            if(stud.getAddress().getCity().getCountry().getCountryID().equals(countryId)){
                if(newStud.contains(stud)) {
                    return newStud.stream().findAny().stream().toList();
                }
            }
        }

        return studentList;
    }

    public List<Student> get(Country country) {
        return studentList;
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
