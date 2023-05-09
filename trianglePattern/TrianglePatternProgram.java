package trianglePattern;

public class TrianglePatternProgram {
    public static void main(String[] args) {
        int number = 7;
        trianglePattern(number);
    }

    public static void trianglePattern(int number) {
        for (int rows = 0; rows <= number - 1; rows++) {
            for (int column = 0; column <= rows; column++) {
                System.out.print("*" + " ");
            }
            System.out.println("");
        }
        for (int rows = number - 1; rows >= 0; rows--) {
            for (int column = 0; column <= rows - 1; column++) {
                System.out.print("*" + " ");
            }
            System.out.println("");
        }
    }
}