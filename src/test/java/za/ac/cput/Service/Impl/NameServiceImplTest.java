package za.ac.cput.Service.Impl;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.Domain.Entities.Name;
import za.ac.cput.Factory.NameFactory;
import za.ac.cput.Service.Interface.NameService;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class NameServiceImplTest {

    private NameService nameService;
    private Name name;

    @BeforeEach
    void setUp() {
        nameService = NameServiceImpl.getService();
        name = NameFactory.createName("Jack", "Danny", "Daniels");
    }

    @AfterEach
    void tearDown() {
        nameService = null;
        name = null;
    }

    @Test
    void test_a_Save() {
        Name savedName = nameService.save(name);
        System.out.println(savedName);
        assertNotNull(savedName);
    }

    @Test
    void test_b_Read() {
        Optional<Name> readName = nameService.read(name);
        assertNotNull(readName);
    }

    @Test
    void test_c_Delete() {
        nameService.delete(name);
        boolean afterDeleteCity = nameService.read(name).isPresent();
        assertFalse(afterDeleteCity);
    }

    @Test
    void test_d_ReadAll() {
        List<Name> names = nameService.readAll();
        assertEquals(0,names.size());
    }
}