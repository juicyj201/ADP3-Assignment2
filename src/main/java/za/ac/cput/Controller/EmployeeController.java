package za.ac.cput.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.Domain.Entities.Address;
import za.ac.cput.Service.Impl.AddressServiceImpl;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("school-management/employee")
public class EmployeeController {
    /**
    private final EmployeeServiceImpl service;

    @Autowired
    public EmployeeController(EmployeeServiceImpl service){
        this.service = service;
    }

    @PostMapping("save")
    private ResponseEntity<Employee> save(Employee employee){
    Employee save = service.save(employee);
    return ResponseEntity.ok(save);
    }

    @GetMapping("read/{employee}")
    private ResponseEntity<Employee> read(@PathVariable Employee employee){
    Employee emp = this.service.read(address)
    .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    return ResponseEntity.ok(emp);
    }

    @GetMapping("readAll")
    private ResponseEntity<List<Employee>> readAll(){
    List<Employee> empList = this.service.readAll();
    return ResponseEntity.ok(empList);
    }

    @DeleteMapping("delete")
    private ResponseEntity<Void> delete(@RequestBody Employee employee){
    Optional<Employee> emp = this.service.read(employee);
    if(emp.isPresent() == true) {
    this.service.delete(emp.get());
    }

    return ResponseEntity.noContent().build();
    }

    @GetMapping("getEmployeeNameByEmail/{employeeEmail}")
    public ResponseEntity<List<String>> getEmployeeNameByEmail(@PathVariable String employeeEmail){
        //This is a method that is static and can be called from within the EmployeeServiceImpl class.
        //The method returns a list of employee names, instead of employee objects. It is almost
        //exactly the same as the read but is static.

        List<String> empNames = EmployeeServiceImpl.getEmployeeNameByEmail(employeeEmail);
        return ResponseEntity.ok(empName);
    }

     @GetMapping("getEmployeeNameByCity/{cityId}")
     public ResponseEntity<List<String>> getEmployeeNameByCity(@PathVariable String cityId){
        //This is a method that is static and can be called from within the EmployeeServiceImpl class.
        //The method returns a list of employee names, instead of employee objects. It is almost
        //exactly the same as the read but is static.

        List<String> empNames = EmployeeServiceImpl.getEmployeeNameByCity(cityId);
        return ResponseEntity.ok(empNames);
     }

    **/
}
