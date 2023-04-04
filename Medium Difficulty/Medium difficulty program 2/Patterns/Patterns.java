package patterns;

public class Patterns {
    /*
     Q2 Java program to print the following pattern
    */
    public static void main(String args[]) {
        patternNumber(4);
    }

    public static void patternNumber(int rows) {
        for (int rowCounter = 1; rowCounter <= rows; rowCounter++) {
            for (int spaceCounter = 1; spaceCounter <= rows - rowCounter; spaceCounter++) {
                System.out.print(" ");
            }
            for (int columnCounterLeft = rowCounter; columnCounterLeft >= 1; columnCounterLeft--) {
                System.out.print(columnCounterLeft);
            }
            for (int columnCounterRight = 2; columnCounterRight <= rowCounter; columnCounterRight++) {
                System.out.print(columnCounterRight);
            }
            System.out.print("\n");
        }
    }
}