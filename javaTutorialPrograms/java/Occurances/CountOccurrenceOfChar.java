package Occurances;
public class CountOccurrenceOfChar {
    //Write a prgram to find the character occurances of given string
    public static void main(String[] args) {
        boolean result = sameOccurrence_new("abcdabcd");
        if (result == true)
            System.out.println("All characters having equal number of occurances");
        else
            System.out.println("All characters not having equal number of occurances");
    }
    public static boolean sameOccurrence_new(String inputString) {
        boolean result = true;
        int firstOccCount = 1;
        for (int counter = 0; counter < inputString.length(); counter++) {
            char c = inputString.charAt(counter);
            int tempOccCount = 1;
            for (int i = 0; i < inputString.length(); i++) {
                if (counter == i)
                    continue;
                if (c == inputString.charAt(i)) {
                    if (counter == 0) {
                        firstOccCount++;
                    }
                    tempOccCount++;
                }
            }
            if (firstOccCount != tempOccCount) {
                result = false;
                return result;
            }
        }
        return result;
    }
}


