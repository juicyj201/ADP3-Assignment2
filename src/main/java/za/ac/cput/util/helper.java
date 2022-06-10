package za.ac.cput.util;

/**
 *
 * Keziah Robinson
 * 219113149
 * helper Class
 *
 */

import org.apache.commons.validator.routines.EmailValidator;

import java.util.UUID;

public class helper {

        public static boolean isNullorEmpty(String x) {
            return ( x == null || x.equals("") || x.equalsIgnoreCase(""));
        }

        public static boolean isValidEmail(String email){
            EmailValidator emailValidator = EmailValidator.getInstance();
            return emailValidator.isValid(email);
        }

    //Generate unique key for studentID
    public static String generateStudentID(){
        return UUID.randomUUID().toString();
    }

    }

