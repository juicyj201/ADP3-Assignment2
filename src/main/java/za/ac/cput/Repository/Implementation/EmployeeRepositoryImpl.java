package za.ac.cput.Repository.Implementation;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import za.ac.cput.Domain.Entities.Employee;
import za.ac.cput.Repository.Interface.EmployeeRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Matthew Jones
 * 220077681
 * Question 3
 */

public class EmployeeRepositoryImpl implements EmployeeRepository
{
    private final List<Employee> empList;
    private static EmployeeRepositoryImpl empRepo;

    private EmployeeRepositoryImpl(){
        this.empList = new ArrayList<>();
    }

    public static EmployeeRepositoryImpl empRepository(){
        if (empRepo == null)
            empRepo = new EmployeeRepositoryImpl();
        return empRepo;
    }

    public Employee save(Employee employee){
        Optional<Employee> read = read(employee.getStaffId());
        if(read.isPresent()){
            delete(read.get());
        }
        this.empList.add(employee);
        return employee;
    }

    public Optional<Employee> read(String id)
    {
        return this.empList.stream().filter(name -> name.getStaffId().equalsIgnoreCase(id))
                .findFirst();
    }

    @Override
    public void delete(Employee employee)
    {
        this.empList.remove(employee);
    }

    @Override
    public List<Employee> findAll() {
        return this.empList;
    }

    @Override
    public List<Employee> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Employee> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Employee> findAllById(Iterable<String> strings) {
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
    public void deleteAllById(Iterable<? extends String> strings) {

    }

    @Override
    public void deleteAll(Iterable<? extends Employee> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Employee> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Employee> findById(String s) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(String s) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Employee> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Employee> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Employee> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<String> strings) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Employee getOne(String s) {
        return null;
    }

    @Override
    public Employee getById(String s) {
        return null;
    }

    @Override
    public Employee getReferenceById(String s) {
        return null;
    }

    @Override
    public <S extends Employee> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Employee> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Employee> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Employee> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Employee> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Employee> boolean exists(Example<S> example) {
        return false;
    }
}
