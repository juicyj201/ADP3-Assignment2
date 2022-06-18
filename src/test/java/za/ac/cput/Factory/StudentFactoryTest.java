package za.ac.cput.Factory;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.Domain.Entities.Student;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * Keziah Robinson
 * 219113149
 * Student Factory Test
 *
 */

class StudentFactoryTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void createValidStudent(){
        Student student = StudentFactory.createStudent("219113149", "219113149@mycput.ac.za", null);
        assertNotNull(student);
    }

    @Test
    void createInvalidStudent(){

        Exception exception = assertThrows(IllegalArgumentException.class,() ->
                StudentFactory.createStudent("21911349", "219113149@mycput.ac.za", null));
        String exceptionMessage = exception.getMessage();
        System.out.println("Field required = " + exceptionMessage);
    }

    @AfterEach
    void tearDown() {
    }
}