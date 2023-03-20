package Occurances;

public class CountOccurrenceOfChar1 {

    public static void main(String[] args) {
        boolean result = sameOccurrence("abcdabcd");
        if (result == false)

            System.out.println("Characters not having equal no of occurances");

        else
            System.out.println("Characters having equal no of occurances");
    }

    public static boolean sameOccurrence(String s) {// Create an array to count the occurrences of each character
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            count[c - 'a']++;
        }
        // Check if all counts are the same
        int firstCount = -1;
        for (int i = 0; i < 26; i++) {
            if (count[i] > 0) {
                if (firstCount == -1) {
                    firstCount = count[i];
                } else if (count[i] != firstCount) {
                    return false;
                }
            }
        }
        return true;
    }
}
