package za.ac.cput.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import za.ac.cput.Domain.Entities.Address;
import za.ac.cput.Domain.Entities.Employee;
import za.ac.cput.Service.Impl.AddressServiceImpl;
import za.ac.cput.Service.Impl.EmployeeServiceImpl;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("school-management/employee")
public class EmployeeController {
    private final EmployeeServiceImpl service;

    @Autowired
    public EmployeeController(EmployeeServiceImpl service){
        this.service = service;
    }

    @PostMapping("save")
    public  ResponseEntity<Employee> save(Employee employee){
    Employee save = service.save(employee);
    return ResponseEntity.ok(save);
    }

    @GetMapping("read/{employee}")
    public ResponseEntity<Employee> read(@PathVariable Employee employee){
    Employee emp = this.service.read(employee)
    .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    return ResponseEntity.ok(emp);
    }

    @GetMapping("readAll")
    public ResponseEntity<List<Employee>> readAll(){
    List<Employee> empList = this.service.readAll();
    return ResponseEntity.ok(empList);
    }

    @DeleteMapping("delete")
    public ResponseEntity<Void> delete(@RequestBody Employee employee){
    Optional<Employee> emp = this.service.read(employee);
    if(emp.isPresent() == true) {
    this.service.delete(emp.get());
    }

    return ResponseEntity.noContent().build();
    }

    @GetMapping("getEmployeeNameByEmail/{employeeEmail}")
    public ResponseEntity<String> getEmployeeNameByEmail(@PathVariable String employeeEmail){
        String name = this.service.getEmployeeNameByEmail(employeeEmail);
        return ResponseEntity.ok(name);
    }

}
