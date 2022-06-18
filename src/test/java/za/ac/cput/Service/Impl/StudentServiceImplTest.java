package za.ac.cput.Service.Impl;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.Domain.Entities.Address;
import za.ac.cput.Domain.Entities.City;
import za.ac.cput.Domain.Entities.Country;
import za.ac.cput.Domain.Entities.Student;
import za.ac.cput.Repository.Interface.StudentRepository;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 *
 * Keziah Robinson
 * 219113149
 * Student Service implementation Test
 *
 */

class StudentServiceImplTest {

    private static StudentRepository studentRepository;
    private List<Student> studentList;
    private Address address;
    private StudentServiceImpl studentService;
    private Student student;
    private Country Country;
    private za.ac.cput.Domain.Entities.Country Student;


    @BeforeEach
    void setUp() {
    }

    @Test
    void save() {
        Student saved = this.studentService.save(this.student);
        assertNotNull(saved);
        System.out.println("Student has been saved");
    }

    @Test
    void studentLastNameByCountryId(){
        Student saved = this.studentService.save(this.student);
        Optional<Student> read = this.studentService.read(this.student);
        List<Student>studentList = this.studentService.get(Country);
        System.out.println(studentList);
    }

    @Test
    void read() {
        Student saved = this.studentService.save(this.student);
        Optional<Student> read = this.studentService.read(this.student);
        System.out.println(saved);
    }

    @Test
    void delete() {
        Student saved = this.studentService.save(this.student);
        this.studentService.delete(this.student);
        List<Student>studentList = this.studentService.get(Student);
        assertEquals(0, studentList.size());
        System.out.println("Student was deleted");

    }

    @Test
    void getAll() {
        Student saved = this.studentService.save(this.student);
        List<Student>studentList = this.studentService.get(Student);
        assertNotNull(saved);
        System.out.println(studentList);
    }

    @Test
    void readAll() {
        Student saved = this.studentService.save(this.student);
        List<Student> studentList = studentService.readAll();
        assertEquals(0, studentList.size());
        System.out.println(studentList);
    }

    @Test
    public void testGetNames(){
        Assertions.assertNull(this.studentService.studentLastNameByCountryId("01"));
    }

    @AfterEach
    void tearDown() {
    }


}