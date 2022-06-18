package za.ac.cput.Repository.Interface;

import za.ac.cput.Domain.Entities.Student;

import java.util.List;
import java.util.Optional;

/**
 *
 * Keziah Robinson
 * 219113149
 * Student Repository
 *
 */

public interface StudentRepository extends IRepository<Student, String> {
    Student save(Student student);
    Optional<Student> read(String id);
    List<Student> readAll();
    void delete(String id);
}
