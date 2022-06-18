package za.ac.cput.Service.Impl;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.Domain.Entities.Student;
import za.ac.cput.Domain.Entities.StudentAddress;
import za.ac.cput.Repository.Interface.StudentAddressRepository;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * Keziah Robinson
 * 219113149
 * Student Address Service implementation Test
 *
 */

class StudentAddressServiceImplTest {

    private static StudentAddressRepository studentAddressRepository;
    private List<StudentAddress> studentAddressList;
    private StudentAddressServiceImpl studentAddressService;
    private StudentAddress studentAddress;


    @BeforeEach
    void setUp() {
    }


    @Test
    void save() {
        StudentAddress saved = this.studentAddressService.save(this.studentAddress);
        assertNotNull(saved);
        System.out.println("Student has been saved");
    }

    @Test
    void read() {
        StudentAddress saved = this.studentAddressService.save(this.studentAddress);
        Optional<StudentAddress> read = this.studentAddressService.read(this.studentAddress);
        System.out.println(saved);
    }

    @Test
    void delete() {
        StudentAddress saved = this.studentAddressService.save(this.studentAddress);
        this.studentAddressService.delete(this.studentAddress);
        List<StudentAddress>studentAddressList = this.studentAddressService.get(studentAddress);
        assertEquals(0, studentAddressList.size());
        System.out.println("Student address was deleted");
    }

    @Test
    void getAll() {
        StudentAddress saved = this.studentAddressService.save(this.studentAddress);
        List<StudentAddress>studentAddressList = this.studentAddressService.get(studentAddress);
        assertNotNull(saved);
        System.out.println(studentAddressList);
    }

    @Test
    void readAll() {
        StudentAddress saved = this.studentAddressService.save(this.studentAddress);
        List<StudentAddress> studentAddressList = studentAddressService.readAll();
        assertEquals(0, studentAddressList.size());
        System.out.println(studentAddressList);
    }

    @AfterEach
    void tearDown() {
    }



}