package za.ac.cput.Repository.Interface;

public interface IRepository<T> {
    public void save(T obj);
    public void read(String id);
    public void update(T obj);
    public boolean delete(T obj);
}
