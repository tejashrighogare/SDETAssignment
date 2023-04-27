package armstrongNumber;

public class ArmstrongNumberProgram {

    public void isArmstrong(int number) {

        int originalNumber = number, result = 0;
        originalNumber = number;
        while (originalNumber != 0) {
            int remainder = originalNumber % 10;
            result += Math.pow(remainder, String.valueOf(number).length());
            originalNumber /= 10;
        }
        if (result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }

    public static void main(String args[]) {
        ArmstrongNumberProgram armstrongNumberObject = new ArmstrongNumberProgram();
        int number = 407;
        armstrongNumberObject.isArmstrong(number);
        number = 131;
        armstrongNumberObject.isArmstrong(number);
    }
}