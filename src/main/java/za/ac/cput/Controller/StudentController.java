package za.ac.cput.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import za.ac.cput.Domain.Entities.Student;
import za.ac.cput.Repository.Interface.Impl.StudentRepositoryImpl;
import za.ac.cput.Service.Impl.FacadeService;
import za.ac.cput.Service.Impl.StudentServiceImpl;

import java.util.List;
import java.util.Optional;

/**
 *
 * Keziah Robinson
 * 219113149
 * Student Controller
 *
 */

@Controller
@RequestMapping("school-management/student")
public class StudentController {
    private final StudentServiceImpl service;

     @Autowired
     public StudentController(StudentServiceImpl service){
     this.service = service;
     }

     @PostMapping("save")
     private ResponseEntity<Student> save(Student student){
       Student studentToSave = service.save(student);
       return ResponseEntity.ok(studentToSave);
     }

     @GetMapping("read/{student}")
     private ResponseEntity<Student> readById(@PathVariable Student student){
       Student readStudent = this.service.read(student)
        .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
       return ResponseEntity.ok(student);
     }

     @GetMapping("readAll")
     private ResponseEntity<List<Student>> readAll(){
       List<Student> studentList = this.service.readAll();
       return ResponseEntity.ok(studentList);
     }

     @DeleteMapping("delete")
     private ResponseEntity<String> delete(@PathVariable Student student){
       Optional<Student> stud = this.service.read(student);
       if(stud.isPresent() == true) {
        this.service.delete(stud.get());
       }

      return ResponseEntity.noContent().build();
     }

     @GetMapping("getCities/{countryId}")
     public ResponseEntity<List<Student>> getStudentLastNameByCountry(@PathVariable String countryId){
        List<Student> students = FacadeService.getStudentLastNamesByCountryId(countryId);
        return ResponseEntity.ok(students);
     }

}
