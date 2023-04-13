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
        for (int counter = 0; counter < inputString.length(); counter++) {
            char reverseChar = inputString.charAt(inputString.length() - (counter + 1));
            if (!Character.isLetterOrDigit(reverseChar)) {
                continue;
            }
            char currentCharacter = inputString.charAt(counter);
            String stringValue=Character.toString(reverseChar);
            if (!Character.isLetterOrDigit(currentCharacter)) {
                stringValue = inputString.charAt(counter)+ stringValue;
            }
            result += stringValue;
        }
        return result;
    }
}
