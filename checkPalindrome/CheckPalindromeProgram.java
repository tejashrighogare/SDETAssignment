package checkPalindrome;

public class CheckPalindromeProgram {
    public static void main(String[] args) {
        //Java program to check if the number is palindrome or not.
        int inputNumber = 12321, temporaryNumber, finalNumber;
        CheckPalindromeProgram palindromeObject = new CheckPalindromeProgram();
        temporaryNumber = inputNumber;
        finalNumber = palindromeObject.palindromeOrNot(inputNumber);
        if (finalNumber == temporaryNumber)
            System.out.println("Palindrome number ");
        else
            System.out.println("Not a Palindrome number ");
    }

    int sum = 0, remainder;

    int palindromeOrNot(int inputNumber) {
        if (inputNumber != 0) {
            remainder = inputNumber % 10;
            sum = (sum * 10) + remainder;
            inputNumber /= 10;
            palindromeOrNot(inputNumber);
        }
        return sum;
    }
}