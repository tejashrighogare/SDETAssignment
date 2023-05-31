package checkPalindrome;

/**
 * problem statement:
 * Java program to check if the number is palindrome or not.
 */
public class CheckPalindromeProgram {
    private static int inputNumber = 121, temporaryNumber, finalNumber;

    public static void main(String[] args) {
        if (inputNumber < 0) {
            System.out.println("Number is not pallindrome");
            return;
        }
        CheckPalindromeProgram palindromeObject = new CheckPalindromeProgram();
        temporaryNumber = inputNumber;
        finalNumber = palindromeObject.palindromeOrNot(inputNumber);
        if (finalNumber == temporaryNumber)
            System.out.println("Palindrome number ");
        else
            System.out.println("Not a Palindrome number ");
    }

    private int sum = 0, remainder;

    public int palindromeOrNot(int inputNumber) {
        if (inputNumber != 0) {
            remainder = inputNumber % 10;  //rem=1,2,1
            sum = (sum * 10) + remainder;   //sum=1,12,121
            inputNumber /= 10;              //inputnumber=12,1
            palindromeOrNot(inputNumber);
        }
        return sum;
    }
}