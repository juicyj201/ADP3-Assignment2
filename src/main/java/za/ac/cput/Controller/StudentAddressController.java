package za.ac.cput.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import za.ac.cput.Domain.Entities.Student;
import za.ac.cput.Domain.Entities.StudentAddress;
import za.ac.cput.Repository.Interface.Impl.StudentRepositoryImpl;
import za.ac.cput.Service.Impl.StudentAddressServiceImpl;
import za.ac.cput.Service.Impl.StudentServiceImpl;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("school-management/student")
public class StudentAddressController {
    private final StudentAddressServiceImpl service;

    @Autowired
    public StudentAddressController(StudentAddressServiceImpl service){
        this.service = service;
    }

    @PostMapping("save")
    private ResponseEntity<StudentAddress> save(StudentAddress studentAddress){
        StudentAddress studentAddressToSave = service.save(studentAddress);
        return ResponseEntity.ok(studentAddressToSave);
    }

    @GetMapping("read/{student}")
    private ResponseEntity<StudentAddress> readById(@PathVariable StudentAddress studentAddress){
        StudentAddress readStudentAddress = this.service.read(studentAddress)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        return ResponseEntity.ok(studentAddress);
    }

    @GetMapping("readAll")
    private ResponseEntity<List<StudentAddress>> readAll(){
        List<StudentAddress> studentAddressList = this.service.readAll();
        return ResponseEntity.ok(studentAddressList);
    }

    @DeleteMapping("delete")
    private ResponseEntity<String> delete(@PathVariable StudentAddress studentAddress){
        Optional<StudentAddress> studAdd = this.service.read(studentAddress);
        if(studAdd.isPresent() == true) {
            this.service.delete(studAdd.get());
        }
        return ResponseEntity.noContent().build();
    }


}
