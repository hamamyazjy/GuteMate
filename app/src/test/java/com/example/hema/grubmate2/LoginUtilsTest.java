package com.example.hema.grubmate2;

import com.example.hema.grubmate2.TestUtils.LoginUtils;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class LoginUtilsTest {
    private LoginUtils utils ;

    @Before
    public void setUp(){
        utils =new LoginUtils();  }

    @Test
    public void emailValidator_CorrectEmailSimple_ReturnsTrue() throws  Exception {
        assertTrue(utils.isValidEmail("name@email.com"));
    }

    @Test
    public void emailValidator_CorrectEmailSubDomain_ReturnsTrue()  throws  Exception{
        assertTrue(utils.isValidEmail("name@email.co.uk"));
    }
    @Test
    public void emailValidator_InvalidEmailNoTld_ReturnsFalse()  throws  Exception {

        assertFalse(utils.isValidEmail("name@email"));
    }

    @Test
    public void emailValidator_InvalidEmailDoubleDot_ReturnsFalse()  throws  Exception{

        assertFalse(utils.isValidEmail("name@email..com"));
    }

    @Test
    public void emailValidator_InvalidEmailNoUsername_ReturnsFalse()  throws  Exception{

        assertFalse(utils.isValidEmail("@email.com"));
    }

    @Test
    public void emailValidator_EmptyString_ReturnsFalse()  throws  Exception{

            assertFalse(utils.isValidEmail(""));
    }
    @Test
    public void PhoneValid()  throws  Exception{

        assertTrue(utils.isValidPhone("0592198450"));
    }

    @Test
    public void PhoneNotValid()  throws  Exception{

         assertFalse("Error Phone Number",utils.isValidPhone("059219845_"));
    }
    @Test
    public void PhoneNotValidOverTenNumber()  throws  Exception{

        assertFalse("Error Phone Number over 10 number",utils.isValidPhone("05921984591"));
    }
    @Test
    public void NameValid()  throws  Exception{

        assertTrue( utils.isValidName("Hamam Yazjy"));
    }
    @Test
    public void NameNotValid_Nodigit()  throws  Exception{

        assertFalse( utils.isValidName("Hamam Yazjy9@"));
    }
    @Test
    public void IDvalid()  throws  Exception{

        assertTrue( utils.isValidID("120140883"));
    }
    @Test
    public void IDNotvalid_Short()  throws  Exception{

        assertFalse( utils.isValidID("1201408"));
    }
    @Test
    public void IDNotvalid_NoChar()  throws  Exception{

        assertFalse( utils.isValidID("1201A0833"));
    }
    @Test
    public void Passwordvalid()  throws  Exception{

        assertTrue( utils.isValidPassword("a12a2aa3aa"));
    }













}