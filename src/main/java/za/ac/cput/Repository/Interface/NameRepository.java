package za.ac.cput.Repository.Interface;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.Domain.Entities.Name;

/**
 * Matthew Jones
 * 220077681
 * Question 3
 */

@Repository
public interface NameRepository extends JpaRepository<Name, String> {
}
