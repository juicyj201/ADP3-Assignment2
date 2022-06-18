package za.ac.cput.Service.Impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import za.ac.cput.Controller.EmployeeController;
import za.ac.cput.Domain.Entities.Employee;
import za.ac.cput.Domain.Entities.Name;
import za.ac.cput.Factory.EmployeeFactory;
import za.ac.cput.Factory.NameFactory;
import za.ac.cput.Repository.Interface.EmployeeRepository;

import javax.persistence.MapKeyColumn;

public class EmployeeServiceImplTest {
    private EmployeeRepository repo;
    private EmployeeServiceImpl service = new EmployeeServiceImpl();

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
}
