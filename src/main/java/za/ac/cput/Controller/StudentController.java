package za.ac.cput.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import za.ac.cput.Domain.Entities.Student;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("school-management/student")
public class StudentController {
    /**
    private final StudentServiceImpl service;

     @Autowired
     public StudentController(StudentServiceImpl service){
          this.service = service;
     }

     @PostMapping("save")
     private ResponseEntity<Student> save(Student student){
          Student save = service.save(student);
          return ResponseEntity.ok(save);
     }

     @GetMapping("read/{student}")
     private ResponseEntity<Student> read(@PathVariable Student student){
          Student stud = this.service.read(student)
          .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
          return ResponseEntity.ok(stud);
     }

     @GetMapping("readAll")
     private ResponseEntity<List<Student>> readAll(){
          List<Student> studList = this.service.readAll();
          return ResponseEntity.ok(studList);
     }

     @DeleteMapping("delete")
     private ResponseEntity<Void> delete(@PathVariable Student student){
          Optional<Student> stud = this.service.read(student);
          if(stud.isPresent() == true) {
               this.service.delete(stud.get());
          }

     return ResponseEntity.noContent().build();
     }

     @GetMapping("getCities/{countryId}")
     public ResponseEntity<List<String>> getStudentLastNameByCountry(@PathVariable String countryId){
        List<String> studNames = this.service.getStudentLastNameByCountryId(countryId);
          return ResponseEntity.ok(studNames);
     }
     **/
}
