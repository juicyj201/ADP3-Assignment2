package za.ac.cput.Repository.Interface;

import org.springframework.data.repository.*;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;
import java.util.List;

/**
 * Joshua Julies
 * 220102473
 *
 *  Question 3
 **/

@Repository
public interface IRepository<T> extends CrudRepository<T, String>{
    //methods inheriting from the generic interface will obtain the CrudRepo's methods
    public T update(String Id, T entity);
}
