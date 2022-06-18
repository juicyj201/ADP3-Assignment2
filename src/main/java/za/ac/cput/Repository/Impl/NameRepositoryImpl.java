package za.ac.cput.Repository.Impl;

import za.ac.cput.Domain.Entities.Name;
import za.ac.cput.Repository.Interface.NameRepository;
import java.util.ArrayList;
import java.util.List;

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
    public Name create(Name name) {
        this.names.add(name);
        return name;
    }

    @Override
    public Name read(String s) {
        return this.names.stream()
                .filter(n -> n.getCompositeId().equalsIgnoreCase(s))
                .findAny().orElse(null);
    }

    @Override
    public Name update(Name name) {
        Name n = read(name.getCompositeId());
        if (n != null) {
            Name updated = new Name.NameBuilder().copy(n)
                    .setFirstName(name.getFirstName())
                    .setLastName(name.getLastName())
                    .build();
            delete(n.getCompositeId());
            this.names.add(updated);
            n = updated;
        }
        return n;
    }

    @Override
    public void delete(String s) {
        Name name = read(s);
        this.names.remove(name);
    }

    @Override
    public List<Name> getAll() {
        return this.names;
    }
}
