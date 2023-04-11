package countOccuranceOfChar;

public class CountOccurrenceOfChar {
    //Write a program to find the character occurances of given string
    public static void main(String[] args) {
        boolean result = countOccurrence("abcdabcd");
        if (result == true)
            System.out.println("All characters having equal number of occurances");
        else
            System.out.println("All characters not having equal number of occurances");
    }

    public static boolean countOccurrence(String inputString) {
        boolean result = true;
        int firstCount = 1;
        for (int counter = 0; counter < inputString.length(); counter++) {
            char character = inputString.charAt(counter);
            int tempCount = 1;
            for (int subCounter = 0; subCounter < inputString.length(); subCounter++) {
                if (counter == subCounter)
                    continue;
                if (character == inputString.charAt(subCounter)) {
                    if (counter == 0) {
                        firstCount++;
                    }
                    tempCount++;
                }
            }
            if (firstCount != tempCount) {
                result = false;
                return result;
            }
        }
        return result;
    }
}