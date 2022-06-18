package za.ac.cput.Repository.Interface.Impl;

import org.springframework.stereotype.Repository;
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

@Repository
public class NameRepositoryImpl implements NameRepository {

    private final List<Name> names;
    private static NameRepository nameRepository = null;

    public NameRepositoryImpl() {
        this.names = new ArrayList<>();
    }

    public static NameRepository getNameRepository() {
        if (nameRepository == null)
            nameRepository = new NameRepositoryImpl();

        return nameRepository;
    }

    @Override
    public Name save(Name name) {
        this.names.add(name);
        return name;
    }

    @Override
    public Optional<Name> read(String s) {
        return this.names.stream()
                .filter(n -> n.getCompositeId().equalsIgnoreCase(s))
                .findAny().or(null);
    }

    @Override
    public void delete(String s) {
        Optional<Name> name = read(s);
        this.names.remove(name);
    }

    @Override
    public List<Name> readAll() {
        return this.names;
    }
}
