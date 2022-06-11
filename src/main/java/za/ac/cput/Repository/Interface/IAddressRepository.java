package za.ac.cput.Repository.Interface;

import za.ac.cput.Domain.Entities.Address;

public abstract class IAddressRepository implements IRepository<Address> {
    public void save(Address address){}
    public void read(String id){}
    public void update(Address address){}
    public boolean delete(Address address){return false;}
}
