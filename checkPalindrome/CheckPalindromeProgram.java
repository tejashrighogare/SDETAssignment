package checkPalindrome;

public class CheckPalindromeProgram {
    //Java program to check if the number is palindrome or not.
    public static void main(String[] args) {
        int inputNumber = 12321, temporaryNumber, finalNumber;
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
            remainder = inputNumber % 10;
            sum = (sum * 10) + remainder;
            inputNumber /= 10;
            palindromeOrNot(inputNumber);
        }
        return sum;
    }
}