package za.ac.cput.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.Domain.Entities.Employee;
import za.ac.cput.Service.Impl.EmployeeServiceImpl;
import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    /**private EmployeeServiceImpl service;

    @Autowired
    public EmployeeController(EmployeeServiceImpl service){
        this.service = service;
    }

    @PostMapping("save")
    private Employee save(Employee employee){
        return this.service.save(employee);
    }

    @GetMapping("read/{employee}")
    private Optional<Employee> read(@PathVariable Employee employee){
        return this.service.read(employee);
    }

    @GetMapping("readAll")
    private List<Employee> readAll(){
        return this.service.readAll();
    }

    @DeleteMapping("delete")
    private void delete(@RequestBody Employee employee){
        this.service.delete(employee);
    }

    @GetMapping("getEmployeeNameByEmail/{employeeEmail}")
    public List<String> getEmployeeNameByEmail(@PathVariable String employeeEmail){
        //This is a method that is static and can be called from within the EmployeeServiceImpl class.
        //The method returns a list of employee names, instead of employee objects. It is almost
        //exactly the same as the read but is static.

        return EmployeeServiceImpl.getEmployeeNameByEmail(employeeEmail);
    }

     @GetMapping("getEmployeeNameByCity/{cityId}")
     public List<String> getEmployeeNameByCity(@PathVariable String cityId){
        //This is a method that is static and can be called from within the EmployeeServiceImpl class.
        //The method returns a list of employee names, instead of employee objects. It is almost
        //exactly the same as the read but is static.

        return EmployeeServiceImpl.getEmployeeNameByCity(cityId);
     }

     **/
}
