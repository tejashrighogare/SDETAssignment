package RevString;

public class RevString {
    /*
    Q6. Write a program to reverse the string without changing the position of special character.
 */
    public static void main(String[] args) {
        String result = Reverse("Ro@hitshetty");
        System.out.println(result);
    }

    static String Reverse(String inputString) {
        String result = "";
        for (int counter = 0; counter < inputString.length(); counter++) {
            char reverseChar = inputString.charAt(inputString.length() - (counter + 1));
            if (!Character.isLetterOrDigit(reverseChar))
                continue;
            char currentCharacter = inputString.charAt(counter);
            if (!Character.isLetterOrDigit(currentCharacter)) {
                reverseChar = inputString.charAt(counter);
            }
            result += reverseChar;
        }
        return result;
    }
}