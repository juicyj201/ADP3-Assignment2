package za.ac.cput.Service.Interface;

import za.ac.cput.Domain.Entities.Student;
import za.ac.cput.Domain.Entities.StudentAddress;

import java.util.List;
import java.util.Optional;

public interface StudentAddressService extends IService<StudentAddress>{
    public StudentAddress save(StudentAddress studentAddress);
    public Optional<StudentAddress> read(StudentAddress studentAddress);
    public void delete(StudentAddress studentAddress);
    public List<StudentAddress> readAll();
}
