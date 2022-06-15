package za.ac.cput.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.Domain.Entities.Address;
import za.ac.cput.Repository.Interface.AddressRepository;
import za.ac.cput.Service.Impl.AddressServiceImpl;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("school-management/address/")
public class AddressController {
    private AddressRepository repo;
    @Autowired
    private AddressServiceImpl service = new AddressServiceImpl(repo);

    @PostMapping("/address")
    private Address save(@RequestBody Address address){
        return this.service.save(address);
    }

    @GetMapping
    private Optional<Address> read(@RequestBody Address address){
        return this.service.read(address);
    }

    @GetMapping("/address")
    private List<Address> readAll(){
        return this.service.readAll();
    }

    @DeleteMapping("/address")
    private void delete(@RequestBody Address address){
        this.service.delete(address);
    }
}
