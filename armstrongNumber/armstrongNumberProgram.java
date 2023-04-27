package armstrongNumber;

public class ArmstrongNumberProgram {
    public static void isArmstrong(int number) {
        int originalNumber, remainder, result = 0;
        originalNumber = number;
        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += remainder * remainder * remainder;
            originalNumber /= 10;
        }
        if (result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }

    public static void main(String args[]) {
        int number = 407;
        isArmstrong(number);
        number = 131;
        isArmstrong(number);
    }
}