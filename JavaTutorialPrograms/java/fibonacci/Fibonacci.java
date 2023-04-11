package fibonacci;

public class Fibonacci {
    //Write program for fibonacci series
    public static void main(String[] args) {
        int number = 6;
        fibonacciSeries(number);
    }

    public static void fibonacciSeries(int number) {
        int firstNumber = 0, secondNumber = 1, nextNumber;
        System.out.println("Fibonacci series is ");
        for (int counter = 0; counter < number; counter++) {
            if (counter <= 1) {
                nextNumber = counter;
            } else {
                nextNumber = firstNumber + secondNumber;
                firstNumber = secondNumber;
                secondNumber = nextNumber;
            }
            System.out.println(nextNumber);
        }
    }
}