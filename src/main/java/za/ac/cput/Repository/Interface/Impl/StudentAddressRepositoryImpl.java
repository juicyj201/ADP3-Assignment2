package za.ac.cput.Repository.Interface.Impl;

import org.springframework.stereotype.Repository;
import za.ac.cput.Domain.Entities.StudentAddress;
import za.ac.cput.Repository.Interface.StudentAddressRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 *
 * Keziah Robinson
 * 219113149
 * Student Address Repository Implementation
 *
 */

@Repository
public class StudentAddressRepositoryImpl implements StudentAddressRepository {
    private List<StudentAddress> studentAddressList;
    private static StudentAddressRepository repo;

    private StudentAddressRepositoryImpl() {
        this.studentAddressList = new ArrayList<>();
    }

    public static StudentAddressRepository getStudentRepository() {
        if (repo == null) {
            repo = new StudentAddressRepositoryImpl();
            return repo;
        }

        return null;
    }

    @Override
    public StudentAddress save(StudentAddress studentAddress) {
        Optional<StudentAddress> read = read(studentAddress.getStudentID());

        if(read.isPresent()) {
            delete(read.get().getStudentID());
        }

        this.studentAddressList.add(studentAddress);
        return studentAddress;
    }

    @Override
    public Optional<StudentAddress> read(String id) {
        return this.studentAddressList
                .stream()
                .filter(a -> a.getStudentID().equals(id))
                .findFirst();
    }

    @Override
    public List<StudentAddress> readAll() {
        return this.studentAddressList.stream().toList();
    }

    @Override
    public void delete(String id) {
        studentAddressList.remove(id);
    }
}
