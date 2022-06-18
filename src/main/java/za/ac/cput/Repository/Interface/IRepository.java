package za.ac.cput.Repository.Interface;

import org.springframework.data.repository.*;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Joshua Julies
 * 220102473
 *
 *  Question 3
 **/

public interface IRepository<T, ID>{
    T save(T entity);
    Optional<T> read(ID id);
    List<T> readAll();
    void delete(T entity);
}
