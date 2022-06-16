package za.ac.cput.Factory;

import za.ac.cput.Domain.Entities.Name;
import za.ac.cput.Domain.Entities.Employee;
import za.ac.cput.util.helper;

/**
 * Matthew Jones
 * 220077681
 * Question 2a
 */

public class EmployeeFactory
{
    public static Employee createEmployee(String staffId, String email, Name name) {

        if (helper.isNullorEmpty(staffId))
            return null;

        if (!helper.isValidEmail(email))
            return null;

        return new Employee.EmployeeBuilder()
                .setStaffId(staffId)
                .setEmail(email)
                .setName(name)
                .build();
    }
}
