package za.ac.cput.Service.Impl;

import org.springframework.stereotype.Service;
import za.ac.cput.Domain.Entities.StudentAddress;
import za.ac.cput.Repository.Interface.StudentAddressRepository;
import za.ac.cput.Service.Interface.StudentAddressService;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Optional;

/**
 *
 * Keziah Robinson
 * 219113149
 * Student Address Service Implementation
 *
 */

@Service
public class StudentAddressServiceImpl implements StudentAddressService {

    public static StudentAddressRepository studentAddressRepo;
    private static StudentAddressService s;
    private List<StudentAddress> studentAddressList;


    public StudentAddressServiceImpl(StudentAddressRepository studAddressRepo) {
        this.studentAddressRepo = studAddressRepo;
    }


    @Override
    public StudentAddress save(StudentAddress studentAddress) {
        return this.studentAddressRepo.save(studentAddress);
    }

    @Override
    public Optional<StudentAddress> read(StudentAddress studentAddress) {
        return this.studentAddressList
                .stream()
                .filter(a -> a.getStudentID().equals(studentAddress))
                .findFirst();
    }

    @Override
    public void delete(StudentAddress studentAddress) {
        this.studentAddressRepo.delete(studentAddress.getStudentID());
    }

    @Override
    public List<StudentAddress> readAll() {
        return this.studentAddressRepo.readAll();
    }

    @Override
    public String value() {
        return null;
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }


    public List<StudentAddress> get(StudentAddress studentAddress) {
        return null;
    }
}
