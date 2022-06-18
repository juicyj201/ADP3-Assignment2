package za.ac.cput.Service.Interface;

import za.ac.cput.Domain.Entities.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService extends IService<Student>{
    public Student save(Student student);
    public Optional<Student> read(Student student);
    public void delete(Student student);
    public List<Student> readAll();
}
