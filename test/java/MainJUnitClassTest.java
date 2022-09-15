import org.junit.Test;

import static org.junit.Assert.*;

public class MainJUnitClassTest {

    @Test
    public void givenFirstCharacterUpperCase_whenTested_shouldReturnTrue() {
        MainJUnitClass firstName = new MainJUnitClass();
        boolean result = firstName.checkFirstName("Yash");
        assertTrue(result);
    }

    @Test
    public void givenFirstCharacterUpperCase_whenTestedLastName_shouldReturnTrue() {
        MainJUnitClass firstName = new MainJUnitClass();
        boolean result = firstName.checkFirstName("Gharde");
        assertTrue(result);
    }
    @Test
    public void emailCheck_shouldReturnTrue() {
        MainJUnitClass email = new MainJUnitClass();
        boolean result = email.checkEmail("yashgharde@gmail.com");
        assertTrue(result);
    }
    @Test
    public void mobileNumberFormatCheck_shouldReturnTrue() {
        MainJUnitClass mobileNumber = new MainJUnitClass();
        boolean result = mobileNumber.checkMobileNumber("91 9910313216");
        assertTrue(result);
    }
}
