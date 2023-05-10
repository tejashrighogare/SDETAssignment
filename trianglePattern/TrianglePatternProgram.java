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
        for (int rowsCounter = number - 1; rowsCounter >= 0; rowsCounter--) {
            for (int columnsCounter = 0; columnsCounter <= rowsCounter - 1; columnsCounter++) {
                System.out.print("*" + " ");
            }
            System.out.println("");
        }
    }
}