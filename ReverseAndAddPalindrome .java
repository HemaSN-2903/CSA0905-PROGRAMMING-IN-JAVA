import java.util.Scanner;

public class ReverseAndAddPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input: the number
        System.out.print("Enter a number: ");
        int inputNumber = scanner.nextInt();

        // Find and print the palindrome
        int result = findPalindrome(inputNumber);
        System.out.println("Palindrome: " + result);

        // Close the scanner
        scanner.close();
    }

    private static int findPalindrome(int number) {
        int reverse;
        int originalNumber = number;

        do {
            // Reverse the number
            reverse = reverseNumber(number);

            // Add the original and reversed numbers
            number = number + reverse;

            // Check if the result is a palindrome
        } while (!isPalindrome(number));

        return number;
    }

    private static int reverseNumber(int number) {
        int reverse = 0;
        while (number != 0) {
            reverse = reverse * 10 + number % 10;
            number /= 10;
        }
        return reverse;
    }

    private static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reverse = reverseNumber(number);
        return originalNumber == reverse;
    }
}
