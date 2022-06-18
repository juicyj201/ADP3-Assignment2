package za.ac.cput.Factory;

/**
 *
 * Keziah Robinson
 * 219113149
 * StudentAddress Factory
 *
 */

import za.ac.cput.Domain.Entities.Address;
import za.ac.cput.Domain.Entities.StudentAddress;
import za.ac.cput.util.helper;

public class StudentAddressFactory {
    public static StudentAddress createStudentAddress(String studentID, Address address) {

        if (!helper.isNullorEmpty(studentID))
            return null;

        return new StudentAddress.StudentAddressBuilder()
                .setStudentID(studentID)
                .setAddress(address)
                .builder();
    }
    }



