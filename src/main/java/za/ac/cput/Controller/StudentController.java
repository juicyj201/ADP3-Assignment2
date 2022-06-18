package za.ac.cput.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("school-management/student")
public class StudentController {
    /**private final StudentServiceImpl service;

     @Autowired
     public StudentController(StudentServiceImpl service){
     this.service = service;
     }

     @PostMapping("save")
     private ResponseEntity<StudentRepositoryImpl> save(StudentRepositoryImpl student){
     StudentRepositoryImpl save = service.save(student);
     return ResponseEntity.ok(save);
     }

     @GetMapping("read/{student}")
     private ResponseEntity<StudentRepositoryImpl> read(@PathVariable StudentRepositoryImpl student){
     StudentRepositoryImpl stud = this.service.read(student)
     .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
     return ResponseEntity.ok(stud);
     }

     @GetMapping("readAll")
     private ResponseEntity<List<StudentRepositoryImpl>> readAll(){
     List<StudentRepositoryImpl> studList = this.service.readAll();
     return ResponseEntity.ok(studList);
     }

     @DeleteMapping("delete")
     private ResponseEntity<Void> delete(@PathVariable StudentRepositoryImpl student){
     Optional<StudentRepositoryImpl> stud = this.service.read(student);
     if(stud.isPresent() == true) {
     this.service.delete(stud.get());
     }

     return ResponseEntity.noContent().build();
     }

     @GetMapping("getCities/{countryId}")
     public ResponseEntity<List<String>> getStudentLastNameByCountry(@PathVariable String countryId){
        //This is a method that is static and can be called from within the StudentServiceImpl class.
        //The method returns a list of student last names, instead of student objects. It is almost
        //exactly the same as the read but is static.

        List<String> studNames = StudentServiceImpl.getStudentLastNameByCountryId(countryId);
          return ResponseEntity.ok(studNames);
     }

     **/
}
