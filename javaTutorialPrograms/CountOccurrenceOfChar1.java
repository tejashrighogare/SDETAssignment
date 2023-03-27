package Occurances;

public class CountOccurrenceOfChar1 {

    public static void main(String[] args) {
        boolean result = sameOccurrence_new("abcdabcd");

        if (result == false)
            System.out.println("All characters not having equal number of occurances");

        else
            System.out.println("All characters having equal number of occurances");
    }

    public static boolean sameOccurrence_new(String inputString) {
        boolean result = true;
        int firstOccCount = 1;

        for (int cntr = 0; cntr < inputString.length(); cntr++) {
            char c = inputString.charAt(cntr);
            int tempOccCount = 1;
            for (int i = 0; i < inputString.length(); i++) {
                if (cntr == i)
                    continue;
                if (c == inputString.charAt(i)) {
                    if (cntr == 0) {
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


