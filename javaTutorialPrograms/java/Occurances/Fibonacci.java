
package Occurances;
class fibonacci {
    //Write program for fibonacci series
    public static void main(String[] args) {
        int number=6;
        fibonacciSeries(number);
    }
    public static void fibonacciSeries(int number)
    {
        int firstNum=0,secondNum=1,nextNum;
        System.out.println("Fibonacci series is ");
        for (int count = 0; count < number; count++) {
            if (count <= 1)
                nextNum = count;
            else {
                nextNum = firstNum + secondNum;
                firstNum = secondNum;
                secondNum = nextNum;
            }
            System.out.println(nextNum);
        }
    }
}
