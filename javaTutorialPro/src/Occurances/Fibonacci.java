//Write program for fibonacci series
package Occurances;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner scannerobj = new Scanner(System.in);
        System.out.println("enter number of terms");
        int number = scannerobj.nextInt();
        int firstnum = 0, secondnum = 1, nextTerm;
        System.out.println("Fibonacci series is ");
        for (int c = 0; c < number; c++) {
            if (c <= 1)
                nextTerm = c;
            else {
                nextTerm = firstnum + secondnum;
                firstnum = secondnum;
                secondnum = nextTerm;
            }
            System.out.println(nextTerm);
        }
    }

}
