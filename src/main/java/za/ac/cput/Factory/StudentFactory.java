package za.ac.cput.Factory;

/**
 *
 * Keziah Robinson
 * 219113149
 * StudentRepositoryImpl Factory
 *
 */

import za.ac.cput.Domain.Entities.Address;
import za.ac.cput.Domain.Entities.Student;
import za.ac.cput.util.helper;

public class StudentFactory {

        public static Student createStudent(String studentID, String email, Address address) {

            if (!helper.isValidEmail(email))
                return null;

            if (helper.isNullorEmpty(studentID))
                return null;

            return new Student.StudentBuilder()
                    .setStudentID(studentID)
                    .setEmail(email)
                    .builder();
        }
    }
