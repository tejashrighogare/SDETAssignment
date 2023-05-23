package checkPalindrome;

public class CheckPalindromeProgram {
    public static void main(String[] args) {
        //Java program to check if the number is palindrome or not.
        int inputNumber = 12321;
        isPalindrome(inputNumber);
        inputNumber = 179;
        isPalindrome(inputNumber);
    }

    public static void isPalindrome(int inputNumber) {
        int palindromeNumber = inputNumber;
        int reverseNumber = 0;
        while (palindromeNumber != 0) {
            int remainder = palindromeNumber % 10;
            reverseNumber = reverseNumber * 10 + remainder;
            palindromeNumber = palindromeNumber / 10;
        }
        if (inputNumber == reverseNumber)
            System.out.println("Number : " + inputNumber + " is a palindrome");
        else
            System.out.println("Number : " + inputNumber + " is not a palindrome");
    }
}