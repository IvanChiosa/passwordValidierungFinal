import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PasswordValidationTest {


    @Test
    void isAtLeast8CharactersLong_WhenEmpty_ExpectFalse() {
        //GIVEN
        String password = "";
        //WHEN
        boolean result = PasswordValidation.isAtleast8CharactersLong(password);

        //THEN
        Assertions.assertFalse(result);

    }

    @Test
    void isAtLeast8CharactersLong_When8Characters_ExpectTrue() {
        //GIVEN
        String password = "12345677";
        //WHEN
        boolean result = PasswordValidation.isAtleast8CharactersLong(password);

        //THEN
        Assertions.assertTrue(result);

    }

    @Test
    void isAtLeast8CharactersLong_When7Characters_ExpectFalse() {
        //GIVEN
        String password = "123456789";
        //WHEN
        boolean result = PasswordValidation.isAtleast8CharactersLong(password);

        //THEN
        Assertions.assertTrue(result);

    }

    @Test
    void isAtLeast8CharactersLong_When9Characters_ExpectTrue() {
        //GIVEN
        String password = "123456789";
        //WHEN
        boolean result = PasswordValidation.isAtleast8CharactersLong(password);

        //THEN
        Assertions.assertTrue(result);

    }

    @Test
    void containsDigit_WhenEmpty_ExpectFalse() {
        //GIVEN
        String password = "";
        //WHEN
        boolean result = PasswordValidation.containsDigit(password);

        //THEN
        Assertions.assertFalse(result);

    }

    @Test
    void containsDigit_WhenOneDigit_ExpectTrue() {
        //GIVEN
        String password = "1";
        //WHEN
        boolean result = PasswordValidation.containsDigit(password);

        //THEN
        Assertions.assertTrue(result);

    }

    @Test
    void containsDigit_WhenMixedText_ExpectTrue() {
        //GIVEN
        String password = "nnjfgn123fdjsfjsfh12322";
        //WHEN
        boolean result = PasswordValidation.containsDigit(password);

        //THEN
        Assertions.assertTrue(result);

    }

    @Test
    void containsLowerAndUppercaseCharacters_WhenEmpty_ExpectFalse() {
        //GIVEN
        String password = "";
        //WHEN
        boolean result = PasswordValidation.containsLowerAndUppercaseCharacters(password);

        //THEN
        Assertions.assertFalse(result);

    }

    @Test
    void containsLowerAndUppercaseCharacters_WhenAa_ExpectTrue() {
        //GIVEN
        String password = "Aa";
        //WHEN
        boolean result = PasswordValidation.containsLowerAndUppercaseCharacters(password);

        //THEN
        Assertions.assertTrue(result);

    }

    @Test
    void containsLowerAndUppercaseCharacters_WhenA_ExpectFalse() {
        //GIVEN
        String password = "a";
        //WHEN
        boolean result = PasswordValidation.containsLowerAndUppercaseCharacters(password);

        //THEN
        Assertions.assertFalse(result);

    }

    @Test
    void isWellKnownPassword_WhenEasyPassword_ExpectTrue() {
        //GIVEN
        String password = "123456";
        //WHEN
        boolean result = PasswordValidation.isWellKnowPassword(password);

        //THEN
        Assertions.assertTrue(result);

    }
    @Test
    void isWellKnownPassword_WhenEasyPassword2_ExpectTrue() {
        //GIVEN
        String password = "passwort";
        //WHEN
        boolean result = PasswordValidation.isWellKnowPassword(password);

        //THEN
        Assertions.assertTrue(result);

    }
    @Test
    void isWellKnownPassword_WhenHardPassword_ExpectTrue() {
        //GIVEN
        String password = "jdnjefrfr565dfjdfgbfvh56><>";
        //WHEN
        boolean result = PasswordValidation.isWellKnowPassword(password);

        //THEN
        Assertions.assertFalse(result);

    }
}
