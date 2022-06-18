package za.ac.cput.Service.Impl;

import za.ac.cput.Domain.Entities.Name;
import za.ac.cput.Repository.Interface.NameRepository;
import za.ac.cput.Service.Interface.NameService;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Optional;

/**
 * Matthew Jones
 * 220077681
 * Question 4
 */

public class NameServiceImpl implements NameService
{
    private final NameRepository nameRepo;

    public NameServiceImpl(NameRepository nameRepo){
        this.nameRepo = nameRepo;
    }


    @Override
    public Name save(Name name) {
        return this.nameRepo.save(name);
    }

    @Override
    public Optional<Name> read(Name name) {
        return this.nameRepo.read(name.getCompositeId());
    }

    @Override
    public void delete(Name name) {
        this.nameRepo.delete(name.getCompositeId());
    }

    @Override
    public List<Name> readAll() {
        return this.nameRepo.readAll();
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
