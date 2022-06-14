package za.ac.cput;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import za.ac.cput.Domain.Entities.Address;
import za.ac.cput.Domain.Entities.City;
import za.ac.cput.Factory.AddressFactory;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
        SpringApplication.run(ApplicationContext.class);
    }
}
