package fibonicciSeries;

public class FibonicciSeriesProgram {
    private static int firstNumber = 0;
    private static int secondNumber = 1;
    private static int nextNumber = 0;

    public static void main(String args[]) {
        System.out.print(firstNumber + " " + secondNumber);
        fibonacciSeries(10);
    }

    public static void fibonacciSeries(int count) {
        if (count > 0) {
            nextNumber = firstNumber + secondNumber;
            System.out.print(" " + nextNumber);
            firstNumber = secondNumber;
            secondNumber = nextNumber;
            fibonacciSeries(count - 1);
        }
    }
}