package fibonicciSeries;

/**
 * Fibonacci Series program in Java
 */
public class FibonicciSeriesProgram {
    public static void main(String args[]) {
        fibonacciSeries(10);
    }

    public static void fibonacciSeries(int count) {
        int firstNumber = 0, secondNumber = 1, nextNumber, index;
        System.out.print(firstNumber + " " + secondNumber);
        for (index = 2; index < count; ++index) {
            nextNumber = firstNumber + secondNumber;
            System.out.print(" " + nextNumber);
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }
    }
}