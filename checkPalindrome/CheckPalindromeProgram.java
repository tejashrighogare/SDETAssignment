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
        int palindrome = inputNumber;
        int reverseNumber = 0;
        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverseNumber = reverseNumber * 10 + remainder;
            palindrome = palindrome / 10;
        }
        if (inputNumber == reverseNumber)
            System.out.println("Number : " + inputNumber + " is a palindrome");
        else
            System.out.println("Number : " + inputNumber + " is not a palindrome");
    }
}