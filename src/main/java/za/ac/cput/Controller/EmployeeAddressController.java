package za.ac.cput.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import za.ac.cput.Domain.Entities.Lookup.EmployeeAddress;
import za.ac.cput.Service.Impl.EmployeeAddressServiceImpl;
import za.ac.cput.Service.Impl.FacadeService;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("school-management/employeeAddress")
public class EmployeeAddressController {
    private final EmployeeAddressServiceImpl service;

    @Autowired
    public EmployeeAddressController(EmployeeAddressServiceImpl service){
        this.service = service;
    }

    @PostMapping("save")
    public  ResponseEntity<EmployeeAddress> save(EmployeeAddress employeeAddress){
        EmployeeAddress save = service.save(employeeAddress);
        return ResponseEntity.ok(save);
    }

    @GetMapping("read/{employee}")
    public ResponseEntity<EmployeeAddress> read(@PathVariable EmployeeAddress employeeAddress){
        EmployeeAddress empAddress = this.service.read(employeeAddress)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        return ResponseEntity.ok(empAddress);
    }

    @GetMapping("readAll")
    public ResponseEntity<List<EmployeeAddress>> readAll(){
        List<EmployeeAddress> empAddressList = this.service.readAll();
        return ResponseEntity.ok(empAddressList);
    }

    @DeleteMapping("delete")
    public ResponseEntity<Void> delete(@RequestBody EmployeeAddress employeeAddress){
        Optional<EmployeeAddress> emp = this.service.read(employeeAddress);
        if(emp.isPresent() == true) {
            this.service.delete(emp.get());
        }

        return ResponseEntity.noContent().build();
    }

    @GetMapping("getEmployeeNameByCity/{cityId}")
    public ResponseEntity<String> getEmployeeNameByCity(@PathVariable String cityId){
        String empNames = FacadeService.getEmployeeNameByCity(cityId);
        return ResponseEntity.ok(empNames);
    }
}
