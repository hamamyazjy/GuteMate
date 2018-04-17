package com.example.hema.grubmate2.TestUtils;

import java.util.regex.Pattern;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

/**
 * Created by Hema on 4/13/2018.
 */

public class LoginUtils {
    /**
     *
     * @param Email
     * @return
     */
    public static boolean isValidEmail(String Email){
        boolean hasAtsign;
              if(  hasAtsign =    EMAIL_PATTERN.matcher(Email).matches()){}
          return hasAtsign;

    }

    public static boolean isValidPhone(String Phone){

        boolean hasAtsign2 = PHONE_PATTERN.matcher(Phone).matches();
        return hasAtsign2;
            }

            public static boolean isValidName(String Name){
                boolean hasAtsign3 = Name_PATTERN.matcher(Name).matches();
                return hasAtsign3;
            }
    public static boolean isValidID(String ID){
        boolean hasAtsign3 = ID_PATTERN.matcher(ID).matches();
        return hasAtsign3;
    }
    public static boolean isValidPassword(String Password){
        boolean hasAtsign3 = Password_PATTERN.matcher(Password).matches();
        return hasAtsign3;
    }


    public static final Pattern EMAIL_PATTERN = Pattern.compile(
            "[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}" +
                    "\\@" +
                    "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" +
                    "(" +
                    "\\." +
                    "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25}" +
                    ")+"
    );

    public static final Pattern PHONE_PATTERN = Pattern.compile(
            "[0-9]{10}");

    public static final Pattern Name_PATTERN = Pattern.compile(
            "^[a-zA-Z\\s]+");


    public static final Pattern ID_PATTERN = Pattern.compile(
            "[0-9]{9}");
    public static final Pattern Password_PATTERN = Pattern.compile(
            "[a-zA-Z0-9]{0,25}");







}

