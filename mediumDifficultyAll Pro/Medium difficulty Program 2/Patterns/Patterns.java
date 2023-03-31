package Patterns;

public class Patterns {
    /*
     Q2 Java program to print the following pattern
    */
    public static void main(String args[]) {
        patternNo1(4);
    }
    public static void patternNo1(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }
            for (int l = 2; l <= i; l++) {
                System.out.print(l);
            }
        }
    }
}