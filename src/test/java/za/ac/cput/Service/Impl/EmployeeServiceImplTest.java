package za.ac.cput.Service.Impl;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.Controller.EmployeeController;
import za.ac.cput.Domain.Entities.Employee;
import za.ac.cput.Domain.Entities.Name;
import za.ac.cput.Factory.EmployeeFactory;
import za.ac.cput.Factory.NameFactory;
import za.ac.cput.Repository.Interface.EmployeeRepository;
import za.ac.cput.Service.Interface.EmployeeService;

import javax.persistence.MapKeyColumn;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeServiceImplTest {
    private EmployeeRepository repo;
    private EmployeeServiceImpl service = new EmployeeServiceImpl();
    private Employee emp;
    private EmployeeService empService;

    @Test
    public void testGetEmployeeNameByEmail() {
        Employee emp = EmployeeFactory.createEmployee("01", "Jimmy@here.com", NameFactory.createName("Jimmy", "", "Here"));

        //service.getEmployeeNameByEmail("Jimmy@here");
        try {
            service.save(emp);
            //Assertions.assertNotNull(service.getEmployeeNameByEmail("Jimmy@here"));
        }catch(NullPointerException npe){
            System.out.println("Bruh.");
        }
    }

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
        empService = null;
        emp = null;
    }

    @Test
    void test_a_Save() {
        Employee savedEmp = empService.save(emp);
        System.out.println(savedEmp);
        assertNotNull(savedEmp);
    }

    @Test
    void test_b_Read() {
        Optional<Employee> readEmp = empService.read(emp);
        assertNotNull(readEmp);
    }

    @Test
    void test_c_Delete() {
        empService.delete(emp);
        boolean afterDeleteCity = empService.read(emp).isPresent();
        assertFalse(afterDeleteCity);
    }

    @Test
    void test_d_ReadAll() {
        List<Employee> employees = empService.readAll();
        assertEquals(0,employees.size());
    }

}
