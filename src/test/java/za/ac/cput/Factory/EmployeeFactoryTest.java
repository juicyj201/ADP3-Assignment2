package za.ac.cput.Factory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import za.ac.cput.Domain.Entities.Employee;
import za.ac.cput.Domain.Entities.Name;

/**
 * Matthew Jones
 * 220077681
 * Question 2b
 */


public class EmployeeFactoryTest {

    private String staffId = "007";
    private String email = "jamesbond@gmail.com";
    private Name name = new Name();
    private Employee empTest = new Employee.EmployeeBuilder()
            .setStaffId(staffId)
            .setEmail(email)
            .setName(name)
            .build();

    @Test
    void testEmployeeFactory()
    {
        Assertions.assertEquals(empTest, new EmployeeFactory().createEmployee(staffId, email, name));
    }
}