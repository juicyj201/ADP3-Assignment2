package za.ac.cput.Repository.Interface;

import za.ac.cput.Domain.Entities.Student;
import za.ac.cput.Domain.Entities.StudentAddress;

import java.util.List;
import java.util.Optional;

public interface StudentAddressRepository extends IRepository<StudentAddress, String>{
    StudentAddress save(StudentAddress studentAddress);
    Optional<StudentAddress> read(String id);
    List<StudentAddress> readAll();
    void delete(String id);
}
