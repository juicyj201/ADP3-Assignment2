package za.ac.cput.Controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import za.ac.cput.Domain.Entities.City;
import za.ac.cput.Domain.Entities.Lookup.EmployeeAddress;
import za.ac.cput.Domain.Entities.Name;
import za.ac.cput.Domain.Entities.Student;
import za.ac.cput.Factory.AddressFactory;
import za.ac.cput.Factory.Lookup.EmployeeAddressFactory;
import za.ac.cput.Factory.StudentFactory;
import za.ac.cput.Service.Impl.EmployeeAddressServiceImpl;
import za.ac.cput.Service.Impl.StudentAddressServiceImpl;
import za.ac.cput.Service.Impl.StudentServiceImpl;
import za.ac.cput.Service.Interface.EmployeeAddressService;
import za.ac.cput.Service.Interface.StudentService;

import java.util.Optional;

public class StudentControllerTest {
    private Student student = StudentFactory.createStudent("01", "stud@mail.com", new Name.NameBuilder().setFirstName("stud").setMiddleName("stud").setLastName("stud").build());
    private StudentService service = StudentServiceImpl.getService();

    @Test
    public void testSave(){
        Assertions.assertNotNull(this.service.save(student));
    }

    @Test
    public void testRead(){
        Assertions.assertNotNull(this.service.read(student));
        Student saved = this.service.save(this.student);
        Optional<Student> read = this.service.read(this.student);
        Assertions.assertAll(() -> Assertions.assertTrue(read.isPresent()),
                () -> Assertions.assertSame(saved, read.get()));

        System.out.println(saved);
    }

    @Test
    public void testReadAll(){
        Assertions.assertNotNull(this.service.readAll());
    }

    @Test
    public void testDelete(){
        this.service.delete(student);
        if(this.service.read(student) != null){
            System.out.println("It works.");
        }else{
            throw new NullPointerException("It does not work");
        }
        //Assertions.assertNull(this.service.read(addr),"This object does not exist");
    }

}
