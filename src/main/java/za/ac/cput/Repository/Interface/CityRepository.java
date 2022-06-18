package za.ac.cput.Repository.Interface;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.Domain.Entities.City;

import java.util.List;

/*
 *
 * Delron Chad Claassen - 219360561
 * City Repository
 * ++++++++++++++++++++++++++++++++
 *           Question 3
 * ++++++++++++++++++++++++++++++++
 *
 */

public interface CityRepository extends IRepository<City, String> {

    List<City> getall();

}
