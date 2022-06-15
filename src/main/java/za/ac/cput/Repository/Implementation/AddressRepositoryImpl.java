package za.ac.cput.Repository.Implementation;

import org.springframework.stereotype.Repository;
import za.ac.cput.Domain.Entities.Address;
import za.ac.cput.Repository.Interface.AddressRepository;

import javax.persistence.Id;
import java.util.*;

/**
 * Joshua Julies
 * 220102473
 *
 *  Question 3
 **/

@Repository
public class AddressRepositoryImpl implements AddressRepository {
    private List<Address> addressList;
    private static AddressRepositoryImpl repo = null;

    private AddressRepositoryImpl(){
        addressList = new ArrayList<>();
    }

    public static AddressRepositoryImpl repository(){
        if(repo == null){
            repo = new AddressRepositoryImpl();
        }
        return repo;
    }

    @Override
    public <S extends Address> S save(S address) {
        Optional<S> read = read(address.getCompositeId().toString());

        if(read.isPresent()){
            delete(read.get());
        }

        this.addressList.add(address);
        return address;
    }

    private <S extends Address> Optional<S> read(String compositeId) {
        return (Optional<S>) this.addressList
                .stream()
                .filter(g -> g.getCompositeId().equalsIgnoreCase(compositeId))
                .findFirst();
    }

    @Override
    public <S extends Address> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Address> findById(String compositeId) {
        return this.addressList
                .stream()
                .filter(g -> g.getCompositeId().equals(compositeId))
                .findFirst();
    }

    @Override
    public boolean existsById(String compositeId) {
        if(this.addressList
                .stream()
                .filter(g -> g.getCompositeId().equals(compositeId))
                .findFirst() != null){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public Iterable<Address> findAll() {
        return null;
    }

    @Override
    public Iterable<Address> findAllById(Iterable<String> compositeIds) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(String compositeId) {

    }

    @Override
    public void delete(Address entity) {
        this.addressList.remove(entity);
        if(findById(entity.getCompositeId()) != null){
            throw new IllegalStateException("There should not be an object returned or found within the list, since it has been deleted.");
        }
    }

    @Override
    public void deleteAllById(Iterable<? extends String> compositeIds) {

    }

    @Override
    public void deleteAll(Iterable<? extends Address> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public Address update(String compositeId, Address entity) {
        return this.addressList.set(Integer.parseInt(compositeId), entity);
    }
}
