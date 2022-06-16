package za.ac.cput.Service.Interface;

import za.ac.cput.Domain.Entities.Name;
import za.ac.cput.Repository.Interface.NameRepository;

import java.util.List;
import java.util.Optional;

/**
 * Matthew Jones
 * 220077681
 * Question 4
 */

public interface NameService extends IService<Name>
{
    @Override
    Name save(Name entity);

    @Override
    Optional<Name> read(Name entity);

    @Override
    void delete(Name entity);

    @Override
    List<Name> readAll();
}
