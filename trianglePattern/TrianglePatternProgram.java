package trianglePattern;

public class TrianglePatternProgram {
    public static void main(String[] args) {
        int number = 7;
        trianglePattern(number);
    }

    public static void trianglePattern(int number) {
        for (int rowCounter = 0; rowCounter <= number - 1; rowCounter++) {
            for (int columnCounter = 0; columnCounter <= rowCounter; columnCounter++) {
                System.out.print("*" + " ");
            }
            System.out.println("");
        }
        for (int rowIndex = number - 1; rowIndex >= 0; rowIndex--) {
            for (int columnIndex = 0; columnIndex <= rowIndex - 1; columnIndex++) {
                System.out.print("*" + " ");
            }
            System.out.println("");
        }
    }
}