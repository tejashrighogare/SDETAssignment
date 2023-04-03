package occurances;
public class Fibonacci {
    //Write program for fibonacci series
    public static void main(String[] args) {
        int number = 6;
        fibonacciSeries(number);
    }
    public static void fibonacciSeries(int number) {
        int firstNumber = 0, secondNumber = 1, nextNumber;
        System.out.println("Fibonacci series is ");
        for (int count = 0; count < number; count++) {
            if (count <= 1)
                nextNumber = count;
            else {
                nextNumber = firstNumber + secondNumber;
                firstNumber = secondNumber;
                secondNumber = nextNumber;
            }
            System.out.println(nextNumber);
        }
    }
}