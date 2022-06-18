package za.ac.cput.Repository.Impl;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import za.ac.cput.Domain.Entities.Address;
import za.ac.cput.Repository.Interface.AddressRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AddressRepositoryImpl implements AddressRepository {
    private List<Address> addressList;
    private static AddressRepository repo;

    private AddressRepositoryImpl() {
        this.addressList = new ArrayList<>();
    }

    public static AddressRepository getAddressRepository() {
        if (repo == null) {
            repo = new AddressRepositoryImpl();
            return repo;
        }

        return null;
    }

    @Override
    public Address save(Address address) {
        Optional<Address> read = read(address.getCompositeId());

        if(read.isPresent()) {
            delete(read.get());
        }

        this.addressList.add(address);
        return address;
    }

    @Override
    public Optional<Address> read(String id) {
        return this.addressList
                .stream()
                .filter(a -> a.getCompositeId().equals(id))
                .findFirst();
    }

    @Override
    public List<Address> readAll() {
        return this.addressList.stream().toList();
    }

    @Override
    public void delete(Address address) {
        addressList.remove(address);
    }
}
