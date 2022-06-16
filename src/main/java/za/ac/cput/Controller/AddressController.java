package za.ac.cput.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.Domain.Entities.Address;
import za.ac.cput.Repository.Interface.AddressRepository;
import za.ac.cput.Service.Impl.AddressServiceImpl;

import java.util.List;
import java.util.Optional;

@RestController
public class AddressController {
    private AddressServiceImpl service;

    @Autowired
    public AddressController(AddressServiceImpl service){
        this.service = service;
    }

    @PostMapping("save")
    private Address save(Address address){
        return this.service.save(address);
    }

    @GetMapping("read/{address}")
    private Optional<Address> read(@RequestBody Address address){
        return this.service.read(address);
    }

    @GetMapping("readAll")
    private List<Address> readAll(){
        return this.service.readAll();
    }

    @DeleteMapping("delete")
    private void delete(@RequestBody Address address){
        this.service.delete(address);
    }
}
