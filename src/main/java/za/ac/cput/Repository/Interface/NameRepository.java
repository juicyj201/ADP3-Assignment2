package za.ac.cput.Repository.Interface;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.Domain.Entities.Lookup.EmployeeAddress;
import za.ac.cput.Domain.Entities.Name;

import java.util.List;
import java.util.Optional;

/**
 * Matthew Jones
 * 220077681
 * Question 3
 */

@Repository
public interface NameRepository extends IRepository<Name, String> {
    Name save(Name name);
    Optional<Name> read(String id);
    List<Name> readAll();
    void delete(String id);
}
