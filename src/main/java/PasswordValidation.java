public class PasswordValidation {
    public static boolean isAtleast8CharactersLong(String password) {
       return password.length() >= 8;
    }

    public static boolean containsDigit(String password) {
        return password.matches(".*[0-9].*");

    }

    public static boolean containsLowerAndUppercaseCharacters(String password) {
        char[] chars = password.toCharArray();

        boolean lowerCaseCharacterFound = false;
        boolean upperCaseCharacterFound = false;

        for (char aChar : chars) {
            if(Character.isLowerCase(aChar)) {
                lowerCaseCharacterFound = true;
            }else if(Character.isUpperCase(aChar)) {
                upperCaseCharacterFound = true;
            }
            if(upperCaseCharacterFound && lowerCaseCharacterFound) {
                return true;
            }
            
        }
        return false;
    }
}
