import java.util.Random;

public class PasswordGenerator {

    private static final char[] POSSIBILE_CHARS = {

            'a', 'b',
    };
    public static String generate() {
        String passwordCandidate;
        do {
            char[] chars = new char[8];
            for (int i = 0; i < chars.length; i++) {
                int charIndex = new Random().nextInt(POSSIBILE_CHARS.length-1);
                chars[i] = POSSIBILE_CHARS[charIndex];
            }
            passwordCandidate = new String(chars);
        } while (!PasswordValidation.isSafe(passwordCandidate));
        return passwordCandidate;


    }
}
