package za.ac.cput.Repository.Implementation;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import za.ac.cput.Domain.Entities.Name;
import za.ac.cput.Repository.Interface.NameRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Matthew Jones
 * 220077681
 * Question 3
 */

public class NameRepositoryImpl implements NameRepository
{
    private final List<Name> nameList;
    private static NameRepositoryImpl nameRepo;

    private NameRepositoryImpl(){
        this.nameList = new ArrayList<>();
    }

    public static NameRepositoryImpl nameRepository(){
        if (nameRepo == null)
            nameRepo = new NameRepositoryImpl();
        return nameRepo;
    }

    public Name save(Name name){
        Optional<Name> read = read(name.getCompositeId());
        if(read.isPresent()){
            delete(read.get());
        }
        this.nameList.add(name);
        return name;
    }

    public Optional<Name> read(String id)
    {
        return this.nameList.stream().filter(name -> name.getCompositeId().equalsIgnoreCase(id))
                .findFirst();
    }

    @Override
    public void delete(Name name)
    {
        this.nameList.remove(name);
    }

    @Override
    public List<Name> findAll() {
        return this.nameList;
    }

    @Override
    public List<Name> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Name> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Name> findAllById(Iterable<String> strings) {
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
    public void deleteAll(Iterable<? extends Name> entities) {

    }

    @Override
    public void deleteAll() {

    }


    @Override
    public <S extends Name> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Name> findById(String s) {
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
    public <S extends Name> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Name> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Name> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<String> strings) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Name getOne(String s) {
        return null;
    }

    @Override
    public Name getById(String s) {
        return null;
    }

    @Override
    public Name getReferenceById(String s) {
        return null;
    }

    @Override
    public <S extends Name> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Name> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Name> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Name> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Name> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Name> boolean exists(Example<S> example) {
        return false;
    }
}
