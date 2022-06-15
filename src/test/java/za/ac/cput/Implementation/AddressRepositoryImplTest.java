package za.ac.cput.Implementation;

import org.junit.jupiter.api.Test;
import za.ac.cput.Domain.Entities.Address;
import za.ac.cput.Domain.Entities.City;
import za.ac.cput.Repository.Implementation.AddressRepositoryImpl;

public class AddressRepositoryImplTest {
    private AddressRepositoryImpl repo = AddressRepositoryImpl.repository();
    private City city = null;
    private String compositeId = ("18"+"Berginsin Street"+5000);//+city.toString());
    private Address addr = new Address.AddressBuilder()
                .createUnitNumber("01")
                .createComplexName("Summer Heights")
                .createStreetNumber("18")
                .createStreetName("Berginsin Street")
                .createPostalCode(5000)
                //.createCity(city)
                .build();

    @Test
    public void checkAddressObject() {
        repo.save(addr);

        if (!repo.existsById(compositeId)) {
            System.out.println(repo.findById(compositeId));
            System.out.println("This record does not exist");
            throw new IllegalArgumentException("This doesnt exist");
        } else {
            System.out.println(repo.findById(compositeId));
            System.out.println("This record exists");
        }
    }

    @Test
    public void CheckDeleteAddress(){
        repo.delete(addr);
    }
}
