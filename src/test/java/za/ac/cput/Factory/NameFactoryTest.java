package za.ac.cput.Factory;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.Domain.Entities.Name;

/**
 * Matthew Jones
 * 220077681
 * Question 2b
 */

class NameFactoryTest {
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testCreateName()
    {
        Name name = NameFactory.createName("Jack", "Danny", "Daniels");
        System.out.println(name.toString());
        Assertions.assertNotNull(name);
    }
}