package za.ac.cput.Service.Interface;

import org.springframework.stereotype.Service;

import java.security.Provider;
import java.util.List;
import java.util.Optional;

/**
 * Joshua Julies
 * 220102473
 * ----------
 * Question 4
 */

public interface IService<T> extends Service{
    public T save(T entity);
    public Optional<T> read(T entity);
    public void delete(T entity);
    public List<T> readAll();
    //read all uses findall from repo
}
