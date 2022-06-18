package za.ac.cput.Service.Impl;

import org.springframework.stereotype.Service;
import za.ac.cput.Domain.Entities.Address;
import za.ac.cput.Repository.Interface.Impl.AddressRepositoryImpl;
import za.ac.cput.Repository.Interface.AddressRepository;
import za.ac.cput.Service.Interface.AddressService;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Optional;

/**
 * Joshua Julies
 * 220102473
 * ----------
 * Question 4
 */

@Service
public class AddressServiceImpl implements AddressService {
    private final AddressRepository repo;
    private static AddressService service;

    public AddressServiceImpl(){
        this.repo = AddressRepositoryImpl.getAddressRepository();
    }

    public static AddressService getService(){
        if(service == null){
            service = new AddressServiceImpl();
        }

        return service;
    }

    @Override
    public Address save(Address address) {
        return this.repo.save(address);
    }

    @Override
    public Optional<Address> read(Address address) {
        return this.repo.read(address.getCompositeId());
    }

    @Override
    public void delete(Address address) {
        this.repo.delete(address);
    }

    @Override
    public List<Address> readAll() {
        return this.repo.readAll();
    }

    @Override
    public String value() {
        return null;
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }
}
