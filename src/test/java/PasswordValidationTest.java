import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PasswordValidationTest {


    @Test
    void isAtLeast8CharactersLong_WhenEmpty_ExpectFalse() {
        //GIVEN
         String password =  "";
        //WHEN
       boolean result = PasswordValidation.isAtleast8CharactersLong(password);

        //THEN
        Assertions.assertFalse(result);

    }

    @Test
    void isAtLeast8CharactersLong_When8Characters_ExpectTrue() {
        //GIVEN
        String password =  "12345677";
        //WHEN
        boolean result = PasswordValidation.isAtleast8CharactersLong(password);

        //THEN
        Assertions.assertTrue(result);

    }
    @Test
    void isAtLeast8CharactersLong_When7Characters_ExpectFalse() {
        //GIVEN
        String password =  "123456789";
        //WHEN
        boolean result = PasswordValidation.isAtleast8CharactersLong(password);

        //THEN
        Assertions.assertTrue(result);

    }

    @Test
    void isAtLeast8CharactersLong_When9Characters_ExpectFalse() {
        //GIVEN
        String password =  "123456789";
        //WHEN
        boolean result = PasswordValidation.isAtleast8CharactersLong(password);

        //THEN
        Assertions.assertTrue(result);

    }
}
