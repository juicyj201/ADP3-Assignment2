package za.ac.cput.Repository.Interface;

import org.springframework.data.repository.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Joshua Julies
 * 220102473
 *
 *  Question 3
 **/

public interface IRepository<T, ID>{
    T create(T t);
    T read(ID id);
    T update(T t);
    void delete(ID id);
}
