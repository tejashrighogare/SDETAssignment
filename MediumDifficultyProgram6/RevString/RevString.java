package RevString;

public class RevString {
    /*
    Q6. Write a program to reverse the string without changing the position of special character.
 */
    public static void main(String[] args) {
        String result = reverseString("Ro@hitshetty");
        System.out.println(result);
    }

    static String reverseString(String inputString) {
        String result = "";
        int reverseCharacterCounter = 0;
        for (int counter = 0; counter < inputString.length(); counter++) {
            if (!Character.isLetterOrDigit(inputString.charAt(inputString.length() - 1)) && counter == inputString.length() - 1)
                reverseCharacterCounter--;
            char reverseChar = inputString.charAt(inputString.length() - (reverseCharacterCounter + 1));
            if (!Character.isLetterOrDigit(reverseChar)) {
                reverseCharacterCounter++;
                reverseChar = inputString.charAt(inputString.length() - (reverseCharacterCounter + 1));
            }
            char currentCharacter = inputString.charAt(counter);
            String stringValue = Character.toString(reverseChar);
            if (!Character.isLetterOrDigit(currentCharacter)) {
                stringValue = Character.toString(currentCharacter);
                reverseCharacterCounter--;
            }
            result += stringValue;
            reverseCharacterCounter++;
        }
        return result;
    }
}