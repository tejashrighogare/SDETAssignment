package perfectNumber;

public class PerfectNumberProgram {
    public static long isPerfect(long number) {
        long sumOfNumber = 0;
        for (int index = 1; index <= number / 2; index++) {
            if (number % index == 0) {
                sumOfNumber = sumOfNumber + index;
            }
        }
        return sumOfNumber;
    }

    public static void main(String args[]) {
        long number = 28, total;
        total = isPerfect(number);
        if (total == number)
            System.out.println(number + " is a perfect number");
        else
            System.out.println(number + " is not a perfect number");
    }
}