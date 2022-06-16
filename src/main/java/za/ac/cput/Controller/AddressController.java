package za.ac.cput.Controller;

import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import za.ac.cput.Domain.Entities.Address;
import za.ac.cput.Service.Impl.AddressServiceImpl;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("school-management/address/")
public class AddressController {
    private final AddressServiceImpl service;

    @Autowired
    public AddressController(AddressServiceImpl service){
        this.service = service;
    }

    @PostMapping("save")
    private ResponseEntity<Address> save(Address address){
        Address save = service.save(address);
        return ResponseEntity.ok(save);
    }

    @GetMapping("read/{address}")
    private ResponseEntity<Address> read(@RequestBody Address address){
        Address addr = this.service.read(address)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        return ResponseEntity.ok(addr);
    }

    @GetMapping("readAll")
    private ResponseEntity<List<Address>> readAll(){
        List<Address> addrList = this.service.readAll();
        return ResponseEntity.ok(addrList);
    }

    @DeleteMapping("delete")
    private ResponseEntity<Void> delete(@RequestBody Address address){
        Optional<Address> addr = this.service.read(address);
        if(addr.isPresent() == true) {
            this.service.delete(addr.get());
        }

        return ResponseEntity.noContent().build();
    }
}
