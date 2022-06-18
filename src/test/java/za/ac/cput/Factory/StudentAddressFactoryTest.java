package za.ac.cput.Factory;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * Keziah Robinson
 * 219113149
 * Student Address Factory Test
 *
 */

class StudentAddressFactoryTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void createInvalidStudentAddress(){

        Exception exception = assertThrows(IllegalArgumentException.class,() ->
                StudentAddressFactory.createStudentAddress("219113149", null));
                String exceptionMessage = exception.getMessage();
                 System.out.println("Field required = " + exceptionMessage);
    }

    @AfterEach
    void tearDown() {
    }
}