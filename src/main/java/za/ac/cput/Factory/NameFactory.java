package za.ac.cput.Factory;

import za.ac.cput.Domain.Entities.Name;
import za.ac.cput.util.helper;

/**
 * Matthew Jones
 * 220077681
 * Question 2a
 */

public class NameFactory
{
    public static Name createName(String firstName, String middleName, String lastName) {

        if (helper.isNullorEmpty(firstName))
            return null;

        if (helper.isNullorEmpty(lastName))
            return null;

        return new Name.NameBuilder()
                .setFirstName(firstName)
                .setMiddleName(middleName)
                .setLastName(lastName)
                .build();
    }
}
