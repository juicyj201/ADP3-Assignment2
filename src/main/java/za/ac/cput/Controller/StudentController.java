package za.ac.cput.Controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    /**private StudentServiceImpl service;

     @Autowired
     public StudentController(StudentServiceImpl service){
     this.service = service;
     }

     @PostMapping("save")
     private Student save(Student student){
     return this.service.save(student);
     }

     @GetMapping("read/{student}")
     private Optional<Student> read(@PathVariable Student student){
     return this.service.read(student);
     }

     @GetMapping("readAll")
     private List<Student> readAll(){
     return this.service.readAll();
     }

     @DeleteMapping("delete")
     private void delete(@PathVariable Student student){
     this.service.delete(student);
     }

     @GetMapping("getCities/{countryId}")
     public List<String> getStudentLastNameByCountry(@PathVariable String countryId){
        //This is a method that is static and can be called from within the StudentServiceImpl class.
        //The method returns a list of student last names, instead of student objects. It is almost
        //exactly the same as the read but is static.

        return StudentServiceImpl.getStudentLastNameByCountryId(countryId);
     }

     **/
}
