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
        for (int rowindex = number - 1; rowindex >= 0; rowindex--) {
            for (int columnindex = 0; columnindex <= rowindex - 1; columnindex++) {
                System.out.print("*" + " ");
            }
            System.out.println("");
        }
    }
}