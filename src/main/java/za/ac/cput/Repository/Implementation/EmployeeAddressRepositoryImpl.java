package za.ac.cput.Repository.Implementation;

import org.springframework.stereotype.Repository;
import za.ac.cput.Domain.Entities.Address;
import za.ac.cput.Domain.Entities.Lookup.EmployeeAddress;
import za.ac.cput.Repository.Interface.EmployeeAddressRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class EmployeeAddressRepositoryImpl implements EmployeeAddressRepository {
    private List<EmployeeAddress> employeeAddressList;
    private static EmployeeAddressRepositoryImpl repo = null;

    private EmployeeAddressRepositoryImpl(){
        employeeAddressList = new ArrayList<>();
    }

    public static EmployeeAddressRepositoryImpl repository(){
        if(repo == null){
            repo = new EmployeeAddressRepositoryImpl();
        }
        return repo;
    }

    @Override
    public EmployeeAddress update(String Id, EmployeeAddress entity) {
        return null;
    }

    @Override
    public <S extends EmployeeAddress> S save(S entity) {
        return null;
    }

    @Override
    public <S extends EmployeeAddress> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<EmployeeAddress> findById(String s) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(String s) {
        return false;
    }

    @Override
    public Iterable<EmployeeAddress> findAll() {
        return null;
    }

    @Override
    public Iterable<EmployeeAddress> findAllById(Iterable<String> strings) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(String s) {

    }

    @Override
    public void delete(EmployeeAddress entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends String> strings) {

    }

    @Override
    public void deleteAll(Iterable<? extends EmployeeAddress> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
