package za.ac.cput.Factory;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.Domain.Entities.Name;

import static org.junit.jupiter.api.Assertions.*;

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