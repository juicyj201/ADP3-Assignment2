package za.ac.cput.Repository.Interface;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.Domain.Entities.City;
import za.ac.cput.Domain.Entities.Country;

import java.util.List;

/*
 *
 * Delron Chad Claassen - 219360561
 * Country Repository
 * ++++++++++++++++++++++++++++++++
 *           Question 3
 * ++++++++++++++++++++++++++++++++
 *
 */

public interface CountryRepository extends IRepository<Country, String> {

    List<Country> getall();

}
