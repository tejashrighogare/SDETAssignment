package javaExceptionExample;

public class JavaExceptionExample {
    //Write program for Exceptions
    public static void main(String args[]) {
        functionOfTry(100);
    }

    public static void functionOfTry(int number) {
        try {
            int result = number / 0;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println("rest of the code...");
    }
}